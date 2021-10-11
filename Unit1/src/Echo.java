import java.util.Scanner;

@SuppressWarnings ("resource")

    public class Echo {
   
public static void main(String[] args) {
final double CM_PER_INCH =2.54; // makes that equal 2.54, the amount of centimeters in an inch
final int IN_PER_FOOT = 12;
    Scanner in = new Scanner(System.in);
double cm;
System.out.println("Insert amount of centimeters to convert to feet!");
 cm = in.nextDouble(); // allows user to insert number
 double inchesFromCm =  cm/CM_PER_INCH;
 double remainderCm =  cm%CM_PER_INCH;
 System.out.println( cm + " is equal to " +(int) inchesFromCm + " inches " + "and " + remainderCm  + " centimeters left over");
 double ftFromInches = (int) inchesFromCm/IN_PER_FOOT;
 double remainderIn =  inchesFromCm % IN_PER_FOOT;
 System.out.println(cm + " centimeters is roughly " + (int) ftFromInches + " feet long and " + (int) remainderIn + " inches.");
    }
}
