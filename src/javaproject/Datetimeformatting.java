package javaproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime time= LocalDateTime.now();
		
		
		DateTimeFormatter format1= DateTimeFormatter.ofPattern("H:mm");
		
		DateTimeFormatter format2= DateTimeFormatter.ofPattern("HH:mm");
		
		String afterformatted1=time.format(format1);
		String afterformatted2=time.format(format2);
				
		LocalDateTime date=LocalDateTime.now();
		
		DateTimeFormatter format3= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DateTimeFormatter format4= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		String afterformatted3=date.format(format3);
		
		String afterformatted4=date.format(format4);
		
		System.out.println(afterformatted1);
		System.out.println(afterformatted2);
		System.out.println(afterformatted3);
		System.out.println(afterformatted4);
		
		
		
		
		
		
		
		
		

	}

}
