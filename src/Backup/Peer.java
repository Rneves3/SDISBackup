package Backup;

import java.net.InetAddress;

public class Peer {

	private boolean initiator = false;
	private String message;
	private String fileID, chunkID, peerID, RepDegree;
	private InetAddress mcAddress, mdbAddress, mdrAddress;
	private int mcPortNumber, mdbPortNumber, mdrPortNumber;
	private Multicasting mc, mdb, mdr;
	
	
	public String getMessage(){
		
		return message;
		
	}
	
	public String getfileID(){
		
		return fileID;
		
	}
	
	public String getchunkID(){
		
		return chunkID;
		
	}
	

	public String getpeerID(){
	
	return peerID;
	
}
	
	public void setpeerID(String ID){
		
		peerID = ID;
		
	}


	public String getRepDegreeID(){
	
	return RepDegree;
	
}
	
	public InetAddress getMcAddress(){
		
		return mcAddress;
		
	}
	
	public void setMcAddress(InetAddress Address){
		
		mcAddress = Address;
		
	}
	
	public InetAddress getMdbAddress(){
		
		return mdbAddress;
		
	}
	
	public void setMdbAddress(InetAddress Address){
		
		mdbAddress = Address;
		
	}
	
	public InetAddress getMdrAddress(){
		
		return mdrAddress;
		
	}
	
	public void setMdrAddress(InetAddress Address){
		
		mdrAddress = Address;
		
	}
	
	public int getMcPort(){
		
		return mcPortNumber;
		
	}
	
	public int getMdbPort(){
		
		return mdbPortNumber;
		
	}
	
	public int getMdrPort(){
		
		return mdrPortNumber;
		
	}
	
	
	public static void main(String[] args) throws IOException{
		
		String mcS, mdbS, mdrS;
		
		if(args == null){
			System.out.println("To run the system, you need 4 arguments in the following order : <SenderID> <McAddres>:<McPortNumber> <MdbAddress>:<MdbPortNumber and <MdrAddress>:<MdrPortNumber> ");
			return;
			
		}
		
		if(args.length != 4){
			System.out.println("Wrong Number of Arguments. Arguments are <SenderID> <McAddres>:<McPortNumber> <MdbAddress>:<MdbPortNumber and <MdrAddress>:<MdrPortNumber>");
			return;
		}
		
		
		setpeerID(Integer.parseInt(args[0]));
		
		mcS = args[1];
		mdbS = args[2];
		mdrS = args[3];
		
		mcAddress = mcS.split(":")[0];
		mcPortNumber = Integer.parseInt(mcS.split(":")[1]);
		mdbAddress = mdbS.split(":")[0];
		mdbPortNumber = Integer.parseInt(mdbS.split(":")[1]);
		mdrAddress = mdrS.split(":")[0];
		mdrPortNumber = Integer.parseInt(mdrS.split(":")[1]);
		
		mc.mcMulticast(mcPortNumber, mcAddress);
		mdb.mdbMulticast(mdbPortNumber, mdbAddress);
		mdr.mdrMulticast(mdrPortNumber, mdrAddress);
		
		
		
		
	}
	
	
}
