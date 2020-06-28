package doublyLinkedList;

public class DoublyList {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addAtStart(5);
		list.addAtStart(10);
		list.addAtStart(15);
		list.print();
		list.addAtEnd(50);
		list.addAtEnd(105);
		list.addAtEnd(150);
		list.print();
		System.out.println(list.size);
		list.addAtIndex(99, 6);
		list.print();
		list.addAtIndex(88,0);
		list.print();
		System.out.println(list.size);
		list.addAtIndex(74, 3);
		list.print();
		System.out.println(list.size);
		list.removeByElement(88);
		list.print();
		System.out.println(list.size);
		list.removeByElement(15);
		list.print();
		System.out.println(list.size);
		list.removeByElement(99);
		list.print();
		System.out.println(list.size);
		list.removeByElement(50);
		list.print();
		System.out.println(list.size);
		System.out.println(list.indexOf(105));
		list.removeByElement(105);
		list.print();
		
		

	}

}
