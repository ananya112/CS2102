/**
 * sorts a list of shows into a show summary
 * @param shows is a list of shows
 * @returns a show summary of daytime prime time and late night shows
 */


import java.util.LinkedList;

class ShowManager2 {

    ShowManager2() {}

    public ShowSummary organizeShows(LinkedList<Show> shows)
    {
        LinkedList<Show> daytimeShows = new LinkedList<Show>();
        LinkedList<Show> primeTimeShows = new LinkedList<Show>();
        LinkedList<Show> lateNightShows = new LinkedList<Show>();
        for (Show aShow: shows) {
            if (aShow.isSpecial == false && aShow.broadcastTime >= 600 && aShow.broadcastTime < 1700) {
                daytimeShows.add(aShow);
            }
            else if (aShow.isSpecial == false && aShow.broadcastTime >= 1700 && aShow.broadcastTime < 2200) {
                primeTimeShows.add(aShow);
            }
            else if (aShow.isSpecial == false && aShow.broadcastTime >= 2200 && aShow.broadcastTime < 2500) {
                lateNightShows.add(aShow);
            }
        }
        ShowSummary cableProviderPresentation = new ShowSummary(daytimeShows, primeTimeShows, lateNightShows);
        return cableProviderPresentation;
    }

}
