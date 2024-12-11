package com.ksg.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {
	
	public static void main(String[] args) {
	List<Integer> listOfIntegers = Arrays.asList(20,30,40,55,66,20,20,78,34,98,30,40);
	Map<Boolean, List<Integer>> evenOddNumber = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
	System.out.println(evenOddNumber);
	
	List<String> listOfString = Arrays.asList("akash","vinay","jay","ajay","akash");
	listOfString.stream().distinct().forEach(System.out::println);
	
	String inputString = "komal singh gurjar";
	Map<Character, Long> characterCount = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(characterCount);
	
	listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	listOfIntegers.stream().sorted().forEach(System.out::println);
	listOfIntegers.stream().max(Comparator.naturalOrder()).get();
	
	}
	
}
