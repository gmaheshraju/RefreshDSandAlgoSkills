package com.bigO;

public class SpaceComplexity {
	
	public static void main(String[] args) {
		
		int[] intArray ={1,10,13,15,17};
		//space complexity
		spaceComplexity(intArray);
		
	}
	
	
	public static void spaceComplexity(int[] arr){
		
		
		//if you are allocating any extra space think about it, it will take more space
		//If you can do it in-place and effectively you will save memory
		//for example for mobile applications always memory efficient works well
		
		
		//if you are doing in-place then mostly space complexity will be constant time O(1)
		
		//O(n) space
		int[] newArr =  new int [arr.length] ;
		
		System.out.println(newArr.length);
		for(int num :arr){
			System.out.println(num);
		}
		
	}

}
