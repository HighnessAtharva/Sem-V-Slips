import java.io.*;
import java.net.*;

public class client {
    public static void main(String args[]) {
        try {
            Socket server = new Socket("127.0.0.1", 5252);
            System.out.println("Client Connected");
            BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
            PrintStream ps = new PrintStream(server.getOutputStream());
            ps.println("Message sent from Client: Hello Server");
            System.out.println(br.readLine());
            br.close();
            ps.close();
            server.close();
        } catch (IOException ie) {
        }
    }
}