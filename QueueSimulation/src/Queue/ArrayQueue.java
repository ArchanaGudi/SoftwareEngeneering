package Queue;

public class ArrayQueue {

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

	public boolean Enqueue(int value) {
		if (rear <= qsize - 1) {
			queue[rear] = value;
			rear++;
			return true;
		} else
			return false;
	}

	public void Dequeue() {
		if(front==rear)
		{
			System.out.println("Element Removed: "+queue[front]);
			front=rear=-1;
		}
		else
		{
			System.out.println("Element Removed: "+queue[front]);
			front++;
		}

	}

	void display() {
		System.out.println("The elements in the Array Queue");
		for (Integer i : queue) {
			System.out.println(i);
		}
	}

}
