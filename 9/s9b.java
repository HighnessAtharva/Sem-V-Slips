/*Write a Multithreading program in java to convert smile face into the crying face after 5 seconds. */

import java.awt.*;

/* <applet code="Smileface.class" height=400 width=350></applet> */
public class s9b extends java.applet.Applet implements Runnable {
   Thread t;
   int f;

   public void init() {
      t = new Thread(this);
      t.start();
      f = 0;
   }

   public void run() {
      try {
         if (f == 0) {
            repaint();
            t.sleep(5000);
         } else {
            t.sleep(5000);
            repaint();
         }
      } catch (Exception e) {
      }
      run();
   }

   public void paint(Graphics g) {
      g.drawOval(100, 100, 100, 100); //face
      g.fillOval(120, 125, 20, 20); //left eye
      g.fillOval(160, 125, 20, 20); //right eye
      g.drawLine(150, 125, 150, 150); //nose 
      if (f == 0) {
         g.drawArc(130, 135, 40, 40, 0, -180); 
         f = 1;
      } else {
         g.drawArc(130, 170, 40, 40, 0, 180);
         f = 0;
      }
   }
}