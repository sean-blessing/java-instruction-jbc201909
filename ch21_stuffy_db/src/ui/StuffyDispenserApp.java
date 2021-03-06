package ui;

import java.util.ArrayList;
import java.util.Iterator;

import business.Stuffy;
import db.StuffyDB;
import util.Console;

public class StuffyDispenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App");
		
		int command = 0;
		while (command != 6) {
			command = Console.getInt(getMenu(), 0, 7);
			switch (command) {
				case 1:
					//List all stuffies
					ArrayList<Stuffy> stuffies = sdb.list();
					
					// option 1 - indexed for loop
//					for (int i=0; i< stuffies.size(); i++) {
//						Stuffy s = stuffies.get(i);
//						System.out.println(s);
//					}
					// option 2 - enhanced for loop / for-each
//					for (Stuffy s: stuffies) {
//						System.out.println(s);
//					}
					// option 3 - iterator
//					Iterator<Stuffy> si = stuffies.iterator();
//					while (si.hasNext()) {
//						Stuffy s = si.next();
//						System.out.println(s);
//
//					}
					// option 4 - streams
					stuffies.stream().forEach(s -> System.out.println(s));
					break;
				case 2:
					// Get
					int id = Console.getInt("ID:  ");
					Stuffy s = getStuffy(id);
					break;
				case 3:
					// Add - prompt user for stuffy values
					String type = Console.getString("Type:  ");
					String color = Console.getString("Color:  ");
					String size = Console.getString("Size:  ");
					int limbs = Console.getInt("Limbs:  ");
					s = new Stuffy(type, color, size, limbs);
					int rowCount = sdb.add(s);
					System.out.println(rowCount+" rows affected.");
					break;
				case 4:
					// Edit
					break;
				case 5:
					// Delete
					break;
				case 6:
					// Exit
					break;
				default:
					// Error
					System.out.println("Invalid command!");
					break;	
			}
			
		
		}
		
		System.out.println("Bye");

	}
	
	private static String getMenu() {
		String menu = "COMMAND:\n" +
					  "1 - List\n" +
					  "2 - Get\n" +
					  "3 - Add\n" +
					  "4 - Edit\n" +
					  "5 - Delete\n" +
					  "6 - Exit\n" +
					  "Command:  ";
		return menu;
	}
	
	private static Stuffy getStuffy(int id) {
		Stuffy s = sdb.get(id);
		if (s!=null) {
			System.out.println("Stuffy:  ");
			System.out.println(s);
		}
		else {
			System.out.println("No stuffy exists for id: "+id);
		}
		return s;
	}

}
