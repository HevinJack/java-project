package javaproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println(datetime);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String afterformatted= datetime.format(format);
		System.out.println(afterformatted);
		
		

	}

}
