package com.bigO;

public class LinearTime {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5 };

		log(intArray);

		int[] intArray2 = { 1, 2, 3, 5, 6, 7, 7, 3, 4, 6, 6, 6, 7, 7 };

		log(intArray2);

	}

	public static void log(int[] numbers) {
		// 0(n)
		// iterating over all numbers ,when input rows performance of this
		// algorithm degrades
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	public static void log2(int[] numbers, String[] str) {

		// iterating over all numbers and strings

		// 0(n + m) ==> 0(n)
		for (int num : numbers) {
			System.out.println(num);
		}

		for (String s : str) {

			System.out.println(s);
		}
	}

	public static void log3(int[] numbers) {

		// iterating over all numbers and strings

		// 0(n + n) ==> 0(2n) => 0(n)
		for (int num : numbers) {
			System.out.println(num);
		}

		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
