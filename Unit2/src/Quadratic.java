import java.util.Scanner;
@SuppressWarnings ("resource")
public class Quadratic {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("insert your A B and C values:");

        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not able to be converted to a double. :( ");
        }
        double a = in.nextDouble();

        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not able to be converted to a double. :( ");
        }
        double b = in.nextDouble();

        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not able to be converted to a double. :( ");
        }
        double c = in.nextDouble();
        calcRoots(a, b, c);

    }

    public static void calcRoots(double a, double b, double c) {
        double root1 = Math.sqrt(Math.pow(b, 2) - (4 * (a * c)));
        root1 = -b + root1;
        root1 = root1 / (2 * a);

        double root2 = Math.sqrt(Math.pow(b, 2) - (4 * (a * c)));
        root2 = -b - root2;
        root2 = root2 / (2 * a);
        System.out.printf("%.2f, or %.2f\n", root1, root2);
    }

}

