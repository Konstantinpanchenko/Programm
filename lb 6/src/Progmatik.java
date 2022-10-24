public class Progmatik {
    public static void main(String[] args) {
        System.out.println ("Hello !");
        int i = 1, sum = 1;
        for (i = 2; i <= 6; i+= 2)
            sum -= i;
        sum += i;
        System.out.println(sum);
    }
}

