import org.junit.Test;
import static org.junit.Assert.*;

public class Examples {

    Dillo babyDillo = new Dillo(7, false);
    Dillo adultDillo = new Dillo(24, false);
    Dillo hugeDeadDillo = new Dillo(65, true);

    Boa fred = new Boa ("fred", 5, "mice");
    Boa wilma = new Boa ("Wilma", 6, "cute bunnies");
    Boa barney = new Boa ("Barney", 4, "mice");

    @Test
    public void testBabyDilloCanShelter(){
        assertFalse(babyDillo.canShelter(babyDillo));
    }

    @Test
    public void testHugeDeadDilloCanShelter(){
        assertTrue(hugeDeadDillo.canShelter(hugeDeadDillo));
    }

    @Test
    public void testBabyDilloCanShelterHugeDeadDillo(){
        assertFalse(hugeDeadDillo.canShelter(babyDillo));
    }

    @Test
    public void fredAndBarneyLikeSameFood(){
        assertTrue(fred.likesSameFood(barney));
    }

    @Test
    public void fredAndWilmaLikeSameFood(){
        assertFalse(fred.likesSameFood(wilma));
    }

}




