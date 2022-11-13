/*Write a Multithreading program in java for bouncing ball. For each bounce change the color of ball randomly.  */

import java.awt.*;

/*<applet code="s20b.class" height=400 width=350></applet>*/
public class s20b extends java.applet.Applet implements Runnable {
    Thread t;
    int f, y, f1, f2, f3;

    public void init() {
        t = new Thread(this);
        t.start();
        f = 0;
        y = 0;
        f1 = 0;
    }

    public void run() {
        try {
            if (f == 0) {
                t.sleep(10);
                y = y + 5;
                repaint();
                if (f1 == 6)
                    f1 = 0;
            }
            if (f == 1) {
                t.sleep(10);
                y = y - 5;
                repaint();
                if (f1 == 6)
                    f1 = 0;
            }
        } catch (Exception e) {
        }
        run();
    }

    public void paint(Graphics g) {
        if (f == 0) {
            if (f1 == 1)
                g.setColor(Color.green);
            if (f1 == 2)
                g.setColor(Color.blue);
            if (f1 == 3)
                g.setColor(Color.red);
            if (f1 == 4)
                g.setColor(Color.yellow);
            if (f1 == 5)
                g.setColor(Color.orange);
            g.fillOval(150, y + 10, 20, 20);
            if (y == 400) {
                f1++;       // change color
                f = 1;      // change direction
            }
        }
        if (f == 1) {
            if (f1 == 1)
                g.setColor(Color.green);
            if (f1 == 2)
                g.setColor(Color.blue);
            if (f1 == 3)
                g.setColor(Color.red);
            if (f1 == 4)
                g.setColor(Color.yellow);
            if (f1 == 5)
                g.setColor(Color.orange);
            g.fillOval(150, y - 10, 20, 20);
            if (y == 0) {
                f1++;       // change color
                f = 0;      // change direction
            }
        }
    }
}