package dependencyInjection.HW11XML;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class TennisCoach implements Coach {

    private List<String> schedules;
    private Random random = new Random();


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
