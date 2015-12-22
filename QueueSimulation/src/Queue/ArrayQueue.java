package Queue;

public class ArrayQueue {

	int rear;
	int front;
	int queue[];
	int flag;
	int qsize;

	public ArrayQueue(int size) {
		// TODO Auto-generated constructor stub
		rear = -1;
		front = -1;
		qsize = size;
		queue = new int[qsize];
	}

	int Enqueue(int value) {
		if (rear == qsize)
			flag = 0;
		else {
			rear++;
			queue[rear] = value;
			if (front == -1)
				front = 0;
			flag = 1;
		}
		return flag;
	}
	
	int Dequeue(){
		int value;
		value=queue[front];
		front++;
		return value;
		
	}
}
