import java.util.LinkedList;

public class Planning {

    public Planning() {
    }

    public double rainfall(LinkedList<Double> rainReadings) {
        int count = 0;
        double total = 0;
        double average = -1;
        for (Double reading : rainReadings) {
                 if (reading >= 0) {
                     total += reading;
                     count++;
                 }
                 else if(reading == -999.0){
                     break;
                 }
        }
        if (total > 0)
            average = total / count;
        return average;
    }
}