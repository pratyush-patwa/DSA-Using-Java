package QueueWithArray;

public class TestQueueWithArray {

	public static void main(String[] args) {
		QueueWithArray queue = new QueueWithArray(5);
		queue.add(5);
		System.out.println(queue.peek() +" size : "+queue.size);
		queue.add(20);
		System.out.println(queue.peek() +" size : "+queue.size);
		queue.add(10);
		System.out.println(queue.peek() +" size : "+queue.size);
		queue.add(25);
		System.out.println(queue.peek() +" size : "+queue.size);
		queue.add(30);
		System.out.println(queue.peek() +" size : "+queue.size);
		queue.add(35);
		System.out.println(queue.peek() +" size : "+queue.size);
		int n =queue.size;
		for(int i=0; i<n; i++) {
			System.out.println("i :  "+i +" "+queue.remove());
		}
	}
}
