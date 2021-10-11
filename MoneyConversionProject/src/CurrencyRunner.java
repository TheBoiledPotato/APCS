import javax.swing.JFrame;
// import java.util.Scanner;
public class CurrencyRunner {

  public static void main(String[] args) {
  
   JFrame f = new JFrame("Money Converter: a classic!"); //does this happen at the end or the beginning? (for whole section)
    CurrencyPanel p = new CurrencyPanel();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(p);
    f.pack();
    f.setVisible(true);
  }
}