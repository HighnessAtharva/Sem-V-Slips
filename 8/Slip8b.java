/* Write a JDBC application using swing for the following: */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Slip8b extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3;
    JTextArea t1;
    Connection con;
    Statement stmt;
    String str;

    Slip8b() {
        l1 = new JLabel("Type DDL Query");
        b1 = new JButton("create table");
        b2 = new JButton("Alter table");
        b3 = new JButton("Drop table");
        t1 = new JTextArea(20, 20);
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(t1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setVisible(true);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (b1 == e.getSource()) {
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con = DriverManager.getConnection("jdbc:odbc:dsn");
                stmt = con.createStatement();
                str = t1.getText();
                int ans = stmt.executeUpdate(str);
                if (ans == 0)
                    JOptionPane.showMessageDialog(null, "Table created");
                else
                    JOptionPane.showMessageDialog(null, "Table NOT created");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (b2 == e.getSource()) {
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con = DriverManager.getConnection("jdbc:odbc:dsn");
                stmt = con.createStatement();
                str = t1.getText();
                int ans = stmt.executeUpdate(str);
                if (ans == 0)
                    JOptionPane.showMessageDialog(null, "Table Alter");
                else
                    JOptionPane.showMessageDialog(null, "Table NOT Alter");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (b3 == e.getSource()) {
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con = DriverManager.getConnection("jdbc:odbc:dsn");
                stmt = con.createStatement();
                str = t1.getText();
                int ans = stmt.executeUpdate(str);
                if (ans == 0)
                    JOptionPane.showMessageDialog(null, "Drop Table");
                else
                    JOptionPane.showMessageDialog(null, "Table NOT Droped");

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }

    public static void main(String a[]) {
        new Slip8b();
    }
}