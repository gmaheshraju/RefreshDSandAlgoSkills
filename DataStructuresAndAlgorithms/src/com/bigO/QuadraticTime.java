package com.BigO;

public class QuadraticTime {

	public static void main(String[] args) {

	}

	public static void log(int[] numbers) {
		// 0(n)
		// iterating and then iterating again with each input

		// 0(n*n) => O(n^2)

		// algorithm degrades
		for (int num : numbers) {
			for (int second : numbers) {
				System.out.println(second);
			}
			System.out.println(num);
		}
	}
	
	public static void logNSquarePlusN(int[] numbers) {
		
		//overall 
		
		// O(n^2 + n)  => O(n^2)
		
		
		//we always drop constants
		
		//for example n^2 will be always grows quick when input size grows.0(n^2) > 0(n) => drop constants 
		
		
		// 0(n)
		
		for (int test : numbers) {
			System.out.println(test);
		}
		// iterating and then iterating again with each input

		// 0(n*n) => O(n^2)

		// algorithm degrades
		for (int num : numbers) {
			for (int second : numbers) {
				System.out.println(second);
			}
			System.out.println(num);
		}
	}

}
