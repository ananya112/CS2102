import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples 
{  
  LinkedList<Show> shows = new LinkedList<Show>();
  LinkedList<Double> showResults = new LinkedList<Double>();
  DataSmooth1 D1 = new DataSmooth1();
  DataSmooth2 D2 = new DataSmooth2();
  
  public DataSmoothExamples() 
  {
	  
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));		
		shows.add(new Show("Star Trek", 1800, eps1, false));
		
		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2, false));
		
		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3, false));
		
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4, false));
		
		LinkedList<Episode> eps5 = new LinkedList<Episode>();
		eps5.add(new Episode("The Bagel", 59));
		eps5.add(new Episode("The Toasting", 57));
		eps5.add(new Episode("The Cream Cheese", 58));
		Show s5 = new Show("Sesame Bagel", 2300, eps5, true);
		shows.add(s5);
		
		LinkedList<Episode> eps6 = new LinkedList<Episode>();
		eps6.add(new Episode("The Man Possessed by an Evil Spirit", 23));
		eps6.add(new Episode("Who Will Be the Judge!?", 25));
		eps6.add(new Episode("The Curse of DIO", 25));
		eps6.add(new Episode("Tower of Grey", 23));
		eps6.add(new Episode("Silver Chariot", 24));
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

	    showResults.add(60.0);
	    showResults.add(29.75);
	    showResults.add(29.08333);
	    showResults.add(41.0);
	    showResults.add(46.66667); //58
	    showResults.add(34.27777); //24
	    showResults.add(20.83333); //20.8333
	    
  }
  
  @Test
  public void instructorTestDS1() 
  {
	  LinkedList<Double> runtimes = D1.dataSmooth(shows);
	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(runtimes.get(i), showResults.get(i), .01);
	  }
  }
  
  @Test
  public void instructorTestDS2() 
  {
	  LinkedList<Double> runtimes = D2.dataSmooth(shows);
	  
	  for(int i = 0; i < runtimes.size(); i++)
	  {
		  assertEquals(runtimes.get(i), showResults.get(i), .01);
	  }
  }
  
  
  
  
  /*
   * dataSmooth consumes a list of Show
   * must return a list of double representing the smoothed runTime values
   * 
   * Subtasks:
   * -Calculate the runTime value of each show
   * -Create list of runTime values of each show
   * - Smooth the list of runTime values according to smoothing function
   * - 
   */
  
}