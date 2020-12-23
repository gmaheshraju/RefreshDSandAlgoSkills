package com.LinkedList;

import java.util.Arrays;

public class TestLinkedListMethods {
	
	public static void main(String[] args) {
		
		ImplementLinkedList list = new ImplementLinkedList();
		list.addLast(10);
		System.out.println(list.indexOf(10));
		list.addLast(20);
		list.addLast(30);
		
		System.out.println(list.indexOf(30));
		System.out.println(list.indexOf(40));
		
		System.out.println(list.contains(50));
		System.out.println(list.contains(10));
		
		//remove first
		System.out.println(list.size());
		list.removeFirst();
		System.out.println(list.size());
		
		//remove Last
		list.addLast(80);
		list.addLast(90);
		list.addLast(50);
		list.addLast(60);
		System.out.println(list.size());
		list.removeLast();
		System.out.println(list.size());
		
		
		//to array
		
		System.out.println(Arrays.toString(list.toArray()));
		list.reverse();
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
