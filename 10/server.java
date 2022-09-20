import java.net.*;
import java.io.*;

public class server
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss =new ServerSocket(2222);
            System.out.println("Server is started");
            while(true)
            {
                Socket s=ss.accept();
                System.out.print("Connection request Received");

                InputStream is=s.getInputStream();
                InputStreamReader isr= new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);

                OutputStream os=s.getOutputStream();
                PrintWriter pw= new PrintWriter(os,true);
                int no=br.read();
                int fact=1,i=0;
                while(no>i)
                {
                    fact=fact*no;
                    no--;
                }
                pw.println(fact);
                s.close();
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}