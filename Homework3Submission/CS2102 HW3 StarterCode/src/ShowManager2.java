import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	/*
	 * Consumes a list of shows and produces a report containing
	 * all of the daytime, prime time, and late night shows
	 * that are not specials in the form of a ShowSummary.
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		
		ShowSummary output = new ShowSummary();
		
		for(Show s : shows)
		{
			if(s.broadcastTime >= 600 && s.broadcastTime < 1700)
			{
				output.daytime.add(s);
			}
			else if(s.broadcastTime >= 1700 && s.broadcastTime < 2200)
			{
				output.primetime.add(s);
			}
			else if(s.broadcastTime >= 2200 && s.broadcastTime < 100)
			{
				output.latenight.add(s);
			}
		}
		
		output = removeSpecials(output);
		
		
		return output;
	}

	/*
	 * Takes in a ShowSummary and removes the specials from each of its
	 * Daytime, Primetime, and Latenight lists of shows.
	 */
	private ShowSummary removeSpecials(ShowSummary input) 
	{
		LinkedList<Show> daytime = removeHelper(input.daytime);
		LinkedList<Show> primetime = removeHelper(input.primetime);
		LinkedList<Show> latenight = removeHelper(input.latenight);
		
		
		ShowSummary output = new ShowSummary(daytime,primetime,latenight);
		return output;
	}
	/*
	 * Takes in a list of Show, and removes all of the specials from the list.
	 * Returns the list without the specials
	 */
	private LinkedList<Show> removeHelper(LinkedList<Show> shows)
	{
		for(Show a : shows)
		{
			if(a.isSpecial)
				shows.remove(a);
				
		}
		return shows;
	}
	
	
	
}
