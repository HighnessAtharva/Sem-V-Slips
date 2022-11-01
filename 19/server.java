/*Write a Socket program in java which displays the server machine’s date and time on the client machine.  */

import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(5252);
            System.out.println("Server waiting for client");
            Socket client = ss.accept();
            System.out.println("Client Connected");
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream ps = new PrintStream(client.getOutputStream());
            Date d = new Date();
            System.out.println(br.readLine());
            ps.println("Message sent from Server: Current Time on Server's machine: " + d.toString());// write client
            br.close();
            ps.close();
            client.close();
            ss.close();
        } catch (IOException ie) {
        }
    }
}