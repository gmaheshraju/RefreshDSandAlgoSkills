package com.bigO;

import java.util.Arrays;

public class LogNtime {
	
	public static void main(String[] args) {
		
		//ex binary serach
		
		int[] intArray  = {10,20,30,2,15};
		
		
		// 0(log n)
		//binary search reduces input size by half and itis very quick
		//algirithm with logarthimic time is more scalable than linear time
		int result = Arrays.binarySearch(intArray, 2);
		
		System.out.println(result);
		
	}

}
