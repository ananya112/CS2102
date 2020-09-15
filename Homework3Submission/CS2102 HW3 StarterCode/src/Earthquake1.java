import java.util.LinkedList;

class Earthquake1 {
  Earthquake1(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }
 
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data,
                                                  int month) 
  {
	  LinkedList<LinkedList<Double>> targetData = targetMonthOnly(data, month);
	  
	  LinkedList<MaxHzReport> reports = organize(targetData);
	  return reports;
  }
  
  private LinkedList<MaxHzReport> organize(LinkedList<LinkedList<Double>> targetData) 
  {
	  LinkedList<MaxHzReport> reports = new LinkedList<MaxHzReport>();
	  MaxHzReport temp;
	  for(LinkedList<Double> d : targetData)
	  {
		  temp = parseData(d);
		  if(temp != null)
			  reports.add(temp);
	  }
	  
	  return reports;
}

/*
   * Takes in the target month and all of the data. Eliminates all of the
   * Irrelevant months and their data, then returns a list of every
   * day represented as a a list holding lists of each date and its data.
   */
  private LinkedList<LinkedList<Double>> targetMonthOnly(LinkedList<Double> data, int month)
  {
	  LinkedList<LinkedList<Double>> output = new LinkedList<LinkedList<Double>>();
	  LinkedList<Double> temp = new LinkedList<Double>();
	  for(int i = 0; i <data.size(); i++)
	  {
		  if(isDate(data.get(i)) && (extractMonth(data.get(i)) == month))
		  {
			  
			  temp.add(data.get(i));
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
			  output.add(temp);
			  temp = new LinkedList<Double>();
			  i--;
		  }
	  }
	  
	  return output;
  }
  /*
   * Takes in a List of doubles representing a day
   * and finds the highest datapoint collected. If day is not valid
   * (only negative values collected) then returns null.
   */
  private MaxHzReport parseData(LinkedList<Double> data)
  {
	  
	  double highest = 0;
	  for(int a = 1; a < data.size(); a++)
	  {
		  if(data.get(a) >highest)
		  {
			  highest = data.get(a);
		  }
	  }
	  if(highest != 0) 
	  {
		  MaxHzReport output = new MaxHzReport(data.get(0), highest);
		  return output;
	  }
	  else
	  {
		  return null;
	  }
	  
	  
  }
  
  
  
}  

