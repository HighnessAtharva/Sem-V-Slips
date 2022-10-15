/*<applet code= "s17b.class" height="600" width="600"></applet>*/

import java.awt.*;
import java.applet.*;

public class s17b extends Applet implements Runnable {
    int r, g1, y, i;
    Thread t;

    public void init() {
        r = 0;
        g1 = 0;
        y = 0;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                t.sleep(1000);
                g1 = 1;
                repaint();
                
                t.sleep(1000);
                y = 1;
                repaint();
            
                t.sleep(1000);
                r = 1;
                repaint();   
            }
         
        } catch (Exception e) {}
    }

    public void paint(Graphics g) {
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 225, 100, 100);
        g.drawOval(100, 350, 100, 100);
        g.drawString("start", 200, 200);
        if (r == 1) {
            g.setColor(Color.red);
            g.fillOval(100, 100, 100, 100);
            g.drawOval(100, 100, 100, 100);
            g.drawString("stop", 200, 200);
            r = 0;
        }
        if (g1 == 1) {
            g.setColor(Color.green);
            g.fillOval(100, 225, 100, 100);
            g1 = 0;
            g.drawOval(100, 225, 100, 100);
            g.drawString("go", 200, 200);
        }
        if (y == 1) {
            g.setColor(Color.yellow);
            g.fillOval(100, 350, 100, 100);
            y = 0;
            g.drawOval(100, 350, 100, 100);
            g.drawString("slow", 200, 200);
        }
    }
}