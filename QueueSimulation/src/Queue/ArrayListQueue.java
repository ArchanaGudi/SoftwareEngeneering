package Queue;

import java.util.ArrayList;

public class ArrayListQueue extends Queue {
	public ArrayListQueue(int size) {
		super();
		// TODO Auto-generated constructor stub
	}

	ArrayList<Integer> queue = new ArrayList<Integer>();

	@Override
	public void Enqueue(int val) {
		// TODO Auto-generated method stub
		queue.add(val);

	}

	@Override
	public void Dequeue() {
		// TODO Auto-generated method stub
		if (queue.isEmpty()) {
			System.out.println("Array List Queue Is Empty");
		} else
			System.out.println("Deleted element from the Array List " + queue.remove(0));
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("The Array List elements are ");
		for (Integer i : queue) {
			System.out.println(i);
		}
	}

}