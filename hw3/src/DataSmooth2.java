/**
 * searches for and calculates the average runtime of each show
 * @param shows is a list of shows
 * @return a list of the average runtimes for shows after they have been smoothed
 *
 */


import java.util.LinkedList;

class DataSmooth2 {
    DataSmooth2(){}

    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
        LinkedList<Double> runtimeList = new LinkedList<Double>();
        LinkedList<Double> runTimeFinal = new LinkedList<Double>();


        double runtimeSum = 0;
        double epSum = 0;
        for (Show aShow: shows) {
            for (Episode anEpisode: aShow.episodes) {
                runtimeSum = anEpisode.runTime + runtimeSum;
                epSum ++;
            }
            aShow.avgLength = runtimeSum/epSum;
            runtimeSum = 0;
            epSum = 0;
            runtimeList.add(aShow.avgLength);
        }
        for (int i = 1; i < runtimeList.size() - 1; i++) {
            runTimeFinal.add((runtimeList.get(i-1) + runtimeList.get(i) + runtimeList.get(i+1))/3);
        }

        runTimeFinal.add(runtimeList.get(runtimeList.size()-1));
        return runTimeFinal;

    }
}
