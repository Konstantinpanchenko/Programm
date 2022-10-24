import java.util.Scanner;
public class Programs {
    public static void main(String [] args) {
        System.out.println("Enter 10");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case 1: System.out.println ("You entered the number 10"); break;
            default: System.out.println("You entered the wrong number");
        }
    }
}
