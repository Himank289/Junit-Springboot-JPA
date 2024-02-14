package miscellaneous;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CurrencyNumberDateTimeFormatterBasedOnLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount=1234.5678;
		
//		1 UK Locale Currency Formatter
		System.out.println("NumberFormatter for currency for diff locale and default locale");
		NumberFormat localizedCurrencyFormat= NumberFormat.getCurrencyInstance(Locale.UK);
		String formattedcurrency=localizedCurrencyFormat.format(amount);
		System.out.println(formattedcurrency);
		
	// currency format for default / current locale
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		
		NumberFormat localizedCurrencyFormat1= NumberFormat.getCurrencyInstance(Locale.getDefault());
		String formattedcurrency1=localizedCurrencyFormat1.format(amount);
		System.out.println(formattedcurrency1);
		
		
//		3. Number format for current/default locale
		System.out.println("NumberForamtter for number for current locale and diff locale:");
		NumberFormat nf=NumberFormat.getNumberInstance(Locale.GERMAN);
		String numbstring=nf.format(12345656);
		System.out.println(numbstring);
		
		//4 number format for diff locale
		nf=NumberFormat.getNumberInstance(Locale.GERMAN);
		String numbstring1=nf.format(12345656);
		System.out.println(numbstring1);
		
		//5 date time formatting for diff standard iso formats
		String dt=DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now());
			System.out.println(dt);
		String d=DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2000, 3,16));
		System.out.println(d);
		
		
		//6 date formatter for different date format styles
		
		LocalDate an=LocalDate.of(2000, 3,16);
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(an));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(an));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(an));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(an));	
		
		LocalDate date=LocalDate.of(2016,9,23);
		LocalTime t=LocalTime.of(13,12,45);
		
		ZonedDateTime  zdtm=ZonedDateTime.of(date, t,ZoneId.of("Europe/Helsinki"));
		String dtfmt=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zdtm);
		System.out.println(dtfmt);
		
		ZonedDateTime  zdtm1=ZonedDateTime.of(date, t,ZoneId.of("Asia/Calcutta"));
		String dtfmt1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zdtm1);
		System.out.println(dtfmt1);
		
		ZonedDateTime  zdtm11=ZonedDateTime.of(date, t,ZoneId.of("Asia/Tokyo"));
		String dtfmt11=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(zdtm11);
		System.out.println(dtfmt11);
		
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		
		System.out.println(ZonedDateTime.now((ZoneId.of("America/Los_Angeles"))));
		System.out.println(ZonedDateTime.now((ZoneId.of("Asia/Tokyo"))));
		System.out.println(ZonedDateTime.now((ZoneId.of("Asia/Calcutta"))));
		
		
		
	
		Set<String>s=	ZoneId.getAvailableZoneIds();
		s.forEach((x)->System.out.println(x));
		s.forEach(System.out::println);// with instance method reference
		
		Map<String,String>mp =ZoneId.SHORT_IDS;
		mp.forEach((x,y)->System.out.println(x+"...."+y));
		

		//how to convert one time zone to another time zone 
		ZonedDateTime n=ZonedDateTime.now();
		System.out.println(n);
		ZonedDateTime n1=n.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println(n1);
		
		//conversion form ist to est zone
		ZonedDateTime n11=ZonedDateTime.now();
		System.out.println(n11);
		ZonedDateTime n111=n.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(n111);
	}
	

}
