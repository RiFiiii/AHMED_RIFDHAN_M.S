package utilpackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		
		System.out.println("Today date: "+date);
		System.out.println("Yesterday date: "+yesterday);
		System.out.println("Tomorrow date: "+tomorrow);
		
		LocalDate date1=LocalDate.of(2016, 1, 13);
		System.out.println(date1.isLeapYear());
		
		LocalDate date2=LocalDate.of(2017, 1, 13);
		System.out.println(date2.isLeapYear());
		
		System.out.println(date2);
		
		String d2str=date2.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date2 in string : "+d2str);
		LocalDate d2=LocalDate.parse(d2str);
		System.out.println("String to LocalDate : "+ d2);
		System.out.println(date2.isLeapYear());
		
		LocalTime time1=LocalTime.now();
		System.out.println(time1);
		
		LocalTime time2=LocalTime.of(10, 40, 30);
		System.out.println(time2);
		
		LocalTime time3=time1.minusHours(2);
		LocalTime time4=time2.minusMinutes(34);
		System.out.println(time4);
		
		LocalTime time5=time1.plusHours(4);
		LocalTime time6=time2.plusMinutes(19);
		
		System.out.println(time5);
		System.out.println(time6);
		
		LocalDateTime datetime=date.atTime(1, 50, 20);
		System.out.println(datetime);
		
		//Time Zones...
		
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime t1=LocalTime.now(zone1);
		System.out.println("India Time Zone: "+t1);
		LocalTime t2=LocalTime.now(zone2);
		System.out.println("Japan Time Zone: "+t2);
		
		long hours=ChronoUnit.HOURS.between(t1, t2);
		System.out.println("Hours between two time zone: "+hours);
		
		long minutes=ChronoUnit.MINUTES.between(t1, t2);
		System.out.println("Minutes between two time zone: "+minutes);
		
	}
}
