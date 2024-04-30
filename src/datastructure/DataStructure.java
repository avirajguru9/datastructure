package datastructure;

public class DataStructure {

	public static void main(String[] args) {
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
//		System.out.println(myLinkedList.get(0).value);;
	}

}
