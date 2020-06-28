package QueueWithList;

public class TestQueueuWithList {

		public static void main(String[] args) {
			QueueWIthList q = new QueueWIthList();
			q.add(10);
			System.out.println(q.peek());
			q.add(20);
			System.out.println(q.peek());
			q.add(30);
			System.out.println(q.peek());
			q.add(40);
			System.out.println(q.peek());
			
			System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());
			System.out.println(q.remove());

		}
}
