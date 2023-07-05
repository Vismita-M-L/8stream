package com.techlabs.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Jay","Nimesh","Mark","Mahesh","Ramesh");
		Stream<String> nameStream =names.stream();
		
		//names.stream().sorted().limit(3).forEach((name)->System.out.println(name));
		
          System.out.println(names.stream().sorted().limit(3).anyMatch((name)->name.contains("a")));

          names.stream().sorted(Comparator.reverseOrder()).forEach((name)->System.out.println(name));
          
          names.stream().
		

	}

}
