package circularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtStart(13);
		list.print();
		System.out.println();
		list.insertAtStart(81);
		list.print();
		System.out.println();
		list.insertAtStart(98);
		list.print();
		System.out.println();
		list.insertAtStart(27);
		list.print();
		System.out.println();
		list.insertAtEnd(8);
		list.print();
		System.out.println();
		list.insertAtEnd(31);
		list.print();
		System.out.println();
		list.insertAtEnd(67);
		list.print();
		System.out.println();
		list.insertAtStart(43);
		list.print();
		System.out.println();
		list.insertAtIndex(54, 3);
		list.print();
		System.out.println();
		list.insertAtIndex(77, 5);
		list.print();
		System.out.println();
		list.insertAtIndex(1, 4);
		list.print();
		System.out.println();
		list.remove(81);
		list.print();
		System.out.println();
		list.remove(67);
		list.print();
		System.out.println();
		//list.remove(100);
		//list.print();
		System.out.println();
		list.remove(1);
		list.print();
		System.out.println();
		list.remove(43);
		list.print();
		System.out.println();
	}

}
