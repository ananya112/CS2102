import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples
{
    ShowManager1 sm1 = new ShowManager1();
    ShowManager1 sm2 = new ShowManager1();
    LinkedList<Show> shows = new LinkedList<Show>();
    ShowSummary report1 = new ShowSummary();


    public ShowExamples()
    {
        LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        Show s1 = new Show("Star Trek", 1800, eps1, false);
        shows.add(s1);
        report1.primetime.add(s1);

        LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        Show s2 = new Show("Futurama", 1900, eps2, false);
        shows.add(s2);
        report1.primetime.add(s2);

        LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        Show s3 = new Show("Animaniacs", 1630, eps3, false);
        shows.add(s3);
        report1.daytime.add(s3);

        LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        Show s4 = new Show("Sesame Street", 900, eps4, false);
        shows.add(s4);
        report1.daytime.add(s4);
    }

    @Test
    public void instructorTestOrganizeShows()
    {
        ShowSummary report2 = sm1.organizeShows(shows);
        assertEquals(report1, report2);
    }

    @Test
    public void instructor2TestOrganizeShows()
    {
        ShowSummary report2 = sm2.organizeShows(shows);
        assertEquals(report1, report2);
    }


}

    /*
    Show Manager 1:
    Subtasks:
    - figure out when each type of show starts
    - create list of shows
    - seperate shows based on starting time
    - add daytime, primetime, and late night shows to the list of shows
    - return the list of shows

    Outline:
    - Initialize one list with daytime, primetime, and late night shows
      exclude special shows
          for each show
                 if daytime show add to the show list
                 if primetime show add to the show list
                 if late night show add to the show list
          return list of shows


Show Manager 2:
    Subtasks:
    - figure out when each type of show starts
    - seperate shows based on starting time
    - get rid of special shows
    - return the list of daytime, primetime, late night, overnight shows

    Outline:
    - Initialize five different list, one for each show
        for each show
              if daytime show add to the daytime show list
              if primetime show add to the primetime show list
              if late night show add to the late night show
              if overnight show add to the overnight show
              if special show add to the special show list
     */
