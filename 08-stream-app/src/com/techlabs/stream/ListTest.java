package com.techlabs.stream;

import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<List<Integer>> lists=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(11,22,33),Arrays.asList(111,222,333));
        System.out.println(lists.stream().flatMap(list->list.stream().reduce(0,(x,y)->x+y));
	}

}
