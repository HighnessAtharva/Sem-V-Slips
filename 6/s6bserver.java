/*Write a Socket program in java for simple stand alone chatting application	 */

import java.net.*;
import java.io.*;

class s6bserver {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(500);
        System.out.println("Wait for client!");
        Socket client = ss.accept();
        System.out.println("Server accpted request");
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Client:");
            System.out.println(dis.readUTF()); // Receives info from client.
            System.out.println("Server:");
            dos.writeUTF(br.readLine()); // sends response to client }
        }
    }
}