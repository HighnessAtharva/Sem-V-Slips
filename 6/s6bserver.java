import java.net.*;
import java.io.*;
class s6bserver
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(500);
        System.out.println("Wait for client!");
        Socket s=ss.accept();
        System.out.println("Server accpted request");
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        DataInputStream dis=new DataInputStream(s.getInputStream());
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        while(true)
        {
            System.out.println("Client:");
            System.out.println(dis.readUTF()); //Receives info from client.            System.out.println("Server:");
            dos.writeUTF(br.readLine()); //sends response to client        }
    }
}
}