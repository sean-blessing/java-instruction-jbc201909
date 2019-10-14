
public class ContactApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact App!!!");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String fName = Console.getString("Enter first name:  ");
			String lName = Console.getString("Enter last name:   ");
			String email = Console.getString("Enter email:       ");
			String phone = Console.getString("Enter phone:       ");
			
			Contact c = new Contact(fName, lName, email, phone);
			// display the contact
			System.out.println(c);
			System.out.println(c.displayContact());
			
			choice = Console.getString("Continue? ");	
		}
		
		System.out.println("Bye");
	}

}
