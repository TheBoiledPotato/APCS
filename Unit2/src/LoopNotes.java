public class LoopNotes {
    public static void main(String[] args) {
        System.out.println("Loops!");
        long x = 1;
        long startTime = System.nanoTime();   
         while (x>0) {
            System.out.println(x);
            x--;
        }
        System.out.println("blast off!!!!!");
        long endTime = System.nanoTime();
       double elaspedTime = (endTime-startTime)/Math.pow(10, 9);
System.out.println(elaspedTime + " Seconds passed since the start");

        whileCounterLoop(12);

       /* otional */ forCounterLoop(12);

   //    alphebetLoop();
       
    //   passwordLoop();
       System.out.println(isPrime(63)); 
       System.out.println(squareRoot(51902));
    }
    public static void whileCounterLoop(int n) {
        int k=1;
        while (k<=n) {
            //do something here
            k++;
        }
    }
    public static void forCounterLoop(int n) {
        for (/* initlize */ int k=1; /* continue condition */ k<= n; /* increment */ k++) {

        }
    }
    public static void alphebetLoop(){
        int startChar = 1110;
        int endChar = 1200;

        for(int k =startChar; k <= endChar; k++) {
            System.out.println( (char) k);
        }
    }
    public static void passwordLoop(){
        for(char char1 = 'a'; char1 <= 'z'; char1++) {
            for (char char2 = 'a'; char2 <= 'z'; char2++) {
                for (char char3 = 'a'; char3 <= 'z'; char3++) {
                    for (char char4 = 'a'; char4 <= 'z'; char4++) {
                        System.out.println("" + char1 + char2 + char3 + char4);

                    }
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        int t = 2;
        
        while (t < n) {
            int divisable = n%t;
            if (divisable == 0) {
                return false;
            }
            t++;
        }
        return true;
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
