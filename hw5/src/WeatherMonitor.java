import java.util.GregorianCalendar;
import java.util.LinkedList;

class WeatherMonitor {

    private LinkedList<IDailyWeather> report;

    protected WeatherMonitor(LinkedList<IDailyWeather> report){
        this.report = report;
    }

    protected double averageTempForMonth(int month, int year){
      double temp = 0;
      double day = 0;

      for(int i= 0; i< report.size(); i++){
          if(report.get(i).isEqualMonth(month)){
              temp += report.get(i).getTemp();
              day++;
          }
      }

        if(day == 0)
            return -9000000;

      double avgTemp = temp/day;
      return avgTemp;
    }

    protected double totalRainfallForMonth(int month, int year){
        double rainfall = 0;

        for(int i= 0; i< report.size(); i++){
            if(report.get(i).isEqualMonth(month)){
                rainfall += report.get(i).getRain();
            }
        }
        return rainfall;
    }

    protected void addDailyReport(GregorianCalendar calender, LinkedList<Reading> readings){
        LinkedList<Double> temps = new LinkedList<Double>();
        LinkedList<Double> rainfall = new LinkedList<Double>();
        for(Reading r: readings){
            temps.add(r.getTemp1());
        }
        for(Reading r: readings){
            rainfall.add(r.getRainfall());
        }
        report.add(new DailyWeatherReport (calender,temps,rainfall));
    }
}
