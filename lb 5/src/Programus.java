import java.util.Scanner;
public class Programus {
    public static void main (String [] args) {
        System.out.print ("Enter the number 1");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println("You entered the number 1");
        }
        else {
            System.out.println ("You entered a number not equal to 1");
        }
    }
}
