package com.head.first.chap12.lambdas;

import java.util.List;

public class P372Loop {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		String output = "";
		for (int i = 1; i < nums.size(); i++)
			output += nums.get(i) + "";
		System.out.println(output);
		for (Integer num : nums)
			output += nums + " ";
		System.out.println(output);

	}

}
