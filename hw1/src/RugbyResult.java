public class RugbyResult implements IResult{

    RugbyTeam team1;
    RugbyTeam team2;
    double team1points;
    double team2point;

    RugbyResult(RugbyTeam team1, RugbyTeam team2, double team1points, double team2point) {

        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2point = team2point;

    }

    public RugbyResult(IContestant teamA, IContestant teamB, int team1points, int team2point) {
    }

    public boolean isValid(){
        return(team1points < 150 && team2point< 150);
    }


    public IContestant getWinner() {
        if(this.isValid()) {
            if(this.team1points > this.team2point) {
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

