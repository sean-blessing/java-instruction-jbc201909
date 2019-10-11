import java.util.Scanner;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("====================================");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number from 1 to 100.\n" + 
					"Try to guess it.\n");
			int randNum = generateRandomNumber();
			int guessCount = 0;
			System.out.println("nbr = "+randNum);
			// prompt for a guess, compare to randNum, display output
			// continue until guess == randNum
			int guess = 0;
			while (guess!=randNum) {
				guess = getIntWithinRange(sc,"Enter number: ", 0, 101);
				guessCount++;
				int diff = guess - randNum;
				String msg = "";
				if (diff<=-10) {
					msg = "Way too low!";
				}
				else if (diff<0) {
					msg = "Too low!";
				}
				else if (diff>=10) {
					msg = "Way too high!";
				}
				else if (diff > 0) {
					msg = "Too high";
				}
				else {
					// correct guess
					msg = "You got it in "+guessCount+" tries.";
					if (guessCount <= 3) {
						msg += "Great work! You are a mathematical wizard.";
					}
					else if (guessCount <= 7) {
						msg += "Not too bad! You've got some potential.";
					}
					else {
						msg += "What took you so long? Maybe you should take some lessons.";
					}
				}
				System.out.println(msg);
			}
			
			
		
			choice = getString(sc,"Try again? (y/n):  ");
			
		}
		
		sc.close();
		System.out.println("Bye");

	}
	
	private static String getString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		// keep prompting until user enters y or n
		while (!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			// check for empty string
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error... entry is required");
				continue;
			}
			else if (s.equalsIgnoreCase("y")||s.equalsIgnoreCase("n")) {
				isValid = true;
			}
			else {
				System.out.println("Error... only 'y' or 'n' is accepted.");
				continue;				
			}
		}
		
		return s;
	}
	
	private static int generateRandomNumber() {
		int r = (int)(Math.random()*100)+1;
		return r;
	}
	
    public static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }


}
