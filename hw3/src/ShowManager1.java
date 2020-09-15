import java.util.LinkedList;

class ShowManager1 {

    ShowManager1() {}

    /**
     *  sorts a list of shows into a show summary
     *  @param shows gets all shows in a list of shows
     *  @return report, a show summary object named report
     *
     * */



    public ShowSummary organizeShows(LinkedList<Show> shows)
    {
        ShowSummary report = new ShowSummary();

        for(Show s: shows){

             if( 600 <= s.broadcastTime && s.broadcastTime < 1700)
                report.daytime.add(s);

             if ( 1700 <= s.broadcastTime && s.broadcastTime < 2200)
                report.primetime.add(s);

             if ( 2200 <= s.broadcastTime && s.broadcastTime < 2500)
                report.latenight.add(s);
        }

        for(int i =0; i < report.daytime.size(); i++){

            if(report.daytime.get(i).isSpecial)
                report.daytime.remove(i);
        }

        for(int i =0; i < report.primetime.size(); i++){

            if(report.primetime.get(i).isSpecial)
                report.primetime.remove(i);
        }

        for(int i =0; i < report.latenight.size(); i++){

            if(report.latenight.get(i).isSpecial)
                report.latenight.remove(i);
        }


        return report;
    }
    }


