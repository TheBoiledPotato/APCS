import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    @SuppressWarnings ("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.print("insert number between 1-20: ");
        int playerNumber = in.nextInt();
System.out.printf("your number: %d \ncomputers number: %d \namount you were off by: %d \n", playerNumber, number, playerNumber-number);
    }
    
}