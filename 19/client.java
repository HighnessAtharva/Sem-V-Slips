import java.io.*;
import java.net.*;

public class client {
    public static void main(String args[]) {
        try {
            Socket server = new Socket("localhost", 500);
            System.out.println("Client Connected");
            DataInputStream dis = new DataInputStream(server.getInputStream());
            System.out.print(dis.readUTF());
            server.close();
        } catch (IOException ie) {
        }
    }
}