package com.cnu.ds.hash.test;

public class Num {
	public static String LowestNumber(String number, int n) {
		if (number == null || number.length() < n) {
			return null;
		} else if (number.length() > n) {
			int removed = 0;
			for (int i = 0, j = 1; removed != n && j != number.length();) {
				if (number.charAt(i) > number.charAt(j)) {
					number = number.substring(0, i)
							+ number.substring(j, number.length());
					System.out.println(number);
					i = 0;
					j = 1;
					removed++;
				} else {
					i++;
					j++;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		LowestNumber("2200010300", 4);
	}
}
