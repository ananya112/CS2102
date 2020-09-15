/**
 * returns readings for month month in sensor data
 * @param data list of sensor data
 * @param month  month in integer representation
 * @return list of max readings for all days in the month
 *
 */

import java.util.LinkedList;

class Earthquake2 {
    Earthquake2(){}

    // checks whether a datum is a date
    boolean isDate(double anum) { return (int)anum > 10000000; }
    // extracts the month from an 8-digit date
    int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month)
    {
        LinkedList<Double> cSepData = this.sepByMonth(cData(data), month);
        LinkedList<MaxHzReport> dailyMonthMax = new LinkedList<MaxHzReport>();

        double currentDate = 0;
        double currentMax = 0;

        for(Double db : cSepData)
        {
            if(this.isDate(db) && db > currentDate)
            {
                currentDate = db;
            }
            else if(!this.isDate(db) && db > currentMax)
            {
                currentMax = db;
                if(db == cSepData.getLast())
                    dailyMonthMax.add(new MaxHzReport(currentDate, currentMax));
            }
            else if(!this.isDate(db) && db < currentMax)
                dailyMonthMax.add(new MaxHzReport(currentDate, currentMax));
        }
        return dailyMonthMax;
    }

    public LinkedList<Double> cData(LinkedList<Double> data)
    {
        LinkedList<Double> cList = new LinkedList<Double>();

        for(Double db : data)
        {
            if(db > 0)
                cList.add(db);
        }

        return cList;
    }

    public LinkedList<Double> sepByMonth(LinkedList<Double> data, int month)
    {
        LinkedList<Double> cSepData = new LinkedList<Double>();
        boolean isRightMonth = false;

        for(Double db: data)
        {
            if(this.isDate(db))
            {
                if(this.extractMonth(db) == month)
                {
                    cSepData.add(db);
                    isRightMonth = true;
                }
                else if(this.extractMonth(db) > month)
                    return cSepData;
                else
                    isRightMonth = false;
            }
            else if(isRightMonth)
            {
                cSepData.add(db);
            }
        }
        return cSepData;
    }
}



