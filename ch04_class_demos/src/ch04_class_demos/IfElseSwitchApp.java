package ch04_class_demos;

public class IfElseSwitchApp {

	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		
		if (a < 3) {
			System.out.println("a less than 3");
		}
		else if (a < 10) {
			String str = "abc";
			System.out.println("a less than 10");
		}
		else {
			String str = "456";
			System.out.println("a is 10 or greater");
			System.out.println(str);
		}
		
		if ((a<10) && (b==10)) {
			System.out.println("hello");
			System.out.println("u rock");
		}
		
		if ((a>10) || (b<20)) {
			System.out.println("woohoo");
		}
		
		// nested if statements
		if (a<10) {
			if (b<10) {
				System.out.println("b less than 10");
			}
			else {
				System.out.println("b greater than or equal to 10");
			}
		}
		
		// switch statement demo
		switch (a) {
			case 1:
				System.out.println("a is 1");
				break;
			case 2:
				System.out.println("a is 2");
				break;
			case 3:
				System.out.println("a is 3");
				break;
			case 4:
				System.out.println("a is 4");
				break;
			case 5:
				System.out.println("a is 5");
				break;
			default:
				System.out.println("a is greater than 5");
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
