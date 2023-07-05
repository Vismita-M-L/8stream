package com.techlabs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40);
		numbers.stream().forEach((number)->System.out.println(number*2));
		numbers.stream().filter((number)->number%2==0).forEach((number)->System.out.println(numbers));

	ListTest<Integer> evens=numbers.parallelStream().filter((number)->number%2==0).collect(Collectors.toList());
	evens.parallelStream().forEach((number)->System.out.println(number));
		
	System.out.println(numbers.parallelStream().reduce(0,number1,number2)->number1+number2);
	}

}
