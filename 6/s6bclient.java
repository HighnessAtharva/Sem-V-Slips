
import java.net.*;
import java.io.*;
class s6bclient
{
    public static void main(String[] args) throws Exception
    {
        Socket s=new Socket("localhost",500);
        System.out.println("Client send request to server!");
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        while(true)
        {
            System.out.println("Client:");
            dos.writeUTF(br.readLine()); //send response to server.            
            System.out.println("Server:");
            System.out.println(dis.readUTF()); //Received from server.        }
    }
}
}