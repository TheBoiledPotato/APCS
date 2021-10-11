
public class HW {

    public static void main(String[] args) {

        String time = calcTime(4201, 0, 0);
        System.out.println(time);
        calcRoots(2, 6, -8);
        double volume = calcCylinderVolume(6, 12);
        System.out.printf("%.2f\n", volume);

    }

    public static String calcTime(int seconds, int min, int hr) {
        final int MINUTES = 60;
        final int HOURS = 3600;
        int hours = seconds / HOURS;
        int remainder = seconds % HOURS;
        int minutes = remainder / MINUTES;
        remainder = remainder % MINUTES;
        return String.format("%02d:%02d:%02d", hours, minutes, remainder);

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

    public static double calcCylinderVolume(double r, double h) {
        double v = Math.PI * h * (r * r);
        return (v);

    }
}