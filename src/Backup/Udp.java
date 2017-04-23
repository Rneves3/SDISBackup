package Backup;

public class  Udp{
	
	
	public static void main(String[] args){
		
		Multicasting MC, MDB, MDR;
		Char CR = '\r';
		Char LF = '\n';
		String msg;
		char space = ' ';
		int iD;
		
		
		if(args.length > 3){
			
			System.out.println("Wrong number of Arguments \n");
			
		}
		
		switch(args[2]){
		
		case "BACKUP":
			//backup
			break;
		case "RESTORE":
			//restore
			break;
		case "DELETE":
			//delete
			break;
		case "MANAGE":
			//manage storage
			break;
		case "INFORMATION":
			//retrieve local state info
			break;
		default:
			break;
		
		
		}
		
	}

}
