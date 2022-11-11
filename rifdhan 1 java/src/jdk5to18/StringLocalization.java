package jdk5to18;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class StringLocalization {

	public static void main(String[] args) {
		Locale l=Locale.ENGLISH;
		
		NumberFormat formatter=NumberFormat.getCurrencyInstance(new Locale("en","us"));
		
		NumberFormat simpleFormatter=NumberFormat.getNumberInstance(l);
		
		int ii=1_0_20_30_4;
		
		System.out.println(simpleFormatter.format(ii));
		System.out.println(formatter.format(ii));
		
		System.out.println(String.format("Locale:%s,int:%s",1,formatter.format(ii)));
		
		// DateFormat
		
		DateFormat dateformatter=DateFormat.getDateInstance(DateFormat.DEFAULT,Locale.US);
		Date d=new Date(ii);
		System.out.println(String.format("Locale:%s,Date:%s",1,dateformatter.format(d)));
		
		String pattern="EEE, MMMM d,YYYY";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern,l);
		System.out.println(String.format("Locale:%s, DAte:%s",l,d));
	}
}
