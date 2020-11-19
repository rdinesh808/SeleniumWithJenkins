package com.selenium.practice;

import java.io.*;
import java.util.*;

public class Practice {
	public String largestNumber(int[] nums) {
		List<String> parts = new ArrayList<String>();
		for (int num : nums) {
			parts.add(String.valueOf(num));
		}
		Collections.sort(parts, new Comparator<String>() {
			public int compare(String s1, String s2) {
				int l1 = s1.length();
				int l2 = s2.length();
				if (l1 == l2) {
					return Integer.valueOf(s1) - Integer.valueOf(s2);
				}
				String c1 = s1+s2;
				String c2 = s2+s1;
				System.out.println("C1 : " + c1);
				System.out.println("C2 : " + c2);
				return c1.compareTo(c2);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = parts.size() - 1 ; i >= 0; i--) {
			sb.append(parts.get(i));
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Practice practice = new Practice();
		int[] n1 = {3,30,34,5,9};
		int[] n2 = {10,2};
		System.out.println(practice.largestNumber(n1));
		System.out.println(practice.largestNumber(n2));
	}
}