package ch04_class_demos;

public class ForLoopApp {

	public static void main(String[] args) {
		
		// print yahoo 10 times
		for (int i = 0; i < 10; i++) {
			System.out.println("yahoo!  i is "+i);
		}
		
		// countdown from 100 by 10s
		for (int i=100; i>= 0; i-=10) {
			System.out.println(i);
		}

	}

}
