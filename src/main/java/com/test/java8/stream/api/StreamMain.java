package com.test.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author egarsgh
 *
 */
public class StreamMain {
	public static void main(String [] arg) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(17);
		System.out.println(sumStream(numbers));
		
	}
	private static Optional<Integer> sumStream(List<Integer> list) {
		System.out.println(list);
		Optional<Integer> sum = list.stream().findAny().filter(i -> i > 10)/*.mapToInt(i -> i).sum()*/;
		return sum;
	}

}
