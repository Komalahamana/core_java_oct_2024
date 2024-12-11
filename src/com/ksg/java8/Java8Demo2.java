package com.ksg.java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Demo2 {
	
	public static void main(String[] args) {
		
		int [] a = new int [] {4, 2, 7, 1};
		
		int [] b = new int [] {8, 3, 9, 5};
		
		int [] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
		
		System.out.println(Arrays.toString(c));
		
		int i = 168749;
		
		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
		
	}

}
