import  java.net.*;
import java.io.*;

public class client
{
    public static void main(String args[])
    {
        try
        {
            Socket s = new Socket("localhost",2222);

            InputStream is=s.getInputStream();
            InputStreamReader isr= new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);

            OutputStream os=s.getOutputStream();
            PrintWriter pw= new PrintWriter(os,true);
            int msg=6;
            pw.println(msg);
            msg=br.read();
            System.out.println("factorial="+msg);
            s.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}