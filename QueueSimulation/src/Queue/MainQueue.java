package Queue;

public class MainQueue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		int data;
		ArrayQueue que=new ArrayQueue(size);
		que.Enqueue(5);
		data=que.Dequeue();
        System.out.println(data);
		
	}

}
