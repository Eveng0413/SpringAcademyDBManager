package dependencyInjection.HW11;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

    @Override
    public String getDailyWorkOutSchedule() {
        return "Football Practice";
    }
}
