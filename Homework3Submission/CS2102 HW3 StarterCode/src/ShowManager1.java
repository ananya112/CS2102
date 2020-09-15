import java.util.LinkedList;

class ShowManager1 {
	
	ShowManager1() {}

	/*
	 * Consumes a list of shows and produces a report containing
	 * all of the daytime, prime time, and late night shows
	 * that are not specials in the form of a ShowSummary.
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> showsR = removeSpecials(shows);
		LinkedList<Show> daytime = showSort(showsR, 0);
		LinkedList<Show> primetime = showSort(showsR, 1);
		LinkedList<Show> latenight = showSort(showsR, 2);
		
		ShowSummary sum = new ShowSummary(daytime,primetime,latenight);
		
		
		
		return sum;
	}

	/*
	 * Takes in a list of shows and outputs a list of the shows from the input depending on the condition:
	 * If dpn is 0, returns daytime shows only.
	 * If dpn is 1, returns prime time shows only.
	 * If dpn is 2, returns nightime shows only.
	 */
	private LinkedList<Show> showSort(LinkedList<Show> shows, int dpn) 
	{
		
		LinkedList<Show> output = new LinkedList<Show>();
		switch(dpn)
		{
			case 0:
			{
				for(Show s : shows)
				{
					if(s.broadcastTime >= 600 && s.broadcastTime < 1700)
					{
						output.add(s);
					}
				}
				break;
			}
			case 1:
			{
				for(Show s : shows)
				{
					if(s.broadcastTime >= 1700 && s.broadcastTime < 2200)
					{
						output.add(s);
					}
				}
				break;
			}
			case 2:
			{
				for(Show s : shows)
				{
					if(s.broadcastTime >= 2200 && s.broadcastTime < 100)
					{
						output.add(s);
					}
				}
				break;
			}
			default:
			{
				break;
			}
		}
		return output;
	}
	
	/*
	 * Removes specials from a list of shows, retaining the original order.
	 */
	private LinkedList<Show> removeSpecials(LinkedList<Show> s)
	{
		LinkedList<Show> output = new LinkedList<Show>();
		for(Show a : s)
		{
			if(!isSpecial(a))
				output.add(a);
		}
		return output;
	}
	/*
	 * Checks to see if a show is a special.
	 */
	private boolean isSpecial(Show s)
	{
		if(s.isSpecial)
		{
			return true;
		}
		return false;
	}
	
}
