package dependencyInjection.HW11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

    private TennisCoach tennisCoach; //constructor
    private GolfCoach golfCoach; //setter

    //field
    @Autowired
    private FootBallCoach footBallCoach;

    //constuctor
    @Autowired
    public Player(TennisCoach tennisCoach){
        this.tennisCoach = tennisCoach;
    }

    //setter
    @Autowired
    public void setGolfCoach(GolfCoach golfCoach) {
        this.golfCoach = golfCoach;
    }

    public void printThreeSchedule(){
        System.out.println("Tennis Workout: " + tennisCoach.getDailyWorkOutSchedule());
        System.out.println("Golf Workout: " + golfCoach.getDailyWorkOutSchedule());
        System.out.println("Football Workout: " + footBallCoach.getDailyWorkOutSchedule());
    }
}
