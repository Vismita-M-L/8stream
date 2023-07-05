package com.techlabs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Vismita","varun","Jyothi");
			Stream<String> nameStream=names.parallelStream();
			nameStream.forEach((name)->System.out.println(name));
			
			List<String> helloNames=names.parallelStream().map((name)->"hello "+name).collect(Collectors.toList());
            helloNames.stream().forEach((name)->System.out.println(name));
            names.stream().sorted().forEach((name)->System.out.println(name));
            names.stream().sorted().limit(3).forEach((name)->System.out.println(name));
            
            System.out.println(names.stream().anyMatch((name)->name.contains("Vismita")));
            Optional<String>belongs=names.parallelStream().findAny();
            if(belongs.isPresent())
            	System.out.println(belongs.get());
            
            
}
}
