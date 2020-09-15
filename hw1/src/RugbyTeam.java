public class RugbyTeam implements IContestant{

    String country;
    String jerseyColor;
    boolean intimidationRitual;
    int wins;
    int losses;

    RugbyTeam(String country, String jerseyColor, boolean intimidationRitual, int wins, int losses) {

        this.country = country;
        this.jerseyColor = jerseyColor;
        this.intimidationRitual = intimidationRitual;
        this.wins = wins;
        this.losses = losses;

    }

    public boolean expectToBeat(RugbyTeam team2) {
        if(this.intimidationRitual == true && team2.intimidationRitual == false) {
            return true;
        } else if (this.intimidationRitual == false && team2.intimidationRitual == true) {
            return false;
        } else {
            if ((this.wins - this.losses) > (team2.wins - team2.losses)) {
                return true;
            } else if ((this.wins - this.losses) < (team2.wins - team2.losses)) {
                return false;
            } else {
                return false;
            }
        }
    }

}


