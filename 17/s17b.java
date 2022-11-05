/*Write a java program to simulate traffic signal using multithreading. */

/*<applet code= "s17b.class" height="600" width="600"></applet>*/

import java.awt.*;
import java.applet.*;

public class s17b extends Applet implements Runnable {
    int red, green, yellow, i;
    Thread t;

    public void init() {
        red = 0;
        green = 0;
        yellow = 0;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                t.sleep(1000);
                green = 1;
                repaint();

                t.sleep(1000);
                yellow = 1;
                repaint();

                t.sleep(1000);
                red = 1;
                repaint();
            }

        } catch (Exception e) {
        }
    }

    public void paint(Graphics g) {
        g.drawOval(100, 100, 100, 100);
        g.drawOval(100, 225, 100, 100);
        g.drawOval(100, 350, 100, 100);
        g.drawString("start", 200, 200);
        if (red == 1) {
            g.setColor(Color.red);
            g.fillOval(100, 100, 100, 100);
            g.drawOval(100, 100, 100, 100);
            g.drawString("stop", 200, 200);
            red = 0;
        }
        if (green == 1) {
            g.setColor(Color.green);
            g.fillOval(100, 225, 100, 100);
            green = 0;
            g.drawOval(100, 225, 100, 100);
            g.drawString("go", 200, 200);
        }
        if (yellow == 1) {
            g.setColor(Color.yellow);
            g.fillOval(100, 350, 100, 100);
            yellow = 0;
            g.drawOval(100, 350, 100, 100);
            g.drawString("slow", 200, 200);
        }
    }
}