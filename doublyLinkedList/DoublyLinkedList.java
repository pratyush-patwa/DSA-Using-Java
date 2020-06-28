package doublyLinkedList;

public class DoublyLinkedList {
	int size =0;
	DoublyNode head;
	DoublyNode tail;
	
	public void addAtStart(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if(head == null)
			head = tail = newNode;
		else {
			DoublyNode temp = head; 
			newNode.next = temp;
			temp.prev = newNode;
			head =  newNode;
		}
		size++;
		
	}
	
	public void addAtEnd(int data) {
		DoublyNode newNode = new DoublyNode(data);
		if(head == null)
			head = newNode;
		else {
			DoublyNode temp = tail;
			newNode.prev = temp;
			tail.next =  newNode;
			tail = tail.next;
		}
		size++;
	}
		
	public void addAtIndex(int data , int index) {
		DoublyNode newNode = new DoublyNode(data);
		if(index == 0)
			addAtStart(data);
		else if (index == size)
			addAtEnd(data);
		else if(index >0 && index <size) {
		int counter =0;
		DoublyNode temp = head;
			while(counter != index-1) {
				counter++;
				temp = temp.next ;
			}
			newNode.next = temp.next;
			temp.next.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
			size ++;
			
		}
		else {
			System.out.print("Index Out Of Bound");
		}
	}
	
	public void removeByElement(int key) {
		if(key == head.data) {
			head = head.next;
			head.prev = null;
		}else if(key == tail.data) {
			tail = tail.prev;
			tail.next = null;
		}
		else{
			DoublyNode temp = head;
			while(key != temp.data){
				temp = temp.next;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
		size--;
	}
	
	public int indexOf(int key) {
		int index =0;
		DoublyNode temp = head;
		while(key != temp.data){
			temp = temp.next;
			index++;
		}
		return index;
	}
	
	
	public void print() {

		if(head == null)
			System.out.print("Null");
		
		DoublyNode temp = head;
		while(temp != null) {

			System.out.print(temp.data +  "   ");
			temp = temp.next;
		}
		System.out.println();
	}
	

}
