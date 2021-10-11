public class SquareRoots6_2 {
    
    public static void main(String[] args) {
        System.out.print("the square root is ");
        System.out.println(squareRoot(36)); 
    }

    public static double squareRoot(double a) {
        double x0 = a/2;
        double x1 = (x0 + a/x0)/2;
        while ( Math.abs(x0-x1) > .0001/* INSERT HERE */) {
            x0 = x1;
            x1 = (x0 + a/x0)/2;            
        }
        return x0;
    }
}
