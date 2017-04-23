package Backup;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Multicasting {
	
	private String msg;
	public MulticastSocket mcSocket, mdbSocket, mdrSocket;
	
	
	public void mcMulticast(int Port, InetAddress Address){
		
		try {
		} catch (UnknownHostException e) {
			System.out.println("Error while obtaining hosts Address \n");
			e.printStackTrace();
		}
		
		try {
			mcSocket = new MulticastSocket(Port);
		} catch (IOException e) {
			System.out.println("Error while obtaining port \n");
			e.printStackTrace();
		}
		
		System.out.println("At : " + Socket.getLocalSocketAddress());
		try {
			mcSocket.joinGroup(Address);
		} catch (IOException e) {
			System.out.println("Error while joining multicast group! \n");
			e.printStackTrace();
		}
		
		
		
	}
	
	public void mdbMulticast(int Port, InetAddress){
		
		try {
		} catch (UnknownHostException e) {
			System.out.println("Error while obtaining hosts Address \n");
			e.printStackTrace();
		}
		
		try {
			mdbSocket = new MulticastSocket(Port);
		} catch (IOException e) {
			System.out.println("Error while obtaining port \n");
			e.printStackTrace();
		}
		
		System.out.println("At : " + Socket.getLocalSocketAddress());
		try {
			mdbSocket.joinGroup(Address);
		} catch (IOException e) {
			System.out.println("Error while joining multicast group! \n");
			e.printStackTrace();
		}
		
	}
	
	
	public void mdrMulticast(int Port, InetAddress){
		
		try {
		} catch (UnknownHostException e) {
			System.out.println("Error while obtaining hosts Address \n");
			e.printStackTrace();
		}
		
		try {
			mdrSocket = new MulticastSocket(Port);
		} catch (IOException e) {
			System.out.println("Error while obtaining port \n");
			e.printStackTrace();
		}
		
		System.out.println("At : " + Socket.getLocalSocketAddress());
		try {
			mdrSocket.joinGroup(Address);
		} catch (IOException e) {
			System.out.println("Error while joining multicast group! \n");
			e.printStackTrace();
		}
		
	}

}
