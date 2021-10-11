import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JPanel;

public class CurrencyPanel extends JPanel {
  static final long serialVersionUID = 1;
  double input;

  public CurrencyPanel() {
    setPreferredSize(new Dimension(400, 300));
    setBackground(Color.BLACK);
    Scanner in = new Scanner(System.in);
    System.out.println("How much USD do you want to convert?");
    input = in.nextDouble();
  }

  public void paintComponent(Graphics g) {
    // Scanner in = new Scanner(System.in);
    final double EUROS = .84;
    final double BRITISH_POUNDS = .78;
    final int KNUTS_IN_GALLEON = 493;
    final int KNUTS_IN_SICKLES = 29;
    final int CENTS_IN_DOLLARS = 100;
    double amountOfEuros = input * EUROS;
    double amountOfPounds = input * BRITISH_POUNDS;
    int amountOfCents = (int) (input * CENTS_IN_DOLLARS);
    int amountGalleons = amountOfCents / KNUTS_IN_GALLEON;
    int knutsRemaining = amountOfCents % KNUTS_IN_GALLEON;
    int amountOfSickles = knutsRemaining / KNUTS_IN_SICKLES;
    knutsRemaining = knutsRemaining % KNUTS_IN_SICKLES;

    // System.out.printf("%.2f USD is equal to: %.2f Euros \n", input, amountOfEuros
    // );
    // System.out.printf("%.2f USD is equal to: %.2f British Pounds \n", input,
    // amountOfPounds);

    // visual component
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.fillRect(getWidth()-1 , getHeight()-1 , getWidth()+200 , getHeight()+200 );

    String inputString = String.format("You inputted: %.2f USD.", input);
    String euroString = String.format("%.2f USD equals %.2f Euros", input, amountOfEuros);
    String gbpString = String.format("%.2f USD equals %.2f British Pounds", input, amountOfPounds);
    String hpString = String.format("%.2f USD equals %d Galleons, %d Sickles, and %d Knuts ", input, amountGalleons,
        amountOfSickles, knutsRemaining);
    g.drawString(inputString, 10, 35);
    g.drawString(euroString, 10, 85);
    g.drawString(gbpString, 10, 135);
    g.drawString(hpString, 10, 185);

  }
}