import java.util.Arrays;

public class ArraysDemoApp {

	public static void main(String[] args) {
		double[] grades = {88.6, 88.0, 93.2, 94.5};
		
		double[] percentages = Arrays.copyOf(grades, grades.length);
		
		percentages[1] = 70.2;
		
		for (double d: grades) {
			System.out.println(d);
		}
		
		for (double d: percentages) {
			System.out.println(d);
		}

	}

}
