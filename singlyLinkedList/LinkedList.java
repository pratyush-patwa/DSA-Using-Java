package singlyLinkedList;

public class LinkedList {
	Node head;
	
	/*
	 * Insertion in linked list at the beginning/start
	 * */
	public void insertAtStart(int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}
	
	
	/*
	 * Insertion in linked list at last node/ tail.
	 * */
	public void insertAtEnd(int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public  void insertAtIndex(int index, int data) {
		//Position 0 is 1
		Node newNode = new Node(data);
		int i=0;
		Node temp = head;
		while(i!=index-1) {
			temp= temp.next;
			i++;
		}
		Node t = temp.next;
		temp.next =newNode;
		newNode.next = t;
	}
//	public static LinkedList()
	
	
	public void remove(int key) throws Exception {
	
		Node temp = head, prev = null; 
        
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
        }
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) 
        	throw new Exception("No Key Value found"); 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    } 
	
	public void print()
	{
		Node node = head;
		while(node != null){
		
		System.out.print(node.data + " -> ");

		node = node.next;
		}
	}
	
	/*
	 * Driver Method
	 */
}

