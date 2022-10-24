import java.util.Scanner;
public class Programm_2 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println ("Hello !");
        System.out.println ("How much is 7*8 ?");
        int x = 0;
        x = myscan.nextInt ();
        if (x == 56) {
            System.out.println ("Correctly!");
        } else {
            System.out.println ("Wrong!");
        }
        System.out.println ("How much is 8*4 ?");
        int y = 0;
        y = myscan.nextInt ();
        if (y == 32) {
            System.out.println ("Correctly!");
        } else {
            System.out.println("Wrong!");
        }
        System.out.println ("How much is 25*65 ?");
        int z = 0;
        z = myscan.nextInt ();
        if (z == 1625) {
            System.out.println ("Correctly!");
        } else {
            System.out.println("Wrong!");
        }
    }
}
