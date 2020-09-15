public abstract class AbsAnimal extends AbsLIfeForm{
    int length;

    public boolean isShorterThan(int size){
        return this.length < size;
    }

    public AbsAnimal(int length){
        super("This is a hard-coded value");
        this.length = length;
    }





}
