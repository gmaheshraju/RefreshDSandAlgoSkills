package com.LinkedList;

import java.util.NoSuchElementException;

public class ImplementLinkedList {

	/*
	 * think edge cases write modular code and reuse as much as possible 
	 * think about runtime complexity while implementing methods
	 * single, doubly, circular
	 * 
	 */

	private Node first;
	private Node last;

	private int size;

	public void addFirst(int elem) {
		Node node = new Node(elem);

		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}

		size++;

	}
	
	public void reverse(){
		
		//0,1,2,3
		//3,2,1,0
		//0,1,2,3,4,5
		//5,4,3,2,1,0
		//[10 -> 20 -> 30]
		// step 1[10 <- 20 <- 30 ] 
		//Step 2 reset the things
		
		// o/p [30 -> 20 -> 10]
		
		if(isEmpty()){
			return;
		}
		
		Node previous = first;
		Node current= first.next;
		
		while(current != null) {
			Node next = current.next;
			current.next =previous;
			previous =current;
			current =next;
		}
		
	
		last = first;
		last.next = null;
		first = previous;
		
		
	}

	public void addLast(int elem) {

		Node node = new Node(elem);

		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}

		size++;
	}

	public int indexOf(int val) {

		int index = 0;
		Node current = first;

		while (current != null) {

			if (val == current.value) {
				return index;
			}
			current = current.next;
			index++;
		}

		return -1;
	}

	public boolean contains(int val) {
		return indexOf(val) != -1;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	public void removeFirst() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		if (first == last) {
			first = last = null;
			return;
		}

		Node second = first.next;
		first.next = null;
		first = second;

		size--;

	}

	public void removeLast() {

		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		if (first == last) {

			first = last = null;
			return;
		}

		Node previous = getPrevious(last);
		last = previous;
		last.next = null;
		size--;

	}

	public Node getPrevious(Node node) {

		Node current = first;
		while (current != null) {
			if (current.next == node) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	
	public int[] toArray(){
		
		int [] array =  new int[size];
		Node current =first;
		int index=0 ;
		while(current != null){
			array[index++] = current.value;
			current =current.next;
		}
		
		return array;
	}

	private class Node {

		private int value;
		private Node next;

		public Node(int item) {
			this.value = item;
		}

	}

}
