package jdk5to18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DayDemo {

	public static void main(String[] args) {
		LocalDateTime currentDateTime=LocalDateTime.now();
		
		LocalDate todaysDate=currentDateTime.toLocalDate();
		
		LocalTime todaysTime=currentDateTime.toLocalTime();
		
		System.out.println(todaysDate+":"+todaysTime);
		
		
		System.out.println(todaysDate.getDayOfYear()+":"+todaysDate.getMonthValue()+":"+todaysDate.getYear());
		
		System.out.println(todaysTime.getHour()+" : "+ todaysTime.getMinute()+" : "+todaysTime.getSecond());
		
		LocalDate date=LocalDate.of(2020,Month.DECEMBER, 26);
		System.out.println(date.getDayOfMonth());
		
		LocalTime time=LocalTime.of(19, 40);
		System.out.println(time.getHour());
		
	}
}
