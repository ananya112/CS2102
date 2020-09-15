public class Match {

    IContestant team1;
    IContestant team2;
    IResult result;


    public Match(IContestant team1, IContestant team2, IResult result) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
    }

    public Match(IResult result1) {
    }

    public IContestant winner() {

        return this.result.getWinner();
    }


}
