public class Algorithims {

    public static void main(String[] args) {
        
    System.out.printf("factorial: %d", factorial(1)); 
    System.out.printf("fibonacci: %d", fibonacci(3));
    System.out.printf("is this number 3? %b \n", isThree(11302));
    }

    public static int factorial(int n) {
        int t = n-1;
       int ans = n;

        while (t > 1) {
           ans = ans*t;
            t--;
        }
        return ans;
    }
    public static int fibonacci(int n) {
        int t = 1;
        int x0 = 0;
        int x1 = 1;
        while ( t < n) {
         int x2 = x0+x1;
         x0 = x1;
         x1 = x2;
         t++;
        }
        return x1;
    }
    public static boolean isThree(int n) {
        while (n > 0) {
           int three = (int) n%10;
            if (three == 3) {
               return true; 
            } else {
                n = n/10;
            }
        }
        
        return false;

    }
}
    
