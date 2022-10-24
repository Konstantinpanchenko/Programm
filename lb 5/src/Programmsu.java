import java.util.Scanner;
public class Programmsu {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println ("Take part in the lottery!");
        System.out.println ("Enter an integer from 0 to 100");
        int x = 0;
        x = myscan.nextInt ();
        if (x == 56) {
            System.out.println("Yes, JACKPOT, 1,000,000 dollars!..");
        } else {
            System.out.println ("Try again next time!");
        }
    }
}
