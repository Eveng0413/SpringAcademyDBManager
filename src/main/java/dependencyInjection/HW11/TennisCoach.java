package dependencyInjection.HW11;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Component
public class TennisCoach implements Coach{

    private List<String> schedules;
    private Random random = new Random();

    @PostConstruct
    public void loadSchedules(){
        try{
            schedules = Files.readAllLines(Paths.get("src/main/resources/schedules.txt"));
        }catch (Exception e){
            throw new RuntimeException("Error loading schedules", e);
        }
    }

    @Override
    public String getDailyWorkOutSchedule() {
        if (schedules == null || schedules.isEmpty()) {
            return "Default Tennis Practice";
        }
        return schedules.get(random.nextInt(schedules.size()));
    }
}
