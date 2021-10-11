import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
  static final long serialVersionUID = 1;

  public MyPanel(){
    setPreferredSize(new Dimension(450,500));
    setBackground(Color.WHITE);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
        g.setColor(Color.WHITE);
    g.drawRect(80,20,100,20);
        g.setColor(Color.darkGray);
    g.fillArc(70, 370, 200, 450, 250, 360); // g.fillArc(x, y, width, height, startAngle, arcAngle);
        g.setColor(Color.lightGray);
    g.fillArc( 25, 75, 300, 300, 0, 360); // makes head
        g.setColor(Color.BLACK);
    g.drawString("Hi!",100,35);
    g.fillArc (75, 150, 50, 150, 90, 360); //left eye 
    g.fillArc(250, 150, 50, 150, 90, 360); // right eye
    g.setColor(Color.YELLOW);
    g.fillArc(200, 300, 150, 50, 90, 360); // beak
   // g.fillArc(x, y, width, height, startAngle, arcAngle);
    // g.drawArc(x, y, width, height, startAngle, arcAngle);
    
}

}