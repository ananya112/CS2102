import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples {
    LinkedList<Show> shows = new LinkedList<Show>();
    LinkedList<Double> showResults = new LinkedList<Double>();
    DataSmooth1 D1 = new DataSmooth1();
    DataSmooth2 D2 = new DataSmooth2();

    public DataSmoothExamples() {
        LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        shows.add(new Show("Star Trek", 1800, eps1, false));

        LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        shows.add(new Show("Futurama", 1900, eps2, false));

        LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        shows.add(new Show("Animaniacs", 1630, eps3, false));

        LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        shows.add(new Show("Sesame Street", 900, eps4, false));

        showResults.add(60.0);
        showResults.add(29.75);
        showResults.add(29.08333);
        showResults.add(58.0);
    }

    @Test
    public void instructorTestDS() {
        LinkedList<Double> runtimes = D1.dataSmooth(shows);

        for (int i = 0; i < runtimes.size(); i++) {
            assertEquals(runtimes.get(i), showResults.get(i), .01);
        }
    }

    @Test
    public void instructorTestDS2() {
        LinkedList<Double> runtimes = D1.dataSmooth(shows);

        for (int i = 0; i < runtimes.size(); i++){
            assertEquals(runtimes.get(i), showResults.get(i), .01);}
    }
}
 /*
    Data Smooth 1:
    Subtasks:
    - Go through each show and episode
    - find the average of the episode length
    - create a list of averages
    - Smooth the data of the averages
    - create a list for the run times
    - add the smoothed averages to the list of run times
    - return the list of shows

    Outline:
    - Initialize one list of doubles for the averages
    - initialize another list of doubles for the run times
    - for each show
            for each episode
                    find the average run time
    - reset the sum and average values back to zero
    - add the first average value to runtime list
    - smooth the averaged values
    - add the smoothed values to the runtime list
    - add the last value to the runtime list
    - return the runtime list of shows


Data Smooth 2:
    Subtasks:
    - for each show in the list check the list of episodes
    - loop through the list of episodes and add up the runtimes and number of episodes
    - divide the total running time by the total number of episodes
    - smooth the list with a for loop

    Outline:
    create two empty lists of doubles
    create runtimeSum and epSum
    for list of shows
       for list of episodes
          add ep runtime to runtimeSum
          epsum ++
          set shows avgLength to runtimeSum/epSum
          runtimeSum and epSum = 0
       add show.avgLength to list of doubles
    for each item in the sum list
       smooth each item in the list

*/





