package com.ksg.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<String> stationaryList = Arrays.asList("pen","paper","copy","pen","erasar","pencil","paper");
	Map<String, Long> collect = stationaryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(collect);
	List decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
	decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
	}

}
