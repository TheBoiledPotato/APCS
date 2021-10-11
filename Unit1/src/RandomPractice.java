import java.util.Random;

public class RandomPractice {  
    public static void main(String[] args) {
        Random myRNG = new Random();
    /* int r = myRNG.nextInt(10); // 0-9
     int s = myRNG.nextInt(10)+1; //1-10 */
     int d1 = myRNG.nextInt(6)+1;  
     int d2 = myRNG.nextInt(6)+1;
    // System.out.println(d1);
   //  System.out.println(d2);
     int sum = d1+d2;
     System.out.printf("roll one: %d \nroll two: %d \nthe sum of rolls are: %d \n\n\n\n\n", d1, d2, sum); 
     double pog = myRNG.nextDouble(); //between 0 and 0.999999999999
double bonus = myRNG.nextDouble()* 50 +50; // between 50 and 99.99
System.out.printf("your bonus cash is: %.2f \n", bonus);
System.out.println(pog );
    }
}
