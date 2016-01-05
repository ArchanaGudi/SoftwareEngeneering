package Queue;

public class MainQueue {
	int qsize;
	
	
	public MainQueue(int size){
		this.qsize=size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		
		Queue que = new ArrayQueue(size);
		que.Enqueue(5);
		que.Enqueue(6);
		que.Enqueue(2);
		que.Enqueue(4);
		que.Enqueue(9);
		que.Enqueue(10);
		que.Display();
		que.Dequeue();
		que.Dequeue();

		Queue listQue = new ArrayListQueue(size);
		listQue.Enqueue(4);
		listQue.Enqueue(1);
		listQue.Enqueue(7);
		listQue.Enqueue(6);
		listQue.Enqueue(8);
		listQue.Enqueue(10);
		listQue.Display();
		listQue.Dequeue();
		listQue.Dequeue();
	}
}
