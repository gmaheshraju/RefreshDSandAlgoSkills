package com.BigO;

public class ConstantTime {
	
	public static void main(String[] args) {
		
		int [] intArray = {1,2,3,4,5};
		
		log(intArray);
		
		int[] intArray2 = {1,2,3,5,6,7,7,3,4,6,6,6,7,7};
		
		log(intArray2);
		
	}
	
	public static void log(int[] numbers){
		// 0(1)
		//if input grows also there is no performance degrade for this algorithm.It will give the result in constant time.
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
	}

}
