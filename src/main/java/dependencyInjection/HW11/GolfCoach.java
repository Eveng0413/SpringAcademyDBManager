package dependencyInjection.HW11;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach{

    @Override
    public String getDailyWorkOutSchedule() {
        return "Golf Practice";
    }

}
