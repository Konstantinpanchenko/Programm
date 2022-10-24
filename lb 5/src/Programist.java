import java.util.Scanner;
public class Programist {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println ("Hello !");
        System.out.println ("Enter the first number");
        double x = 0;
        x = myscan.nextDouble ();
        System.out.println ("Enter the second number");
        double y = 0;
        y = myscan.nextDouble ();
        System.out.println (x + y);
    }
}
