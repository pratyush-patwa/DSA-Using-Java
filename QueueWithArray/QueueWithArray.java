package QueueWithArray;

public class QueueWithArray {
	int maxSize;
	int [] queue;
	int topOfQueue,start;
	int size=0;
	QueueWithArray(int maxSize) {
		this.maxSize = maxSize;
		queue  = new int[maxSize];
		topOfQueue = -1;
		start =0;
	}
	void add(int data) {
		if(topOfQueue== maxSize-1)
			System.out.println("Queue is Full Can not add  " +data);

		else {
			queue[++topOfQueue] = data;		
			size++;
		}
	}
	
	
	int remove() {
		if(start > topOfQueue) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int pop = queue[start];
			int i = 0;
			while(i<topOfQueue) {
				queue[i] = queue[i+1];
				i++;
			}
			topOfQueue--;
			size--;
			return pop;
		}	
	}
	
	
	int peek() {
		if(topOfQueue<0){
			return -1;
		}
		return queue[topOfQueue];
	}
	
	
}
