import java.util.LinkedList;
import java.util.GregorianCalendar;

class DailyWeatherReport implements IDailyWeather{

    private LinkedList<Double> temp;
    private LinkedList<Double> rain;
    private GregorianCalendar calender;

    protected DailyWeatherReport(GregorianCalendar calender,LinkedList<Double> temp, LinkedList<Double> rain){
        this.calender = calender;
        this.temp = temp;
        this.rain = rain;
    }

    /**
     * finds the total amount of rainfall from a list of rainfall amounts
     * @return total rainfall over a month
     */
    public double getRain(){
        double total = 0;
        for(int i= 0; i<rain.size(); i++){
            total += rain.get(i);
        }
        return total;
    }

    /**
     * checks if a month int is the same as a month in the gregorian calendar
     * @param month is an int representing a month in the year
     * @return true the month is the same
     */
    public boolean isEqualMonth(int month){
        return calender.get(GregorianCalendar.MONTH) == month;
    }

    /**
     * finds the average temperature from a list of temperatures
     * @return avg temp over a month
     */
    public double getTemp(){
        double total = 0;
        double day = 0;
        for(int i= 0; i<temp.size(); i++){
            total += temp.get(i);
            day++;
        }
        if(day == 0)
            return -9000000;
        return total/day;
    }

}
