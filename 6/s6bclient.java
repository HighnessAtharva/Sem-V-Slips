/*Write a Socket program in java for simple stand alone chatting application	 */

import java.net.*;
import java.io.*;

class s6bclient {
    public static void main(String[] args) throws Exception {
        Socket server = new Socket("localhost", 500);
        System.out.println("Client send request to server!");
        DataOutputStream dos = new DataOutputStream(server.getOutputStream());
        DataInputStream dis = new DataInputStream(server.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Client:");
            dos.writeUTF(br.readLine()); // send response to server.
            System.out.println("Server:");
            System.out.println(dis.readUTF()); // Received from server. }
        }
        
    }
}