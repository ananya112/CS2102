import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}
    
    /*
    // This shows what a test case looks like
    @Test 
    public void simpleCheck() {
	assertEquals(4, 4);
    }
    */
    Song HapBD = new Song("Happy Birthday", 18);
    Song MerryChristmas = new Song("Merry Christmas", 80);

    @Test
    public void checkHBLen() {
        assertEquals(18, HapBD.lenInSeconds);
    }

    @Test
    public void checkMerryChrist() {
        assertEquals(8, MerryChristmas.lenInSeconds);
    }

}