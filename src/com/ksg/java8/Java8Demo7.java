package com.ksg.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Java8Demo7 {
	
	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1995, 01, 12);
		
		LocalDate today = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, today));
	}

}
