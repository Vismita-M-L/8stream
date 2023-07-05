package com.techlabs.stream;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40);
		numbers.stream().forEach((number)->System.out.println(number*2));
		numbers.stream().filter((number)->number%2==0).forEach((number)->System.out.println(numbers));

	}

}
