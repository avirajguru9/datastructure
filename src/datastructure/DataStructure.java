package datastructure;

public class DataStructure {

	public static void main(String[] args) {
		DoublyLinkedList myDoLinkedList = new DoublyLinkedList(5);
		myDoLinkedList.append(6);
		myDoLinkedList.append(7);
		myDoLinkedList.set(0,1);
		myDoLinkedList.append(10);
//		System.out.println(myDoLinkedList.get(3).value);
		
//		myDoLinkedList.removLast();
//		myDoLinkedList.removeFirst();
		myDoLinkedList.printList();
	}
	
	public void getLinkedList() {
		LinkedList myLinkedList = new LinkedList(5);
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
		myLinkedList.append(9);
		myLinkedList.append(6);
		myLinkedList.append(4);
		myLinkedList.reverse();
		
//		myLinkedList.removeFirst();
		myLinkedList.printList();
//		System.out.println(myLinkedList.get(0).value);
	}

}
