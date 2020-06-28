package StackWithArray;

public class StackWithArray {
	int maxSize;
	int [] stack;
	int topOfStack;
	
	StackWithArray(int maxSize) {
		this.maxSize = maxSize;
		stack  = new int[maxSize];
		topOfStack =-1;
	}
	
	void push(int data) {
		if(topOfStack == maxSize-1) {
			System.out.println("Stack Is Full : Overflow Condition");
		}else {
			stack[++topOfStack] = data;
		}
	}
	int pop() {
		if(topOfStack<0) {
			System.out.println("Stack Is Empty : Underflow Condition");
			return -1;
		}else {
			return stack[topOfStack--];
		}
	}
	int peek() {
		if(topOfStack <0) {
			System.out.print("Stack is Empty");
			return -1;
		}
		else {
			return stack[topOfStack];
		}
	}
	
	boolean isEmpty() {
		if(topOfStack <0)
			return true;
		return false;
	}

}
