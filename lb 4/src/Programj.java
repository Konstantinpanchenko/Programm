import java.util.Scanner;
class Programj {
    public static void main(String [] args){
        System.out.print("Enter multiple word or phrases at once:");
        Scanner scan = new Scanner(System.in);
        String phrase1 = scan.nextLine();
        String phrase2 = scan.nextLine();
        System.out.print(phrase1 + "" + phrase2);
    }
}
