import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
    Earthquake1 E1 = new Earthquake1();
    LinkedList<Double> noData = new LinkedList<Double>();
    LinkedList<Double> threeDates = new LinkedList<Double>();
    LinkedList<Double> twoDates = new LinkedList<Double>();
    LinkedList<Double> twoDates2 = new LinkedList<Double>();
    LinkedList<Double> twoDates3 = new LinkedList<Double>();
    LinkedList<Double> twoDates4 = new LinkedList<Double>();
    LinkedList<Double> twoDates5 = new LinkedList<Double>();
    LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> SepReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> JanReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> FebReports = new LinkedList<MaxHzReport>();

    public EarthquakeExamples() {
        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));

        twoDates.add(20160913.0);
        twoDates.add(20.0);
        twoDates.add(1.0);
        twoDates.add(20160914.0);
        twoDates.add(200.0);
        SepReports.add(new MaxHzReport(20160913.0, 20.0));
        SepReports.add(new MaxHzReport(20160914.0, 200.0));

        twoDates2.add(20161013.0);
        twoDates2.add(0.0);
        twoDates2.add(-1.0);
        twoDates2.add(20161014.0);
        twoDates2.add(500.0);
        OctReports.add(new MaxHzReport(20161013.0, 0.0));
        OctReports.add(new MaxHzReport(20161014.0, 500.0));

        twoDates3.add(20161213.0);
        twoDates3.add(50.0);
        twoDates3.add(-1.0);
        twoDates3.add(20161214.0);
        twoDates3.add(500.0);
        twoDates4.add(700.0);
        DecReports.add(new MaxHzReport(20161213.0, 50.0));
        DecReports.add(new MaxHzReport(20161214.0, 500.0));

        twoDates4.add(20160113.0);
        twoDates4.add(50.0);
        twoDates4.add(300.0);
        twoDates4.add(20160114.0);
        twoDates4.add(500.0);
        JanReports.add(new MaxHzReport(20160113.0, 300.0));
        JanReports.add(new MaxHzReport(20160114.0, 500.0));

        twoDates5.add(20160213.0);
        twoDates5.add(5000.0);
        twoDates5.add(300.0);
        twoDates5.add(20160214.0);
        twoDates5.add(0.0);
        FebReports.add(new MaxHzReport(20160213.0, 300.0));
        FebReports.add(new MaxHzReport(20160214.0, 0.0));



    }

    @Test
    public void instructorTestEQ() {
        assertEquals(NovReports,
                E1.dailyMaxForMonth(threeDates, 11));
    }


    @Test
    public void SepReportsTest() {
        assertEquals(SepReports,
                E1.dailyMaxForMonth(twoDates,9));
    }


    @Test
    public void OctReportsTest() {
        assertEquals(OctReports,
                E1.dailyMaxForMonth(twoDates2,10));
    }

    @Test
    public void DecReportsTest() {
        assertEquals(DecReports,
                E1.dailyMaxForMonth(twoDates3,12));
    }

    @Test
    public void JanReportsTest() {
        assertEquals(JanReports,
                E1.dailyMaxForMonth(twoDates4,1));
    }

    @Test
    public void FebReportsTest() {
        assertEquals(FebReports,
                E1.dailyMaxForMonth(twoDates5,2));
    }


}
/*
Subtasks:
   * -differentiate data points and dates
   * -Ignore data for months other than given
   * -Ignore negative freq values
   * -find highest value each day
  Approach:
         - determine the desired month of reports
         - group the reports in their designated month groups
         - ignore data for other months when given one month to observe
         - ignore negative frequency values
         - give the highest frequency of the day of the desired month given
         - return ordered list of all the MaxHzReports(date, highest frequency) from the given month
           in chronological order.
 */