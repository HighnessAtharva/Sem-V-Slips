/* Write a Multithreading program in java using Runnable interface to move text on the frame as follow: */

import java.awt.*;
import java.awt.event.*;

class s15b extends Frame implements Runnable {
    Label l1;
    Thread t;
    int x, y, side;

    public s15b() {
        setLayout(null);
        l1 = new Label("Atharva");
        l1.setFont(new Font("", Font.BOLD, 14));
        l1.setForeground(Color.red);
        setSize(400, 400);
        setVisible(true);
        t = new Thread(this);
        t.start();
        x = 5;
        y = 200;
        side = 1;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void run() {
        try {
            if (side == 1) {
                t.sleep(50);
                l1.setBounds(x += 5, y -= 5, 70, 15);
                add(l1);
                if (y == 20)
                    side = 2;
            }
            if (side == 2) {
                t.sleep(50);
                l1.setBounds(x += 5, y += 5, 70, 15);
                add(l1);
                if (y == 200)
                    side = 3;
            }
            if (side == 3) {
                t.sleep(50);
                l1.setBounds(x -= 5, y += 5, 70, 15);
                add(l1);
                if (y == 390)
                    side = 4;
            }
            if (side == 4) {
                t.sleep(50);
                l1.setBounds(x -= 5, y -= 5, 70, 15);
                add(l1);
                if (x == 0) {
                    side = 1;
                    x = 0;
                    y = 200;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        run();
    }

    public static void main(String args[]) {
        new s15b();
    }
}