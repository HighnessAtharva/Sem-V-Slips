/*Write a java program to display IP Address and Name of client machine. */

import java.net.InetAddress;

public class s1a {
	public static void main(String[] args) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("Local HostAddress:  " + addr.getHostAddress());
		System.out.println("Local host name: " + addr.getHostName());
	}
}
