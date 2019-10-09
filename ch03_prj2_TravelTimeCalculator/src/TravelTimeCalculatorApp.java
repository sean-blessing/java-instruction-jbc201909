import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator!");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter miles:  ");
			double miles = sc.nextDouble();
			System.out.println("Enter mph:  ");
			double mph = sc.nextDouble();
			
			// biz logic - compute hours and minutes
			double hours = miles / mph;
			int min = (int)(hours * 60);
			int hoursInt = min / 60;
			min %= 60;
			
			// display results
			System.out.println("Estimated Travel Time:");
			System.out.println("======================");
			System.out.println("Hours:   "+hoursInt);
			System.out.println("Minutes: "+min);
			
			System.out.println("Continue? ");
			choice = sc.next();
		}
		
		
		sc.close();
		System.out.println("Bye!");
	}

}
