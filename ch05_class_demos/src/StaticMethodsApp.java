
public class StaticMethodsApp {

	public static void main(String[] args) {
		printWelcomeMessage();
		int a = sum(4,5);
		System.out.println("sum is "+a);

	}
	
	private static void printWelcomeMessage() {
		System.out.println("Welcome to my method.");
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

}
