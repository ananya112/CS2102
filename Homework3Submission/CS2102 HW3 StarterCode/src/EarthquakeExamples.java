import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  Earthquake2 E2 = new Earthquake2();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();  
  LinkedList<MaxHzReport> Nov1Reports = new LinkedList<MaxHzReport>();
  LinkedList<Double> multiDates = new LinkedList<Double>();  
  LinkedList<MaxHzReport> JanReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> FebReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> MarchReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> AprilReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> MayReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> SeptReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();
  public EarthquakeExamples() 
  {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    Nov1Reports.add(new MaxHzReport(20151101.0,6.0));
    
    //jan
    multiDates.add(20150109.0);
    multiDates.add(473.0);
    multiDates.add(217.0);
    multiDates.add(20150114.0);
    multiDates.add(171.0);
    multiDates.add(242.0);
    multiDates.add(169.0);
    multiDates.add(20150119.0);
    multiDates.add(374.0);
    multiDates.add(-8.0);
    multiDates.add(331.0);
    multiDates.add(468.0);
    multiDates.add(48.0);
    JanReports.add(new MaxHzReport(20150109, 473));
    JanReports.add(new MaxHzReport(20150114, 242));
    JanReports.add(new MaxHzReport(20150119, 468));
    //feb
    multiDates.add(20150204.0);
    multiDates.add(455.0);
    multiDates.add(208.0);
    multiDates.add(20150209.0);
    multiDates.add(59.0);
    multiDates.add(434.0);
    multiDates.add(20150210.0);
    multiDates.add(160.0);
    multiDates.add(426.0);
    multiDates.add(228.0);
    multiDates.add(20150217.0);
    multiDates.add(26.0);
    multiDates.add(40.0);
    multiDates.add(179.0);
    multiDates.add(20150219.0);
    multiDates.add(11.0);
    multiDates.add(287.0);
    multiDates.add(248.0);
    multiDates.add(183.0);
    multiDates.add(20150221.0);
    multiDates.add(123.0);
    multiDates.add(128.0);
    FebReports.add(new MaxHzReport(20150204, 455));
    FebReports.add(new MaxHzReport(20150209, 434));
    FebReports.add(new MaxHzReport(20150210, 426));
    FebReports.add(new MaxHzReport(20150217, 179));
    FebReports.add(new MaxHzReport(20150219, 287));
    FebReports.add(new MaxHzReport(20150221, 128));
    //march
    multiDates.add(20150304.0);
    multiDates.add(132.0);
    multiDates.add(203.0);
    multiDates.add(43.0);
    multiDates.add(469.0);
    multiDates.add(20150310.0);
    multiDates.add(103.0);
    multiDates.add(113.0);
    multiDates.add(20150321.0);
    multiDates.add(85.0);
    multiDates.add(20150323.0);
    multiDates.add(292.0);
    multiDates.add(341.0);
    multiDates.add(134.0);
    multiDates.add(20150324.0);
    multiDates.add(132.0);
    multiDates.add(194.0);
    multiDates.add(309.0);
    multiDates.add(350.0);
    MarchReports.add(new MaxHzReport(20150304, 469));
    MarchReports.add(new MaxHzReport(20150310, 113));
    MarchReports.add(new MaxHzReport(20150321, 85));
    MarchReports.add(new MaxHzReport(20150323, 341));
    MarchReports.add(new MaxHzReport(20150324, 350));
    //april
    multiDates.add(20150404.0);
    multiDates.add(226.0);
    multiDates.add(256.0);
    multiDates.add(20150408.0);
    multiDates.add(414.0);
    multiDates.add(131.0);
    multiDates.add(20150415.0);
    multiDates.add(155.0);
    multiDates.add(14.0);
    multiDates.add(115.0);
    multiDates.add(20150420.0);
    multiDates.add(248.0);
    AprilReports.add(new MaxHzReport(20150404, 256));
    AprilReports.add(new MaxHzReport(20150408, 414));
    AprilReports.add(new MaxHzReport(20150415, 155));
    AprilReports.add(new MaxHzReport(20150420, 248));
    //may
    multiDates.add(20150505.0);
    multiDates.add(466.0);
    multiDates.add(421.0);
    multiDates.add(20150508.0);
    multiDates.add(210.0);
    multiDates.add(412.0);
    multiDates.add(481.0);
    multiDates.add(20150510.0);
    multiDates.add(277.0);
    multiDates.add(12.0);
    multiDates.add(405.0);
    multiDates.add(96.0);
    multiDates.add(20150515.0);
    multiDates.add(103.0);
    multiDates.add(16.0);
    multiDates.add(391.0);
    multiDates.add(226.0);
    multiDates.add(382.0);
    multiDates.add(20150528.0);
    multiDates.add(436.0);
    multiDates.add(396.0);
    multiDates.add(20150529.0);
    multiDates.add(184.0);
    multiDates.add(385.0);
    MayReports.add(new MaxHzReport(20150505, 466));
    MayReports.add(new MaxHzReport(20150508, 481));
    MayReports.add(new MaxHzReport(20150510, 405));
    MayReports.add(new MaxHzReport(20150515, 391));
    MayReports.add(new MaxHzReport(20150528, 436));
    MayReports.add(new MaxHzReport(20150529, 385));
    //Sept
    multiDates.add(20150907.0);
    multiDates.add(100.0);
    multiDates.add(244.0);
    multiDates.add(86.0);
    multiDates.add(289.0);
    multiDates.add(20150908.0);
    multiDates.add(441.0);
    multiDates.add(-18.0);
    multiDates.add(49.0);
    multiDates.add(355.0);
    multiDates.add(10.0);
    multiDates.add(319.0);
    multiDates.add(20150930.0);
    multiDates.add(98.0);
    SeptReports.add(new MaxHzReport(20150907, 289));
    SeptReports.add(new MaxHzReport(20150908, 441));
    SeptReports.add(new MaxHzReport(20150930, 98));
    //Oct
    multiDates.add(20151001.0);
    multiDates.add(455.0);
    multiDates.add(46.0);
    multiDates.add(414.0);
    multiDates.add(20151005.0);
    multiDates.add(351.0);
    multiDates.add(475.0);
    multiDates.add(20151009.0);
    multiDates.add(347.0);
    multiDates.add(417.0);
    multiDates.add(51.0);
    multiDates.add(20151010.0);
    multiDates.add(274.0);
    multiDates.add(30.0);
    multiDates.add(20151013.0);
    multiDates.add(113.0);
    multiDates.add(312.0);
    multiDates.add(197.0);
    multiDates.add(20151014.0);
    multiDates.add(226.0);
    multiDates.add(20151017.0);
    multiDates.add(458.0);
    multiDates.add(276.0);
    multiDates.add(381.0);
    multiDates.add(281.0);
    multiDates.add(20151020.0);
    multiDates.add(268.0);
    multiDates.add(342.0);
    multiDates.add(90.0);
    multiDates.add(364.0);
    multiDates.add(203.0);
    multiDates.add(20151026.0);
    multiDates.add(235.0);
    multiDates.add(436.0);
    multiDates.add(356.0);
    OctReports.add(new MaxHzReport(20151001, 455));
    OctReports.add(new MaxHzReport(20151005, 475));
    OctReports.add(new MaxHzReport(20151009, 417));
    OctReports.add(new MaxHzReport(20151010, 274));
    OctReports.add(new MaxHzReport(20151013, 312));
    OctReports.add(new MaxHzReport(20151014, 226));
    OctReports.add(new MaxHzReport(20151017, 458));
    OctReports.add(new MaxHzReport(20151020, 364));
    OctReports.add(new MaxHzReport(20151026, 436));
    //Nov
    multiDates.add(20151101.0);
    multiDates.add(6.0);
    multiDates.add(20151107.0);
    multiDates.add(247.0);
    multiDates.add(434.0);
    multiDates.add(20151117.0);
    multiDates.add(69.0);
    multiDates.add(20151125.0);
    multiDates.add(193.0);
    multiDates.add(407.0);
    NovReports.add(new MaxHzReport(20151101, 6));
    NovReports.add(new MaxHzReport(20151107, 434));
    NovReports.add(new MaxHzReport(20151117, 69));
    NovReports.add(new MaxHzReport(20151125, 407));
    //Dec
    multiDates.add(20151212.0);
    multiDates.add(309.0);
    multiDates.add(-12.0);
    multiDates.add(20151214.0);
    multiDates.add(301.0);
    multiDates.add(146.0);
    multiDates.add(391.0);
    multiDates.add(99.0);
    multiDates.add(406.0);
    multiDates.add(158.0);
    multiDates.add(20151215.0);
    multiDates.add(380.0);
    multiDates.add(-10.0);
    multiDates.add(20151217.0);
    multiDates.add(27.0);
    multiDates.add(112.0);
    multiDates.add(20151218.0);
    multiDates.add(156.0);
    multiDates.add(285.0);
    multiDates.add(299.0);
    multiDates.add(20151222.0);
    multiDates.add(114.0);
    multiDates.add(497.0);
    multiDates.add(310.0);
    multiDates.add(346.0);
    multiDates.add(385.0);
    multiDates.add(20151230.0);
    multiDates.add(462.0);
    DecReports.add(new MaxHzReport(20151212, 309));
    DecReports.add(new MaxHzReport(20151214, 406));
    DecReports.add(new MaxHzReport(20151215, 380));
    DecReports.add(new MaxHzReport(20151217, 112));
    DecReports.add(new MaxHzReport(20151218, 299));
    DecReports.add(new MaxHzReport(20151222, 497));
    DecReports.add(new MaxHzReport(20151230, 462));
    
  }

  @Test
  public void instructorTestEQ1() 
  { 
    assertEquals(Nov1Reports, 
                 E1.dailyMaxForMonth(threeDates, 11));
    
  }
  @Test
  public void instructorTestEQ2() 
  { 
    assertEquals(Nov1Reports, 
                 E2.dailyMaxForMonth(threeDates, 11));
    
  }
  @Test
  public void instructorTest2EQ1() 
  { 
    assertEquals(FebReports, 
                 E1.dailyMaxForMonth(multiDates, 2));
    
  }
  @Test
  public void instructorTest2EQ2() 
  { 
    assertEquals(FebReports, 
                 E2.dailyMaxForMonth(multiDates, 2));
    
  }
  @Test
  public void instructorTest3EQ1() 
  { 
    assertEquals(JanReports, 
                 E1.dailyMaxForMonth(multiDates, 1));
    
  }
  @Test
  public void instructorTest3EQ2() 
  { 
    assertEquals(JanReports, 
                 E2.dailyMaxForMonth(multiDates, 1));
    
  }
  @Test
  public void instructorTest4EQ1() 
  { 
    assertEquals(MarchReports, 
                 E1.dailyMaxForMonth(multiDates, 3));
    
  }
  @Test
  public void instructorTest4EQ2() 
  { 
    assertEquals(MarchReports, 
                 E2.dailyMaxForMonth(multiDates, 3));
    
  }
  @Test
  public void instructorTest5EQ1() 
  { 
    assertEquals(AprilReports, 
                 E1.dailyMaxForMonth(multiDates, 4));
    
  }
  @Test
  public void instructorTest5EQ2() 
  { 
    assertEquals(AprilReports, 
                 E2.dailyMaxForMonth(multiDates, 4));
    
  }
  @Test
  public void instructorTest6EQ1() 
  { 
    assertEquals(MayReports, 
                 E1.dailyMaxForMonth(multiDates, 5));
    
  }
  @Test
  public void instructorTest6EQ2() 
  { 
    assertEquals(MayReports, 
                 E2.dailyMaxForMonth(multiDates, 5));
    
  }
  @Test
  public void instructorTest7EQ1() 
  { 
    assertEquals(SeptReports, 
                 E1.dailyMaxForMonth(multiDates, 9));
    
  }
  @Test
  public void instructorTest7EQ2() 
  { 
    assertEquals(SeptReports, 
                 E2.dailyMaxForMonth(multiDates, 9));
    
  }
  @Test
  public void instructorTest8EQ1() 
  { 
    assertEquals(OctReports, 
                 E1.dailyMaxForMonth(multiDates, 10));
    
  }
  @Test
  public void instructorTest8EQ2() 
  { 
    assertEquals(OctReports, 
                 E2.dailyMaxForMonth(multiDates, 10));
    
  }
  @Test
  public void instructorTest9EQ1() 
  { 
    assertEquals(NovReports, 
                 E1.dailyMaxForMonth(multiDates, 11));
    
  }
  @Test
  public void instructorTest9EQ2() 
  { 
    assertEquals(NovReports, 
                 E2.dailyMaxForMonth(multiDates, 11));
  }
  @Test
  public void instructorTest10EQ1() 
  { 
    assertEquals(DecReports, 
                 E1.dailyMaxForMonth(multiDates, 12));
  }
  @Test
  public void instructorTest10EQ2() 
  { 
    assertEquals(DecReports, 
                 E2.dailyMaxForMonth(multiDates, 12));
  }
  /*
   * dailyMaxForMonth must consume both a list of sensor data (doubles)
   * and a month (int from 1-12)
   * returns a list of MaxHzReport with the highest freq
   * for each day at least 1 valid recording was taken
   * 
   * Subtasks:
   * -differentiate data points and dates
   * -Ignore data for months other than given
   * -Ignore negative freq values
   * -find highest value each day
   * 
   */
}