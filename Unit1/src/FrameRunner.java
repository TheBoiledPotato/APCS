import javax.swing.JFrame;

public class FrameRunner {

  public static void main(String[] args) {
    JFrame f = new JFrame("Nice"); 
    MyPanel2 p = new MyPanel2();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(p);
    f.pack();
    f.setVisible(true);
  }
}