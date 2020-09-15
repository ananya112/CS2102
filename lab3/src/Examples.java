
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class Examples {


@Test
public void testRainfall(){
    LinkedList<Double> readings = new LinkedList<Double>();
    readings.add(-1.0);
    readings.add((double) -999);
    Planning p = new Planning();
    assertEquals(p.rainfall(readings), -1,0);
}



}
// subtasks:

/*
- get the tital




 */