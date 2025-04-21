package j16_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {

	public static void main(String[] args) {
		LocalDate le = LocalDate.now();
		System.out.println(le);
		System.out.println(le.getMonth());
		System.out.println(le.getYear());
		System.out.println(le.getDayOfMonth());
		System.out.println(le.getDayOfYear());
		System.out.println(le.plusDays(2));
		System.out.println(le.minusDays(2));
		LocalDate le1 = LocalDate.of(2003,10, 28);
		System.out.println(le1);
		System.out.println(le.isBefore(le1));
		
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(11,12);
		System.out.println(lt);
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.plusHours(3));
		System.out.println(lt.minusHours(3));
		System.out.println(lt.isBefore(lt1));
		LocalDateTime t1 = LocalDateTime.now();
		System.out.println(t1);
		LocalDateTime td1 = LocalDateTime.of(le,lt1);
		System.out.println(td1.plusHours(2));
		System.out.println(td1.getHour());
		System.out.println(td1.getMinute());
		System.out.println(td1.minusHours(3));
		System.out.println(td1.plusHours(2));
		
		
		
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("DD-MM-YYYY hh:mm");
		System.out.println(dt.format(td1));

	}
	

}
