/* Write a JDBC application using swing for the following: */

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class s8b extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3;
    JTextArea t1;
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String USER = "root";
    static final String PASS = "";

    s8b() {
        setLayout(null);
        setSize(440, 350);

        l1 = new JLabel("Type DDL Query");
        b1 = new JButton("Create Table");
        b2 = new JButton("Alter Table");
        b3 = new JButton("Drop Table");
        t1 = new JTextArea();
        l1.setBounds(20, 30, 100, 20);
        t1.setBounds(150, 30, 250, 150);
        b1.setBounds(10, 250, 120, 20);
        b2.setBounds(130, 250, 120, 20);
        b3.setBounds(250, 250, 120, 20);
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setVisible(true); // add this command after all the components are added otherwise they won't show up.
    }

    public void actionPerformed(ActionEvent ae) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = conn.createStatement();) {
        if (ae.getSource() == b1) {
            // String str = t1.getText();
            st.executeUpdate("create table doctor1(Doctorid int,dname varchar(10),addr varchar(10))");
            JOptionPane.showMessageDialog(null, "Table created");
            conn.close();
        }
        if (ae.getSource() == b2) {
            // String str1 = t1.getText();
            st.executeUpdate("alter table doctor1 add ph_no int");
            JOptionPane.showMessageDialog(null, "Table altered");
            conn.close();
            }
        
        if (ae.getSource() == b3) {
                // String str1 = t1.getText();
                st.executeUpdate("drop table doctor1");
                JOptionPane.showMessageDialog(null, "Table dropped");
                conn.close();
                } 
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    
    

    public static void main(String args[]) {
        new s8b();
    }
}