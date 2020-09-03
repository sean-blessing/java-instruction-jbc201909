package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.Console;

public class StudentVolunteerApp {

	public static void main(String[] args) {
		System.out.println("White Elephant Name Draw!");
		List<String> students = new ArrayList<>();
		
		String str = "";
		
		while (!str.equalsIgnoreCase("exit")) {
			str = Console.getString("Name?:  ");
			if (!str.equalsIgnoreCase("exit"))
				students.add(str);
		}
		
		System.out.println("List of participants: "+students);
		Collections.sort(students);
		System.out.println("Sorted list of participants: "+students);
		int i = 1;
		while (!students.isEmpty()) {
			int rndm = (int)(Math.random()*(students.size()));
			System.out.println("#"+i+": "+students.remove(rndm));
			i++;
		}
//		int rand = (int)(Math.random()* (students.size()-1));
//		System.out.println("rand# = "+rand);
//		String rnd1 = students.get(rand);
//		System.out.println("Lucky student #1: "+rnd1);
//		students.remove(rnd1);
//		rand = (int)(Math.random()* (students.size()-1));
//		System.out.println("rand# = "+rand);
//		String rnd2 = students.get(rand);
//		System.out.println("Lucky student #2: "+rnd2);
//		
		System.out.println("Bye");

	}

}
