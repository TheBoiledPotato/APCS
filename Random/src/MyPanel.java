import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
    static final long serialVersionUID = 1;

    public MyPanel() {
        setPreferredSize(new Dimension(640, 480));
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRandomWalk(g);
    }

    public void drawRandomWalk(Graphics g) {
        g.setColor(Color.blue);
        int l = 320;
        int h = 240;
        int inc = 10;
        while ( l > 0 && h > 0 && l < 640 && h < 480) {
            int x = (int) getLcgNum();
            if (x == 3) {
                g.drawLine(l, h, l + inc, h);
                l = l + inc;
            } else if (x == 1) {
                g.drawLine(l, h, l - inc, h);
                l = l - inc;
            } else if (x == 0) {
                g.drawLine(l, h, l, h + inc);
                h = h + inc;
            } else {
                g.drawLine(l, h, l, h - inc);
                h = h - inc;
            }
            
        }
    }

    //
    public int getLcgNum() {
        int i = 4;
        long r = 0;
        long seed = System.nanoTime() >> 8;
        r = (9 * seed - 127) % (i);
        return (int) r;
    }
}
