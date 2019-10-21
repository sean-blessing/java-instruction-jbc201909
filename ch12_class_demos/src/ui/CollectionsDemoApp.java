package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoApp {

	public static void main(String[] args) {
		String[] codes1 = new String[3];
		codes1[0] = "java";
		codes1[1] = "jsp";
		codes1[2] = "mysql";
		
		for (String s: codes1) {
			System.out.println(s);
		}
		
		List<String> codes2 = new ArrayList<>();
		codes2.add("java");
		codes2.add("jsp");
		codes2.add(0,"mysql");
		
		for (String s: codes2) {
			System.out.println(s);
		}
		
		System.out.println(codes2);
		
		System.out.println("\ntrying some methods on p. 391");
		System.out.println(codes2.contains("jsp"));
		System.out.println(codes2.contains("Java"));
		System.out.println(codes2.indexOf("jsp"));
		Collections.sort(codes2);
		System.out.println(codes2);
		System.out.println(codes2.isEmpty());
		String str1 = codes2.remove(1);
		System.out.println(str1);
		System.out.println(codes2);
		System.out.println(codes2.remove("java"));
		System.out.println(codes2);
		codes2.clear();
		System.out.println(codes2);
		
		

	}

}
