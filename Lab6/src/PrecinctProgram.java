import java.util.Scanner;

public class PrecinctProgram {

    public static void main(String[] args){
        System.out.println("hello, world");

        String message = "hello, world";
        System.out.println(message);

        int day;
        day = 17;
        System.out.println("Today is Wed, Nov " + day + ".");


        Precinct worcester12;
        worcester12 = new Precinct("Worcester12", "130 Winter Street", 1673);
        System.out.println(worcester12);

        Scanner keyboard = new Scanner(System.in);
        int amount = keyboard.nextInt();

        int day1 = 7;
        System.out.println("Here's today's date:" + "Nov" + day + "," + "2010");

        int day2 = 7;
        System.out.println("Here's today's date: " + "Nov " + day + ", " +" 2010");





    }


}
