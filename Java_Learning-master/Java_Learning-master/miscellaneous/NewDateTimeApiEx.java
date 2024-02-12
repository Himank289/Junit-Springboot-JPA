package miscellaneous;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class NewDateTimeApiEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter fmt=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(fmt.format(dt));
		
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getYear());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfYear());
		System.out.println(dt.getMonth());
		System.out.println(dt.getHour());
		
		
		//printing some specific dates
		//getting instance of date,datetime,based on diff date and time
		
		LocalDate date2=LocalDate.of(1947, 8, 15);
		System.out.println("independence day"+date2);
		
		//changing current time month to 2 
		//withXXX to change certain parts of existing date,time,datetime instance
		System.out.println(LocalDateTime.now().withMonth(2));
		
		//period bewtween two date instances
		
		LocalDate date=LocalDate.now();
		LocalDate bd=LocalDate.of(2000, 8, 27);
		Period p=Period.between(bd, date);
		System.out.println(p.getDays());
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		
		//duration
		LocalTime t1=LocalTime.now();
		LocalTime t2=LocalTime.MIDNIGHT;
		//duration will give difference between two time instances
		Duration d=Duration.between(t2,t1);
		System.out.println(d.toHours());
		
		
		System.out.println(date.plusMonths(9));
		
		
	}

}
