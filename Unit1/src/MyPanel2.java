import java.awt.*;
import javax.swing.*;

public class MyPanel2 extends JPanel{
  static final long serialVersionUID = 1;

  public MyPanel2(){
    setPreferredSize(new Dimension(450,500));
    setBackground(Color.WHITE);
  }

  public void paintComponent(Graphics g) {
  
    
   // button
int buttonX = this.getWidth()-200;
int buttonY = this.getHeight()-50;

g.fillRoundRect(buttonX,buttonY,100,40,15,150);
    g.setColor(Color.BLACK);
    g.setFont(new Font("Times New Roman", Font.BOLD, 20 ));
 g.drawString("OK",buttonX + 30,buttonY + 20 );

// draw box in lower right corner
g.setColor(Color.red);
g.fillRect(this.getWidth() - 20, this.getHeight() - 20, 20, 20);
}

}
