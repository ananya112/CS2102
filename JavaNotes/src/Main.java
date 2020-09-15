public class Main {

    public static void mian(String[] args){
        Dillo babyDillo = new Dillo(7, false);
        Dillo adultDillo = new Dillo(24, false);
        Dillo hugeDeadDillo = new Dillo(65, true);

        new Dillo(5, false);
        Dillo deadDillo = new Dillo(3, true);
        Dillo anotherDeadDillo = new Dillo(3, true);  //different objects in memory

        // wrong -> if (deadDillo == anotherDeadDillo)  // == only works for primitive types

      //  if (deadDillo.length == anotherDeadDillo)


        System.out.println(hugeDeadDillo.canShelter(babyDillo));

        Boa fred = new Boa ("fred", 5, "mice");
        Boa wilma = new Boa ("Wilma", 6, "cute bunnies");
        Boa barney = new Boa ("Barney", 4, "mice");

        fred.likesSameFood(barney);

        Cage cageForFRed = new Cage (10, fred);
        Cage cageForBaby = new Cage (5, babyDillo);

        IAnimal anotherdillo = new Dillo(20, false);

        anotherdillo.lengthBelow(10);

        anotherdillo.isShorterThan(5);

        Boa someAnimal = new Boa ("Fred", 5, "mice");
        someAnimal.likesSameFood(wilma);






    }
}
