package com.arrays;

import java.util.Arrays;

public class TestMyOwnArrayMethods {
	
	public static void main(String[] args) {
		
		
		Array arr= new Array(5);
		
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(50);
		
		System.out.println(arr.length());
		arr.print();
		
		int index = arr.indexOf(4);
		System.out.println();
		System.out.println(index);
		
		int largest = arr.max();
		System.out.println(largest);
		
		int[] rev = arr.reverseArray();
		
		System.out.println(Arrays.toString(rev));
		System.out.println("before remove");
		arr.removeAt(3);
		
		
	}

}
