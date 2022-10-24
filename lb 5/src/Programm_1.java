import java.util.Scanner;
public class Programm_1 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println ("Take part in the lottery!");
        System.out.println ("Enter an integer from 0 to 100");
        int x = 0;
        x = myscan.nextInt ();
        if (x == 4) {
            System.out.println("Yes, JACKPOT, 1,000 dollars!");
        } else {
            System.out.println("Try again next time!");
        }
        System.out.println ("Enter an integer from 0 to 100");
        int y = 0;
        y = myscan.nextInt ();
        if (y == 10) {
            System.out.println("Yes, JACKPOT, 1,000 dollars!");
        } else {
            System.out.println("Try again next time!");
        }
        System.out.println ("Enter an integer from 0 to 100");
        int z = 0;
        z = myscan.nextInt ();
        if (z == 40) {
            System.out.println("Yes, JACKPOT, 1,000 dollars!");
        } else {
            System.out.println("Try again next time!");
        }
        System.out.println ("Enter an integer from 0 to 100");
        int w = 0;
        w = myscan.nextInt ();
        if (w == 89) {
            System.out.println("Yes, JACKPOT, 1,000 dollars!");
        } else {
            System.out.println("Try again next time!");
        }
    }
}
