import java.util.Scanner;

public class Change {
    @SuppressWarnings ("resource")

    public static void main(String[] args) {
   // final int ONE_DOLLAR = 1; // makes the ONE_DOLLAR var      
  // final double QUARTER = .25;
   Scanner in = new Scanner(System.in);

   System.out.println("insert amount cost: " );
  double amountCost = in.nextDouble();
  System.out.println("insert amount paid: ");
  double amountPaid = in.nextDouble();
  double changeBack = (amountPaid - amountCost);
  System.out.println("amount needed back is " + changeBack);
  int centsChangeBack = (int)(changeBack*100);
  System.out.println( centsChangeBack);
    int twentyBills = (centsChangeBack/2000);
    int moneyLeftFromTwenty = centsChangeBack%2000;
System.out.println("twenty dollar bills: {" + twentyBills +"}" + " Cents left over: " + moneyLeftFromTwenty);
int tenBills = (moneyLeftFromTwenty/1000);
int moneyLeftFromTens = (moneyLeftFromTwenty%1000);
System.out.println("ten dollar bills: {" + tenBills + "}" + " Cents left over: " + moneyLeftFromTens);
int fiveBills = (moneyLeftFromTens/500);
int moneyLeftFromFives = (moneyLeftFromTens%500);
System.out.println("five dollar bills: {" + fiveBills +"}" + " Cents left over: " + moneyLeftFromFives);
int oneBills = (moneyLeftFromFives/100);
int moneyLeftFromOnes = (moneyLeftFromFives%100);
System.out.println("one dollar bills: {" + oneBills +"}" + " Cents left over:" + moneyLeftFromOnes);
int fiftyCents =  (moneyLeftFromOnes/50);
int moneyLeftFromFiftyCents = (moneyLeftFromOnes%50);
System.out.println("50 cent coins: {" + fiftyCents +"}" + " Cents left over:" + moneyLeftFromFiftyCents);
int quarters = (moneyLeftFromFiftyCents/25);
int moneyLeftFromQuarters = (moneyLeftFromFiftyCents%25);
System.out.println("25 cent coins: {" + quarters + "} Cents left over:" + moneyLeftFromQuarters);
int dimes = (moneyLeftFromQuarters/10);
int moneyLeftFromDimes = (moneyLeftFromQuarters%10);
System.out.println("10 cent coins: {" + dimes + "} Cents left over:" + moneyLeftFromDimes);
int nickels = (moneyLeftFromDimes/5);
int moneyLeftFromNickels = (moneyLeftFromDimes%5);
System.out.println("5 cent coins: {" + nickels + "} Cents left over:" + moneyLeftFromNickels);
int pennies = (moneyLeftFromNickels);
System.out.println("Cents still left over {" + pennies + "}");



    }

}
// a program that makes change, calculates amout of change itll get
//ask user how much it cost, also how much they payed
// also Coinage