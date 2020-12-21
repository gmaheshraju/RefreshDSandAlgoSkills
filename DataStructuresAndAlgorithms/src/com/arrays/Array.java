package com.arrays;

import java.util.Arrays;

public class Array {

	// create an Array class

	// implement print method to display the array

	// implement insert

	// implement removeAt

	// Implement IndexOf => it should return

	/*
	 * 1- Extend the Array class and add a new method to return the largest
	 * number. What is the runtime complexity of this method? Solution:
	 * Array.max() 2- Extend the Array class and add a method to return the
	 * common items in this array and another array. Solution: Array.intersect()
	 * 3- Extend the Array class and add a method to reverse the array. For
	 * example, if the array includes [1, 2, 3, 4], after reversing and printing
	 * it, we should see [4, 3, 2, 1]. Solution: Array.reverse() 4- Extend the
	 * Array class and add a new method to insert an item at a given index:
	 * public void insertAt(int item, int index) Solution: Array.insertAt()
	 */
	private int count;
	private int[] intArray;

	public Array(int length) {
		this.intArray = new int[length];
	}

	public int length() {
		return count;
	}

	public void insert(int elem) {
		// check if it is full, resize the array to double

		// if full copy the array elements into new array
		// set new array to existing array
		// insert the given elem
		if (intArray.length == count) {
			int[] copyArray = new int[intArray.length * 2];

			for (int i = 0; i < count; i++) {

				copyArray[i] = this.intArray[i];
			}

			intArray = copyArray;
		}

		intArray[count++] = elem;

		// keep track of size

	}

	public void removeAt(int index) {

		int removeIndex = index;

		System.out.println(Arrays.toString(intArray));

		for (int i = removeIndex; i < intArray.length - 1; i++) {
			intArray[i] = intArray[i + 1];

		}

		count--;

		System.out.println(Arrays.toString(intArray));
		// if user pass wrong input throw illegalArgumentException

		// shift the elements to left
		// reduce the size
	}

	public void print() {

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i] + " ");
		}

	}

	public int indexOf(int elem) {
		int index = -1;
		for (int i = 0; i < intArray.length - 1; i++) {

			if (elem == intArray[i]) {

				index = i;
			}
		}
		return index;
	}

	public int max() {
		int largest = intArray[0];
		if (intArray.length == 1) {
			return intArray[0];
		}

		for (int i = 0; i < intArray.length; i++) {

			if (largest < intArray[i])
				largest = intArray[i];
		}
		return largest;
	}

	public int[] reverseArray() {

		if (intArray.length == 1) {
			return intArray;
		}

		int[] copyArray = new int[intArray.length];

		int j = 0;
		for (int i = intArray.length - 1; i >= 0; i--) {

			copyArray[j] = intArray[i];
			j++;
		}

		intArray = copyArray;
		return intArray;
	}

	public void insertAt(int[] intArray, int index) {

	}

	public int[] intersect(int[] array1, int[] array2) {

		return new int[0];
	}

}
