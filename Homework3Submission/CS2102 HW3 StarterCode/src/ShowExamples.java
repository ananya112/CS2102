import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples 
{
	ShowManager1 sm1 = new ShowManager1();
	ShowManager2 sm2 = new ShowManager2();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	
	public ShowExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		Show s1 = new Show("Star Trek", 1800, eps1, false);
		shows.add(s1);
		report1.primetime.add(s1);
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2, false);
		shows.add(s2);
		report1.primetime.add(s2);
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3, false);
		shows.add(s3);
		report1.daytime.add(s3);
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4, false);
		shows.add(s4);
		report1.daytime.add(s4);
		
		LinkedList<Episode> eps5 = new LinkedList<Episode>();
		eps5.add(new Episode("The Bagel", 59));
		eps5.add(new Episode("The Toasting", 57));
		eps5.add(new Episode("The Cream Cheese", 58));
		Show s5 = new Show("Sesame Bagel", 2300, eps5, true);
		shows.add(s5);
		
		LinkedList<Episode> eps6 = new LinkedList<Episode>();
		eps6.add(new Episode("The Man Possessed by an Evil Spirit", 23));
		eps6.add(new Episode("Who Will Be the Judge!?", 25));
		eps6.add(new Episode("The Curse of DIO", 24));
		eps6.add(new Episode("Tower of Grey", 23));
		eps6.add(new Episode("Silver Chariot", 23));
		eps6.add(new Episode("Dark Blue Moon", 24));	
		Show s6 = new Show("JoJo's Bizarre Adventure: Stardust Crusaders", 2000, eps6, true);
		shows.add(s6);
		
		LinkedList<Episode> eps7 = new LinkedList<Episode>();
		eps7.add(new Episode("The Locket", 21));
		eps7.add(new Episode("Coming Back", 20));
		eps7.add(new Episode("Last Time in New York", 21));
		eps7.add(new Episode("The Broken Code", 21));
		eps7.add(new Episode("The Poker Game", 21));
		eps7.add(new Episode("Knight Vision", 21));	
		Show s7 = new Show("How I Met Your Mother", 1000, eps7, false);
		shows.add(s7);
		report1.daytime.add(s7);
	}
	
	@Test
	public void instructor1TestOrganizeShows() 
	{
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	@Test
	public void instructor2TestOrganizeShows() 
	{
		ShowSummary report2 = sm2.organizeShows(shows);
		assertEquals(report1, report2);
	}
	
	
	/*
	 * organizeShows must consume a list of Shows
	 * produces a ShowSummary with all the Daytime shows, PrimeTime, and 
	 * Late Night shows organized into their three respective lists.
	 * 
	 * Subtasks:
	 * - Must not include specials, remove them from input or report
	 * - Must determine whether a show is a daytime, nighttime, or prime time showd
	 */

}
