import java.awt.*;

/* <applet code="Smileface.class" height=400 width=350>
</applet> */
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
            t.sleep(1000);
            f = 1;
            repaint();
         } else {
            t.sleep(1000);
            repaint();
            f = 0;
         }
      } catch (Exception e) {
      }
      run();
   }

   public void paint(Graphics g) {
      g.drawOval(100, 100, 100, 100);
      g.fillOval(120, 125, 20, 20);
      g.fillOval(160, 125, 20, 20);
      g.drawLine(150, 125, 150, 150);
      if (f == 0) {
         g.drawArc(130, 135, 40, 40, 0, -180);
         f = 1;
      } else {
         g.drawArc(130, 170, 40, 40, 0, 180);
         f = 0;
      }
   }
}