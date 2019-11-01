package ui;

public class JUnitTesting {

	public static void main(String[] args) {
		
		String str = "Abracadabra";
		
		System.out.println(countA(str));

	}
	
	private static int countA(String s) {
		int count = 0;
		// Christian
//		String s2 = s.toLowerCase()+".";
//		String[] strings = s2.split("a");
//		count = strings.length - 1;
		
		// Sean
//		for (int i=0; i< s.length(); i++) {
//			if (s.charAt(i)=='a' || s.charAt(i) == 'A') {
//				count++;
//			}
//		}
		
		// Matt
//		for (int i = 0; i< s.length(); i++) {
//			String str = s.substring(i);
//			if (str.startsWith("a")|| str.startsWith("A")) {
//				count++;
//			}
//		}

		// Kait
		s.toLowerCase();
		count = s.length() - s.replace("a", "").length();
		return count;
	}

}
