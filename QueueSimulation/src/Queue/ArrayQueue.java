package Queue;

public class ArrayQueue extends Queue {

	int rear;
	int front;
	int queue[];
	int flag;
	int qsize;

	public int getQsize() {
		return qsize;
	}

	public void setQsize(int qsize) {
		this.qsize = qsize;
	}

	int value;

	public ArrayQueue(int size) {
		super();
		this.front = 0;
		this.rear = 0;
		this.qsize = size;
		this.queue = new int[qsize];
	}

	@Override
	public void Enqueue(int val) {
		// TODO Auto-generated method stub
		if (rear <= qsize - 1) {
			queue[rear] = val;
			rear++;
		}
	}

	@Override
	public void Dequeue() {
		// TODO Auto-generated method stub
		if (front == rear) {
			System.out.println("Element Removed: " + queue[front]);
			front = rear = -1;
		} else {
			System.out.println("Element Removed: " + queue[front]);
			front++;
		}
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("The elements in the Array Queue");
		for (Integer i : queue) {
			System.out.println(i);
		}

	}

}
