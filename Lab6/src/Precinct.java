import java.util.Scanner;

public class Precinct {

    String name;
    String address;
    Integer population;

   public Precinct(String name, String address, Integer population){
       this.name = name;
       this.address = address;
       this.population = population;
   }

    public String toString(){
       return population.toString();
    }


}
