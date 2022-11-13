/*Write a Socket program in java which displays the server machine’s date and time on the client machine.  */

import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(500);
            System.out.println("Server waiting for client");
            Socket client = ss.accept();
            System.out.println("Client Connected");
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF("Message recieved from Server: Current Time on Server's machine: " + new Date().toString());
            client.close();
            ss.close();
        } catch (IOException ie) {
        }
    }
}