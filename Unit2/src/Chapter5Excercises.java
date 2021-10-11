import java.util.Random;

public class Chapter5Excercises {

    public static void main(String[] args) {
        // 5.12.7
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        int c = random.nextInt(10) + 1;
        System.out.printf("%d, %d, %d \n", a, b, c);
        if (a + b < c) {
            System.out.println("not a triangle :(");
        } else if (b + c < a) {
            System.out.println("not a triangle :(");
        } else if (c + a < b) {
            System.out.println("not a triangle :(");
        } else {
            System.out.println("Triangle!");
        }

        // DIVIDER LINE: SEPARATES THE 5.12.7 AND 5.12.3
        int n = random.nextInt(10) + 1;
        System.out.println("n = " + n);
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            if (n>= 2) {
                System.out.println("Holy smokes, Fermat was wrong!");
            } else {
                System.out.println("this works since n is less than or equal to two");
            }
        } else {
            System.out.println("No, That doesnt work...");
        }
    }
}
