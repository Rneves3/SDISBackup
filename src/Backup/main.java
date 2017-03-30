package Backup;

public class main {
	
	
	public static void main(String[] args){
		
		
		int CRLF = 0xDA;
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
