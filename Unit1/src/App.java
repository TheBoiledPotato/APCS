import java.util.Scanner;

public class App {
    @SuppressWarnings ("resource")

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("enter number to see if its even!");
  int loop = 1;
  int twelve;
  twelve= in.nextInt();

if (twelve % 2 == 0) {
    System.out.println("number is even :)");
   twelve = in.nextInt();
   loop = loop + 1;
} else {
    System.out.println("number is odd :(");
   twelve = in.nextInt();
   loop = loop + 1;
}

}

}
