import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Examples {
    private WeatherMonitor w;
    private WeatherMonitor w2;
    private WeatherMonitor w3;
    private WeatherMonitor w4;
    private WeatherMonitor w5;
    public Examples(){

        LinkedList<IDailyWeather> report = new  LinkedList<IDailyWeather>();
        LinkedList<IDailyWeather> report2 = new  LinkedList<IDailyWeather>();
        LinkedList<IDailyWeather> report3 = new  LinkedList<IDailyWeather>();
        LinkedList<IDailyWeather> report4 = new  LinkedList<IDailyWeather>();
        LinkedList<IDailyWeather> report5 = new  LinkedList<IDailyWeather>();

        this.w = new WeatherMonitor(report);
        this.w2 = new WeatherMonitor(report2);
        this.w3 = new WeatherMonitor(report3);
        this.w4 = new WeatherMonitor(report4);
        this.w5 = new WeatherMonitor(report5);

        GregorianCalendar date1 = new GregorianCalendar(1900, 11,1);
        Time date1Time = new Time (6, 5);
        Reading date1Reading = new Reading(date1Time, 56, 10);
        Reading date1Reading1 = new Reading(date1Time, 55, 0);
        Reading date1Reading2 = new Reading(date1Time, 51, 0);
        Reading date1Reading3 = new Reading(date1Time, 40, 0);
        LinkedList<Reading> reading = new LinkedList<Reading>();
        reading.add(date1Reading);
        reading.add(date1Reading1);
        reading.add(date1Reading2);
        reading.add(date1Reading3);
        w.addDailyReport(date1, reading);
        w5.addDailyReport(date1, reading);


        GregorianCalendar date2 = new GregorianCalendar(1900, 11,2);
        Time date2Time = new Time (8, 5);
        Reading date2Reading = new Reading(date2Time, 50, 11);
        Reading date2Reading1 = new Reading(date1Time, 55, 15);
        Reading date2Reading2 = new Reading(date1Time, 51, 16);
        Reading date2Reading3 = new Reading(date1Time, 42, 7);
        LinkedList<Reading> reading2 = new LinkedList<Reading>();
        reading2.add(date2Reading);
        reading2.add(date2Reading1);
        reading2.add(date2Reading2);
        reading2.add(date2Reading3);
        w.addDailyReport(date2, reading2);
        w5.addDailyReport(date2, reading2);

        GregorianCalendar date03 = new GregorianCalendar(1900, 1,1);
        Time date03Time = new Time (8, 5);
        Reading date03Reading = new Reading(date2Time, 50, 11);
        Reading date03Reading1 = new Reading(date1Time, 55, 15);
        Reading date03Reading2 = new Reading(date1Time, 51, 16);
        Reading date03Reading3 = new Reading(date1Time, 40, 7);
        LinkedList<Reading> reading03 = new LinkedList<Reading>();
        reading03.add(date03Reading);
        reading03.add(date03Reading1);
        reading03.add(date03Reading2);
        reading03.add(date03Reading3);
        w2.addDailyReport(date03, reading03);
        w5.addDailyReport(date03, reading03);


        GregorianCalendar date3 = new GregorianCalendar(1900, 11,3);
        Time date3Time = new Time (8, 4);
        Reading date3Reading = new Reading(date3Time, 60, 11);
        LinkedList<Reading> reading3 = new LinkedList<Reading>();
        reading3.add(date3Reading);
        w3.addDailyReport(date3, reading3);

        GregorianCalendar date4 = new GregorianCalendar(1900, 11,4);
        Time date4Time = new Time (2, 3);
        Reading date4Reading = new Reading(date4Time, 80, 5);
        LinkedList<Reading> reading4 = new LinkedList<Reading>();
        w4.addDailyReport(date4, reading4);

        GregorianCalendar date5 = new GregorianCalendar(1900, 11,1);
        Time date5Time = new Time (1, 3);
        Reading date5Reading = new Reading(date5Time, 70, 15);

        GregorianCalendar date6 = new GregorianCalendar(1900, 11,2);
        Time date6Time = new Time (9, 50);
        Reading date6Reading = new Reading(date6Time, 80, 5);

        GregorianCalendar date7 = new GregorianCalendar(1900, 1,3);
        GregorianCalendar date8 = new GregorianCalendar(1900, 1,4);
        GregorianCalendar date9 = new GregorianCalendar(1900, 2,1);
        GregorianCalendar date10 = new GregorianCalendar(1900, 2,2);
        GregorianCalendar date11 = new GregorianCalendar(1900, 2,3);
        GregorianCalendar date12 = new GregorianCalendar(1900, 2,4);
        GregorianCalendar date13 = new GregorianCalendar(1900, 3,1);
        GregorianCalendar date14 = new GregorianCalendar(1900, 3,2);
        GregorianCalendar date115 = new GregorianCalendar(1900, 3,3);
        GregorianCalendar date16 = new GregorianCalendar(1900, 3,4);




    }

    // tests for no data
    @Test
    public void date4TestTemp(){

        assertEquals(w4.averageTempForMonth(11, 1900), -9000000.0);

    }

    @Test
    public void date4TestRain(){

        assertEquals(w4.totalRainfallForMonth(11, 1900), 0.0);

    }
    // tests for one month with one day with one reading
    @Test
    public void date3TestTemp(){

        assertEquals(w3.averageTempForMonth(11, 1900), 60.0);

    }

    @Test
    public void date3TestRain(){

        assertEquals(w3.totalRainfallForMonth(11, 1900), 11.0);

    }
    // tests for one month with one day with multiple readings
    @Test
    public void date03TestTemp(){

        assertEquals(w2.averageTempForMonth(1, 1900), 49.0);

    }

    @Test
    public void date03TestRain(){

        assertEquals(w2.totalRainfallForMonth(1, 1900), 49.0);

    }
    // tests for one month with multiple days with multiple readings
    @Test
    public void date1and2TestTemp(){

        assertEquals(w.averageTempForMonth(11, 1900), 50.0);

    }

    @Test
    public void date1and2TestRain(){

        assertEquals(w.totalRainfallForMonth(11, 1900), 59.0);

    }
    //tests for multiple months with multiple days
    @Test
    public void dateFirstThreeDatesTestTemp(){

        assertEquals(w5.averageTempForMonth(11, 1900), 50.0);
        assertEquals(w2.totalRainfallForMonth(1, 1900), 49.0);

    }

    @Test
    public void dateFirstThreeDatesTestRain(){

        assertEquals(w5.totalRainfallForMonth(11, 1900), 59.0);
        assertEquals(w2.totalRainfallForMonth(1, 1900), 49.0);

    }

}

