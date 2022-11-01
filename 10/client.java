import java.net.*;
import java.io.*;

class client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number");
        String str = "", str2 = "";
        str = br.readLine();
        dout.writeUTF(str);
        dout.flush();
        str2 = din.readUTF();
        System.out.println(str2);
        dout.close();
        s.close();
    }
}