import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}
  
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Show> s = setRunTimes(shows);
	  
	  LinkedList<Double> output = smooth(getRunTimes(s));
	  
	  return output;
  }
  
  /*
   * Takes in a list of double values, smoothes them according to the 
   * smoothing function, and returns the smoothed list.
   */
  private LinkedList<Double> smooth(LinkedList<Double> input)
  {
	  LinkedList<Double> output = new LinkedList<Double>();
	  double temp = 0;
	  for(int i = 0; i < input.size(); i++)
	  {
		  if(i == 0)
		  {
			  output.add(input.get(i));
		  }
		  else if(i == input.size()-1)
		  {
			  output.add(input.get(i));
		  }
		  else
		  {
			  temp = (input.get(i-1) + input.get(i) + input.get(i+1));
			  output.add(( temp / 3.0));
		  }
	  }
	  
	  return output;
  }
  
  /*
   * Takes in a list of shows, and returns the list of the shows but with each show's \
   * avg runTime calculated
   */
  private LinkedList<Show> setRunTimes(LinkedList<Show> input)
  {
	  LinkedList<Show> output = new LinkedList<Show>();
	  Show temp;
	  for(Show s : input)
	  {
		  temp = calcRunTime(s);
		  output.add(temp);
	  }
	  
	  
	  return output;
  }

  /*
   * Takes in a show, and averages the length of all of its episodes.
   * Returns the show with its avgLength value calculated.
   */
	private Show calcRunTime(Show s) 
	{
		double runtime = 0;
		int acc = 0;
		for(Episode e : s.episodes)
		{
			runtime += e.runTime;
			acc++;
		}
		s.setAvgLength(runtime/acc);
		
		return s;
	}
	
	/*
	 * Takes in a list of shows, and returns a list of each of the avgLength 
	 * values in the same order.
	 */
	private LinkedList<Double> getRunTimes(LinkedList<Show> shows)
	{
		LinkedList<Double> output = new LinkedList<Double>();
		
		for(Show s : shows)
		{
			output.add(s.avgLength);
		}
		return output;
	}
  
  
  
}