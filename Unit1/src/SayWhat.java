public class SayWhat {
    public static void main(String[] args) {
        sayHow("pog", 5);
        double result = cube(16); // dont forget to hold on to the value returned from a method
        System.out.println(result);
        System.out.println("pog");
        System.out.println("pog");
     //   stackOverflowTest(1);
    }

    public static void sayWhere() {
        System.out.println("what?");
    }

    public static void sayWhy() {
        System.out.println("why?");

    }

    public static void sayWho() {

    }

    // parameters
    public static void sayHow(String str, int x) { // The type and order of pararamaters must match the exceptions
        double squared = Math.pow(x, 2);
        System.out.println("you said " + str + " and " + squared);

    }

    public static double cube(double x) {
        double cubed = Math.pow(x, 3);
        // DONT SYSOUT FROM A METHOOD WITH ONE JOB TO DO!!!!!!!!!!!!!!!!!!!!!
        return cubed;
    }

    public static void stackOverflowTest(int count) {
   //     System.out.println("On stack frame number " + count);
     //   stackOverflowTest( + 1);

    }
}
