import java.util.*;

public class PhoneDirectory_Lab {
	// Class variables
	static PhoneRecord[] records = new PhoneRecord[50];
	static int recordCount = 0;
	static Scanner sc ;


	public static void main(String[] args) {


		// Display list of commands
		System.out.println("Phone directory commands:\n"
				+ "  a - Add a new phone number\n"
				+ "  d - Display All\n"
				+ "  da - Display All w/ same Last Name\n"
				+ "  f- Find a Phone Number\n"
				+ "  r- Remove a Phone Number\n"
				+ "  rc- Remove all Records w/ Same zip code\n"
				+ "  q - Quit\n");

		// Read and execute commands
		while (true) {
			sc= new Scanner(System.in);

			// Prompt user to enter a command
			System.out.print("Enter command (a, d, da, f, r, rc or q): ");
			String command = sc.nextLine();
			
			if (command.equalsIgnoreCase("a")) {
				addNumber();
			} 
			else if (command.equalsIgnoreCase("d")) {
				displayRecords();
			}
			else if(command.equalsIgnoreCase("da")){
				displayAllLastName();
			}
			else if(command.equalsIgnoreCase("f")){
				findNumber();
			}
			else if(command.equalsIgnoreCase("r")){
				removeNumber();
			}
			else if(command.equalsIgnoreCase("rc")){
				removeallSameZipCode();
			}
			else if (command.equalsIgnoreCase("q")) {
				System.exit(0);
				
				break;
			}
			else {

				// Command is illegal. Display error message.
				System.out.println("Command was not recognized; "
						+ "please enter only a, d or q.");
			}

			System.out.println();
		}
	}
	private static void addNumber() {
//this method adds a phone record, ie. first name, lastname,
//phone number and zipcode		
			System.out.println("Enter first name: ");
	        String firstName = sc.nextLine();
	        
			System.out.println("Enter last name: ");
	        String lastName = sc.nextLine();
	        
	        System.out.println("Enter new phone number: ");
	        String number = sc.nextLine();
	        
	        System.out.println("Enter zip code: ");
	        String zipCode=sc.nextLine();
	        
	        records[recordCount] = new PhoneRecord(firstName, lastName, number, zipCode);
	        recordCount++;
	        System.out.println("1 record added. Total records added: " + recordCount);
	       
		
	}
	

	private static void displayRecords() {
		for(int i=0; i<recordCount; i++){
			System.out.println("Name: "+ records[i].getName()+"\n"+ "Number: "+ records[i].getNumber()+"\n"+ "Zip: " + records[i].getZipCode());
		}
	}
	
	private static void displayAllLastName(){
		System.out.println("Enter a last name: ");
		String lastNameda=sc.next();
		
		for(int i=0; i<recordCount; i++){
			if(records[i].getLastName().equals(lastNameda)){
				System.out.println("Name: "+ records[i].getName()+"\n"+ "Number: "+ records[i].getNumber()+"\n"+ "Zip: " + records[i].getZipCode());
			}
		}
	}
	
	private static void findNumber(){
		System.out.println("Enter a first name to look up: ");
		String nameda=sc.next();
		
		for(int i=0; i<recordCount; i++){
			if(records[i].getFirstName().equals(nameda)){
				System.out.println("Name: "+ records[i].getName()+"\n"+ "Number: "+ records[i].getNumber()+"\n"+ "Zip: " + records[i].getZipCode());
			}
		}	
	}
	
	private static void removeNumber(){
		System.out.println("Enter a phone number: ");
		String numberda=sc.next();
		int index=0;
		boolean find=true;
		
		for(int i=0; i<recordCount; i++){
			if(records[i].getNumber().equals(numberda)){
				index=i;
				for(int j=index; j<recordCount; j++){
					records[j]=records[j+1];
				}
				System.out.println("Record with the phone number " + numberda +" is deleted.");
				records[recordCount-1]=null;
				recordCount--;
				find=true;	
			}
			else{
				find=false;
			}
		}
		if(!find){
			System.out.println("The phone number does not exist.");
		}
	}
	
	private static void removeallSameZipCode(){
		System.out.println("Enter a zip code: ");
		String zipda=sc.next();
		
		for(int i=0; i<recordCount; i++){
			if(records[i].getZipCode().equals(zipda)){
				records[i]=null;
				
				System.out.println("The record with the zip code "+ zipda+ " has been deleted.");
			}
			else{
				System.out.println("The zip code does not match. ");
			}
		}
	}
}
