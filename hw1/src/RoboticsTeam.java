public class RoboticsTeam implements IContestant{

    String school;
    String specialFeature;
    int previousScore;

    RoboticsTeam(String school, String specialFeature, int previousScore) {

        this.school = school;
        this.specialFeature = specialFeature;
        this.previousScore = previousScore;
    }

    public boolean expectToBeat(RoboticsTeam team2) {
        if(this.previousScore > team2.previousScore) {
            return true;
        } else if (this.previousScore < team2.previousScore) {
            return false;
        } else {
            return false;
        }

    }

}

