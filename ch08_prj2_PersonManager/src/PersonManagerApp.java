
public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the person manager app!");

		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String type = Console.getString("Create customer or"
					+ " employee? (c/e) ");
			String firstName = Console.getString("First Name:  ");
			String lastName = Console.getString("Last Name:   ");
			
			Person p = null;
			if (type.equalsIgnoreCase("c")) {
				String customerNumber = Console.getString(
						"Customer Number:  ");
				Customer c = new Customer(firstName, lastName,
						customerNumber);
				p = c;
			}
			else if (type.equalsIgnoreCase("e")) {
				String ssn = Console.getString(
						"SSN:  ");
				Employee e = new Employee(firstName, lastName,
						ssn);
				p = e;
			}
			else {
				System.out.println("Invalid type.");
			}
			
			// display results
			System.out.println("You entered a new "+
							p.getClass().getName());
			System.out.println(p);
			
			choice = Console.getString("Continue? ");
		}
		
		System.out.println("Bye!");
	}

}
