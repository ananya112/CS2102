public class Cage {

    int size;
    IAnimal resident;

    public Cage (int size, IAnimal resident){
        this.size = size;
        this.resident = resident;
    }

    boolean checkResidentFits(){
        return this.resident.lengthBelow(this.size);
    }

}
