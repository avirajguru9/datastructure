package datastructure;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	int length;
	
	class Node{
		int value;
		Node next;
		Node prev;
		Node(int value){
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head=newNode;
		tail=newNode;
		length++;
	}

	public void printList() {
		Node temp = head;
		while(temp !=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: "+tail.value);
	}
	
	public void getLenth() {
		System.out.println("Length: "+length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
	public Node removLast() {
		if(length == 0) {
			return null;
		}
		Node temp=tail;
		if(length == 1) {
			tail = null;
			head = null;
		}else {
			tail = tail.prev;
			tail.next = null;
			tail.prev = null;
		}
		length--;
		return temp;
	}
	
	public Node removeFirst() {
		if(length == 0) {
			return null;
		}
		Node temp = head;
		if(length == 1) {
			tail = null;
			head = null;
		}else {
			head = head.next;
			head.prev = null;
			temp.next=null;
		}
		length--;
		return temp;
	}
	
	public Node get(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		Node temp = head;
		if(index<length/2) {
			for(int i=0;i<index;i++) {
				temp=temp.next;				
			}
		}else {
			temp=tail;
			for(int i=length-1;i>index;i--) {
				temp=temp.prev;				
			}
		}
		return temp;
	}
	
	public boolean set(int index, int value) {
		Node temp = get(index);
		if(temp !=null) {
			temp.value =value;
			return true;
		}
		return false;
	}
	
	public boolean insert(int index, int value) {
		if(index <0 || index>length) {
			return false;
		}
		if(index == 0) {
			append(value);
		}
		return true;
	}
}
