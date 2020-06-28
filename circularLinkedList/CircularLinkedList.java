package circularLinkedList;

public class CircularLinkedList {
	Node last;
	
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		if(last == null) {
			last = newNode;
			last.next = last;
		}else {
			newNode.next = last.next; 
			last.next = newNode;
		}	
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(last == null) {
			last = newNode;
			last.next = last;
		}else {
			newNode.next = last.next; 
			last.next = newNode;
			last = newNode;
		}	
	}
	
	
	public void insertAtIndex(int data, int index) {
		Node newNode = new Node(data);
		if(last == null && index == 0) {
			last = newNode;
			last.next = last;
		}else if(last == null & index>0){
			System.out.print("List Is empty");
			return;
		}else {
			 Node temp = last.next; 
			  int count =0;
			 // Traversing the list. 
			  while(index-1 !=count && temp != last){  
			        temp = temp.next;
			        count++;
			 }  
			 if(temp == last) {
				 System.out.println("The index is more than the node in the list");
				 return;
			 }
			 newNode.next = temp.next;
			 temp.next = newNode;	 
		}	
	}
	
	public void remove(int key) {
		if(last == null) {
			System.out.println("List Is empty");
			return;
		}else{
			Node temp = last.next;
			Node prev = last;
			while(temp.data != key && temp != last){
				prev = temp;
				temp= temp.next;
			}
			if(temp == last && temp.data != key) {
				System.out.println("List does not contain "+ key);
				return;
			}
			prev.next = temp.next ; 
		}
	}
	
	
	public void print() {
		// If list is empty, return.
		if(last == null) {
			System.out.println("List Is empty");
			return;
		}
		
		   Node temp = last.next; 
		  
		    // Traversing the list. 
		    do
		    { 
		        System.out.print(temp.data + " "); 
		        temp = temp.next; 
		    } 
		    while(temp != last.next); 
	}


}
