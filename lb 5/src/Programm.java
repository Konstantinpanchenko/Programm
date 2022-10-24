import java.util.Scanner;
class Programm {
    public static void main (String [] args) {
        System.out.print ("Enter the number 1, 2 or 3");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println("You entered the number 1");
        }
        else if (i==2) {
            System.out.println("You entered the number 2");
        }
        else if (i==3) {
            System.out.println("You entered the number 3");
        }
        else {
            System.out.println ("You entered a number not equal to 1, 2 or 3");
        }
    }
}
