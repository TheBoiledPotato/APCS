import java.util.Scanner;

public class TimeConversion {
    @SuppressWarnings ("resource")
    public static void main(String[] args) {
     final int MINUTES = 60; 
     final int HOURS = 3600;
        Scanner in = new Scanner(System.in);
        System.out.println("insert amount of seconds");
        int seconds = in.nextInt();
int amountOfHours = seconds/HOURS;
int remainder = seconds%HOURS;
int amountOfMinutes = remainder/MINUTES;
remainder = remainder % MINUTES;
System.out.printf("%d seconds equals: %d hours, %d minutes, and %d seconds. \n", seconds, amountOfHours, amountOfMinutes, remainder );

    }

}