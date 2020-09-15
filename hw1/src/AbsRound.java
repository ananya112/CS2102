import java.util.LinkedList;

public class AbsRound {

     LinkedList<Match> match;

    public AbsRound(LinkedList<Match> matches) {
     this.match = matches;
    }

    public LinkedList<IContestant> getMatchWinners() {
        LinkedList<IContestant> winners = new LinkedList<IContestant>();
       for (Match m: this.match){
           winners.add(m.winner());
        }
    return winners;
    }

    public int getNumWinners(int numWinners) {
        LinkedList<IContestant> winners = this.getMatchWinners();
        return winners.size();

    }



}
