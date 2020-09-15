public class Dillo extends AbsAnimal implements IAnimal{

    int length;
    boolean isDead;

    public Dillo(int lengthParameter, boolean isDeadParameter){
        this.length = lengthParameter;
        this.isDead = isDeadParameter;
    }

    public boolean canShelter(Dillo aDillo){
        if(aDillo.isDead == true && aDillo.length > 60)
            return true;
        else
            return false;
    }

    public boolean lengthBelow(int size){
        return this.length < size/4 ;
    }
}
