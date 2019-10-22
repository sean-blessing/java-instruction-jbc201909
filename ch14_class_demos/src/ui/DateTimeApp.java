package ui;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		// current dates/times
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate halloween2019 = LocalDate.of(2019, 10, 31);
		System.out.println(halloween2019);
		LocalDate christmas2019 = LocalDate.of(2019, 12, 25);
		System.out.println(christmas2019);
		LocalDateTime thanksgiving2019 = LocalDateTime.of(2019,11,28,0,0,0);
		System.out.println(thanksgiving2019);
		
		LocalDateTime demoDay2019 = LocalDateTime.parse("2019-12-17T14:00:00");
		System.out.println(demoDay2019);
		
		System.out.println("Day of Christmas:  "+christmas2019.getDayOfMonth());
		
		System.out.println("Compare dates/times");
		System.out.println(halloween2019.isBefore(christmas2019));
		System.out.println(christmas2019.isBefore(halloween2019));
		System.out.println(halloween2019.compareTo(christmas2019));
		System.out.println(demoDay2019.compareTo(thanksgiving2019));
		System.out.println(demoDay2019.compareTo(demoDay2019));
		
		//adjusters
		LocalDate newDate = halloween2019.withMonth(11);
		System.out.println(newDate);
		
		LocalDate date1 = LocalDate.of(2017, 2, 28);
		//LocalDate newDate1 = date1.withDayOfMonth(29);  // throws Exception
		
		
		// adding/subtracting
		// date1 and adjust it to current date??
		//LocalDate newDate2 = date1.plusMonths(32).minusDays(6);
		LocalDate newDate2 = date1.plus(32, ChronoUnit.MONTHS);
		System.out.println(newDate2);
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(df.format(newDate2));

	}

}
