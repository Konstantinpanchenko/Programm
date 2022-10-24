import java.util.Scanner;
class Test {
    public static void main(String [] args) {
        System.out.print("Enter any 2 integers:");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(number1 + number2);
    }
}


