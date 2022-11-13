/*Write a Socket program in java in which client accept a number, send it to the server, 
server calculates its factorial and sends result to the client. */

import java.net.*;
import java.io.*;

class server

{
    public static void main(String args[]) throws Exception

    {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        System.out.println("server here..");
        int n = Integer.parseInt(din.readUTF());
        System.out.println("given no is: " + n);
        int f = 1;
        for (; n > 0; n--)
            f = f * n;
        System.out.println("Factorial value is: " + f);
        dout.writeUTF("Factorial value is: " + f);
        dout.flush();
        din.close();
        s.close();
        ss.close();
    }
}