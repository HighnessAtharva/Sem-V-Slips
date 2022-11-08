/*Write a Multithreading program in java to display the number’s between 1 to 100 
continuously in a TextField by clicking on button.	(use Runnable Interface) */

import java.awt.*;
import java.awt.event.*;

class s1b extends Frame implements ActionListener, Runnable {
     Button b1, b2;
     TextField txt1;
     int cnt;
     Thread t1 = new Thread(this, "txt1");

     public s1b() {
          setLayout(null);
          txt1 = new TextField();

          b1 = new Button("Start");
          b2 = new Button("Stop");
          txt1.setBounds(50, 50, 100, 100);

          b1.setBounds(50, 170, 100, 30);
          b2.setBounds(160, 170, 100, 30);
          add(txt1);

          b1.addActionListener(this);
          b2.addActionListener(this);
          add(b1);
          add(b2);
          setSize(400, 400);
          setVisible(true);
          cnt = 0;
          addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent e) {
                    System.exit(0);
               }
          });
     }

     public void actionPerformed(ActionEvent ae) {

          // str = ae.getActionCommand();
          if (ae.getSource()==b1) {
               t1.start();

          } else if (ae.getSource()==b2) {
               t1.stop();

          }
     }

     public void run() {
          try {
               for (int i = 1; i <= 100; i++) {
                    txt1.setText("" + i);
                    t1.sleep(150);

               }
          } catch (Exception ex) {
               ex.printStackTrace();
          }
     }

     public static void main(String[] args) {
          new s1b();
     }
}