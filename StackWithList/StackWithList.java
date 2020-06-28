package StackWithList;

public class StackWithList {
Node head;
int size;
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	public int pop() {
		if(head == null) {
			System.out.print("The Stack is Empty");
			return -1;
		}
		int data = head.data;
		head = head.next;
		size--;
		return data;
	}
	
	public int peek() {
		if(head == null) {
			System.out.print("The Stack is Empty");
			return -1;
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		
		return false;	
	}
}
