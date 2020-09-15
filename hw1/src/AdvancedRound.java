import java.util.LinkedList;

public class AdvancedRound extends AbsRound{


    private LinkedList<IContestant> contestants;

    public AdvancedRound(LinkedList<Match> matches, LinkedList<IContestant> contestants) {
        super(matches);
        this.contestants = contestants;

    }

    public boolean isWinner(){
        for(IContestant c: this.contestants){
            if(c.equals(this.contestants))
                return true;
        }
        return false;
    }


}
