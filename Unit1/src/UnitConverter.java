public class UnitConverter {
    public static void main(String[] args) {
        System.out.println("Unit Converter");
        double tempF = 89;
        double tempC = (tempF-32) * 5.0/9;
        System.out.println(tempF + " degrees fahrenheit is " + tempC + " degrees celcius");
       tempF = tempC * 9 / 5 + 32; 
       System.out.println(tempF + " degrees fahrenheit is " + tempC + " degrees celcius");
  // ft to 
  final double CM_PER_INCH = 2.54;
  final int INCH_PER_FOOT = 12;
int feet = 6;
int inches = 0;  
double centimeters = (feet * (INCH_PER_FOOT*CM_PER_INCH) + inches * CM_PER_INCH);
    
System.out.println(feet + " ft. and " + inches + " inches is " + centimeters + " centimeters");

int totalInches = (int)(centimeters/CM_PER_INCH);
feet = (totalInches/INCH_PER_FOOT);
inches = (totalInches % INCH_PER_FOOT);
System.out.println(feet + " ft. and " + inches + " inches is " + centimeters + " centimeters");

    }

}
