/**
 * returns readings for month month in sensor data
 *
 * @param data list of sensor data
 * @param month  month in integer representation
 * @return list of max readings for all days in the month
 *
 */

import java.util.LinkedList;

class Earthquake1 {
    Earthquake1(){}

    // checks whether a datum is a date
    boolean isDate(double anum) { return (int)anum > 10000000; }
    // extracts the month from an 8-digit date
    int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {

        LinkedList<MaxHzReport> reports = new LinkedList<MaxHzReport>();
        MaxHzReport report = new MaxHzReport(0,0);
        for(Double d: data){
            if(isDate(d)){
                if(extractMonth(d)==month){
                    reports.add(report);
                     report = new MaxHzReport (d,-1); // cleaning
                     continue;
                }
            }
            if(d >= 0 && d <= 500) {  // cleaning
                if (d > report.maxReading) {
                    report.maxReading = d;
                }
            }
        }
        reports.add(report);
        reports.removeFirst();
        for(MaxHzReport m: reports){
            if(m.maxReading == -1){
                reports.remove(m);
            }
        }
        return reports;
    }
}

