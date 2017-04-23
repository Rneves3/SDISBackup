package Backup;

public class McListener extends Thread{

	private String name, senderID, fileID, chunkID;
	private String CRLF = "\r\n";
	
	
	public void run() {
		
		Thread handler;
		
		try{
			while(true){
				
				DatagramPacket request = getMulticastData();
				handler = request;
				handler.start();
				
				byte[] body_msg;
				String[] header_msg;
				String packetData = new String(packet.getData(),0,packet.getLength());
				body_msg = packetData.split(CRLF + CRLF);
				header_msg = packetData[0].split(" ");
				
			}
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}
		
		
		
		
	}
	
}
