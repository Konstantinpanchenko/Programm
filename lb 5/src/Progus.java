import java.util.Scanner;
public class Progus {
    public static void main(String[] args) {
        Scanner myscan = new Scanner (System.in);
        System.out.println ("Hello !");
        System.out.println ("How much is 25*5 ?");
        int x = 0;
        x = myscan.nextInt ();
        if (x == 125) {
            System.out.println ("Yes, it's cool!");
        } else {
            System.out.println ("An absolute lie!");
        }
        System.out.println ("How much is 48*6 ?");
        int y = 0;
        x = myscan.nextInt ();
        if (x == 288) {
            System.out.println("Yes, it's cool!");
        } else {
            System.out.println ("An absolute lie!");
        }
        System.out.println ("How much is 12*9 ?");
        int z = 0;
        x = myscan.nextInt ();
        if (x == 108) {
            System.out.println("Yes, it's cool!");
        } else {
            System.out.println ("An absolute lie!");
        }
    }
}
