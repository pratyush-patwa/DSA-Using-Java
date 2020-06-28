package StackWithArray;

public class TestStackArray {

	public static void main(String[] args) {
		StackWithArray stack = new StackWithArray(7);
		stack.push(12);
		stack.push(5);
		stack.push(7);
		System.out.println(stack.peek());
		stack.push(78);
		stack.push(98);
		stack.push(105);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
