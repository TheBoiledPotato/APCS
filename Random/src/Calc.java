public class Calc {

    public static void main(String[] args) {
        getLcgNum(10);
    }

    public static void getLcgNum(int i) {
        int t = 1;
        long r = 0;
        while (t <= 100) {
           long seed =  System.nanoTime();
        
            r = (7*seed-121)%(i+1);
            if (t%10 == 0) {
            System.out.println(r); 
            } else {
                System.out.print(r + " ");
            }
            try {
                Thread.sleep(0);
            } catch (Exception e) {
                System.out.println(e);
            }
            t++;
        }

    }
}
