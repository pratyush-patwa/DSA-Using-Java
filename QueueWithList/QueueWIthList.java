package QueueWithList;

public class QueueWIthList {
	Node last;
	Node first;

	public void add(int data) {
		Node newNode = new Node(data);
		if(first == null) {
			last = first = newNode;
			last.next = first;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	public int remove() {
		if(first == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int data =  first.data;
			if(last.next != first.next) {
				last.next = first.next;
				first = first.next;
			}else 
				last.next = first = null;
			return data;
		}
	}
	public int peek() {
		if(last == null)
			return -1;
		
		return last.data;
	}
	
}
