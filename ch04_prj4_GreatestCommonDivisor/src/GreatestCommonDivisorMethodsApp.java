import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivisorMethodsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Greatest Common Divisor App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			int y = getInt("Enter number (y - greater): ", sc);
			int x = getInt("Enter number (x - lesser): ", sc);
			// Repeat until x = 0.
			while (x != 0) {
				// Subtract x from y repeatedly until y < x
				while (y >= x) {
					y -= x;
				}
				// Swap the values of x and y
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.println("Greatest common divisor is " + y);
			System.out.println("Continue?  ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("Bye");
	}

	private static int getInt(String prompt, Scanner scan) {
		boolean isValid = false;
		int i = 0;
		while (!isValid) {
			try {
				System.out.println(prompt);
				i = scan.nextInt();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid entry.  Try again.");
				scan.nextLine();  // discard input
				continue;
			}
		}
		return i;
	}

}
