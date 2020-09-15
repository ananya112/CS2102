import java.util.LinkedList;

class DataSmooth2 {
  DataSmooth2(){}
  
  
  /*
   * Takes in a list of double values, smoothes them according to the 
   * smoothing function, and returns the smoothed list.
   */
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Double> lengths = getLengths(shows);
	  LinkedList<Double> output = new LinkedList<Double>();
	  output.add(lengths.get(0));
	  for(int i = 1; i < lengths.size()-1; i++)
	  {
		  output.add((lengths.get(i-1) + lengths.get(i) + lengths.get(i+1))/3);
	  }
	  output.add(lengths.get(lengths.size()-1));
	  return output;
  }
  
  /*
   *Takes a list of shows and returns a list of their corresponding avg lengths 
   */
	private LinkedList<Double> getLengths(LinkedList<Show> shows) 
	{
		LinkedList<Double> output = new LinkedList<Double>();
		
		for(Show s : shows)
		{
			output.add(avg(s));
		}
		
		return output;
	}

	/*
	 * takes in a Show and returns the avg length of the show by averaging the runTime of all its episodes.
	 */
	private Double avg(Show s) 
	{
		double a = 0;
		for(Episode e : s.episodes)
		{
			a += e.runTime;
		}
		return a/s.episodes.size();
	}
}