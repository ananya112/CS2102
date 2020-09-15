import java.util.LinkedList;

class Earthquake2 
{
  Earthquake2(){}
      
  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) 
  {
	  LinkedList<Sample> targetData = targetMonthOnly(data, month);
	  
	  return report(targetData);
  }
  
  
  /*
   * Takes in a list of Samples, creates a corresponding list of MaxHzReports, then returns the list of reports
   */
  private LinkedList<MaxHzReport> report(LinkedList<Sample> targetData) 
  {
	  
	  LinkedList<MaxHzReport> output = new LinkedList<MaxHzReport>();
	  
	  for(Sample s : targetData)
	  {
		  output.add(new MaxHzReport(s.date, findHighest(s.data)));
	  }
	  
	  
	return output;
	
	}
  
  /*
   * Combs a Linked list of doubles and returns the highest value
   */
	private double findHighest(LinkedList<Double> data) 
	{
		double highest = 0;
		for(double d : data)
		{
			if(d > highest)
			{
				highest = d;
			}
		}
		return highest;
	}
	
	/*
	 * Takes in a list of raw data and the target month, and outputs a list with data from only that month.
	 */
	private LinkedList<Sample> targetMonthOnly(LinkedList<Double> data, int month)
	  {
		  LinkedList<Sample> output = new LinkedList<Sample>();
		  double tempDate = 0;
		  LinkedList<Double> temp = new LinkedList<Double>();
		  for(int i = 0; i <data.size(); i++)
		  {
			  if(isDate(data.get(i)) && (extractMonth(data.get(i)) == month))
			  {
				  tempDate = data.get(i);
				  i++;
				  try
				  {
					  while(!isDate(data.get(i)))
					  {
						  temp.add(data.get(i));
						  i++;
					  }
				  }
				  catch(IndexOutOfBoundsException e)
				  {
					  
				  }
				  output.add(new Sample(tempDate, temp));
				  tempDate = 0;
				  temp = new LinkedList<Double>();
				  i--;
			  }
		  }
		  
		  return output;
	  }
  
}


/*
 * Represents a single day and all the data collected on that day.
 */
 class Sample 
{
	double date;
	LinkedList<Double> data;
	
	public Sample()
	{
		this.date = 0;
		this.data = new LinkedList<Double>();
	}
	public Sample(double d1, LinkedList<Double> d2)
	{
		this.date = d1;
		this.data = d2;
	}
	 
	 
}