public class RoboticsResult implements IResult{

    RoboticsTeam team1;
    RoboticsTeam team2;
    double team1points;
    int team1tasks;
    boolean team1fell;
    double team2points;
    int team2tasks;
    boolean team2fell;

    RoboticsResult(RoboticsTeam team1, RoboticsTeam team2,
                   double team1points, int team1tasks, boolean team1fell,
                   double team2points, int team2tasks, boolean team2fell) {
        this.team1 = team1;
        this.team1fell = team1fell;
        this.team1points = team1points;
        this.team2 = team2;
        this.team1tasks = team1tasks;
        this.team2points = team2points;
        this.team2tasks = team2tasks;
        this.team2fell = team2fell;
    }

    public RoboticsResult(IContestant teamSDA, IContestant teamLCC, int team1points, int team1tasks, boolean team1fell, int team2points, int team2tasks, boolean team2fell) {
    }

    public boolean isValid(){
        return(team1tasks <8 && team2tasks <8 && team1points <=16 && team2points <=16);
    }

    public double getScore(double numPoints, int numTasks, boolean robotFall){
        double finalScore;
        if(robotFall = true){
            finalScore = numPoints + numTasks - 5;
            return finalScore;
        }
        else{
            finalScore = numPoints + numTasks;
            return finalScore;
        }

    }

    public IContestant getWinner() {
        if(this.isValid()) {
            if(getScore(this.team1points, this.team1tasks, this.team1fell) >
                    getScore(this.team2points, this.team2tasks, this.team2fell)) {
                return this.team1;
            }
            else {
                return this.team2;
            }
        }
        else {
            return null;
        }
    }

}

