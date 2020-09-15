import java.util.LinkedList;

/**
 * searches for and calculates the average runtime of each show
 * @parem shows
 * @return a list of the average runtime values
 */

class DataSmooth1 {
    DataSmooth1(){}

    LinkedList<Show> shows = new LinkedList<Show>();
    LinkedList<Double> showResults = new LinkedList<Double>();


    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
        LinkedList<Double> smoothedList = new LinkedList<Double>();
        {
            for (Double aValue : showResults) {
                smoothedList.add(aValue);
            }


            for (int n = 0; n > 0 && n < smoothedList.size(); n++) {

                smoothedList.remove(n);
                smoothedList.add(((smoothedList.get(n)) + (smoothedList.get(n + 1)) + (smoothedList.get(n - 1)) / 3));

            }
        }
        return smoothedList;

    }

    public double averageRunTime(Show aShow) {
        double sum = 0;
        double average = sum/aShow.episodes.size();

        for (Episode anEpi : aShow.episodes) {

            sum = sum + anEpi.runTime;
        }
        return average;
    }

}


/*

Approach #2

First, create a new lust for the smoothed values
    -Add all the values to the list
If it is not the first or the last value of the list then,
    -Take the average by adding that value with the value before and after and divide by 3
Return the smoothed list


Separate method for the average runtime of the show
by adding all the runtimes of each episode and then dividing by total number of episodes
*/