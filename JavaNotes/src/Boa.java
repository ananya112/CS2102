public class Boa extends AbsAnimal implements IAnimal{

    String name;
    int length;
    String eats;

    Boa fred = new Boa ("fred", 5, "mice");
    Boa wilma = new Boa ("Wilma", 6, "cute bunnies");
    Boa barney = new Boa ("Barney", 4, "mice");
    public Boa(String name, int length, String eats){
        super(length);
        this.name = name;
        this.length = length;
        this.eats = eats;
    }

    public boolean likesSameFood(Boa otherBoa){
        if(this.eats.equals(otherBoa.eats))
            return true;
        else
            return false;

    }
+
    public boolean lengthBelow(int size){
        return (this.length < size/2);
    }


    public isShorterThan(int size){
        super(size);
        return this.length < size;
    }


}
