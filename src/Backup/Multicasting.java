package Backup;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicasting {
	
	
	
	public Multicasting(int Port, String Address, String Msg){
		
		MulticastSocket Socket = null;
		InetAddress mcAddress = null;
		try {
			mcAddress = InetAddress.getByName(Address);
		} catch (UnknownHostException e) {
			System.out.println("Error while obtaining hosts Address \n");
			e.printStackTrace();
		}
		
		try {
			Socket = new MulticastSocket(Port);
		} catch (IOException e) {
			System.out.println("Error while obtaining port \n");
			e.printStackTrace();
		}
		
		System.out.println("At : " + Socket.getLocalSocketAddress());
		try {
			Socket.joinGroup(mcAddress);
		} catch (IOException e) {
			System.out.println("Error while joining multicast group! \n");
			e.printStackTrace();
		}
		
		
		
	}

}
