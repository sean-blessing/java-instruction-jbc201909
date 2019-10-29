package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;
import util.Console;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Contact Manager App\n");
		int command = 0;
		List<Contact> contacts = new ArrayList<>();
		
		while (command!=9) {
			command = Console.getInt(getMenu(), 0, 10);
			switch (command) {
			case 1:
				// list contacts
				System.out.println("List all contacts:");
				break;
			case 2:
				// list contacts w/ no phone #
				System.out.println("Contacts missing phone #:");
				break;
			case 3:
				// list contacts w/ no email
				System.out.println("Contacts missing email:");
				break;
			case 9:
				// exit
				break;
			default:
				// bad command
				System.out.println("Invalid command: "+command);
				break;
			}
		}
		
		System.out.println("Bye");
	}
	
	private static String getMenu() {
		String str = "COMMAND MENU:\n"+
					 "1 - List contacts\n"+
					 "2 - List contacts w/ no phone #\n"+
					 "3 - List contacts w/ no email\n"+
					 "9 - Exit\n"+
					 "Command: ";
		return str;
	}

}
