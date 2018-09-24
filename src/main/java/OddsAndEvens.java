import java.util.*;

public class OddsAndEvens {

    public static void main(String[] args) {


       //String play = "y";
       //while (play.equals("y"));
        {

            //Introduction and gets name
            System.out.println("Lets play a game called \"Odds and Evens\"");
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = input.next();


            //Player selects if they will be odd or even
             int i = 0;
            while (i == 0) {
                System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
                 String oddEven = input.next();
                if (oddEven.equals("O")) {
                    System.out.println(name + " has picked Odds, The computer will be Evens!");
                    i++;
                } else if (oddEven.equals("E")) {
                    System.out.println(name + " has picked Evens, The computer will be Odds!");
                    i++;
                } else {
                    System.out.println("Please enter \"O\" for Odds or \"E\" for Evens!");

                }
            }
            System.out.println("----------------------------------------");


            //Player enters number of fingers

            System.out.println();
            System.out.println("Hold up a random number of fingers 1-5.");
            Scanner number = new Scanner(System.in);
            System.out.println("How many \"fingers\" did you select?");
            int fingers = number.nextInt();


            //Random Number for Computer
            Random rand = new Random();
            int computer = rand.nextInt(6);
            System.out.println("The computer plays " + computer + " \"fingers\".");
            System.out.println("----------------------------------------");
            int sum = fingers + computer;
            System.out.println(fingers + " + " + computer + " = " + sum);


            //Check if odd or even and winner
            boolean oddOrEven = sum % 2 == 0;
                       if (oddOrEven == true) {
                System.out.println(sum + " is . . . even!");
                            if (input.equals("E")) {
                    System.out.println("That means " + name + " wins! :)");
                } else {
                    System.out.println("That means the computer won :( sorry " + name + " !");
                }
            } else {
            System.out.println(sum + " is . . . odd!");
                if (input.equals("O")) {
                    System.out.println("That means " + name + " wins! :)");
                } else {
                    System.out.println("That means the computer won :( sorry " + name + " !");
                }
            }
            System.out.println("----------------------------------------");


            //Check if player wants to play again
          // Scanner again = new Scanner(System.in);
           //System.out.println("Enter \"y\" to play again, any other key to quit.");
          // String repeat = again.next();
          // if (repeat.equals("y")) {
          //     play = "y";
          //  } else play = "n";
        }
    }

    }
