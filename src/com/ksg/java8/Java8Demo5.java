package com.ksg.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Java8Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("one","2two","3three","four","five");
		listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0
				))).forEach(System.out::println);
		
		LocalDate birthday = LocalDate.of(1999,01,12);
		 LocalDate today = LocalDate.now();
		 System.out.println(ChronoUnit.YEARS.between(birthday, today));

	}

}
