package dependencyInjection.HW11XML;


public class Player {

    private TennisCoach tennisCoach; //constructor
    private GolfCoach golfCoach; //setter

    //field

    private FootBallCoach footBallCoach;

    //constuctor

    public Player(TennisCoach tennisCoach){
        this.tennisCoach = tennisCoach;
    }

    //setter
    public void setGolfCoach(GolfCoach golfCoach) {
        this.golfCoach = golfCoach;
    }

    public void printThreeSchedule(){
        System.out.println("Tennis Workout: " + tennisCoach.getDailyWorkOutSchedule());
        System.out.println("Golf Workout: " + golfCoach.getDailyWorkOutSchedule());
        System.out.println("Football Workout: " + footBallCoach.getDailyWorkOutSchedule());
    }

    public void setFootBallCoach(FootBallCoach footBallCoach) {
        this.footBallCoach = footBallCoach;
    }
}
