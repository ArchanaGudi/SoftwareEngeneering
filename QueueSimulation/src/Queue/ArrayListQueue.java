package Queue;

import java.util.ArrayList;

public class ArrayListQueue {
	ArrayList<Integer> queue = new ArrayList<Integer>();

	void Enqueue(int value) {
		queue.add(value);
	}

	void Dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Array List Queue Is Empty");
		} else
			System.out.println("Deleted element from the Array List " + queue.remove(0));
	}

	void display() {
		System.out.println("The Array List elements are ");
		for (Integer i : queue) {
			System.out.println(i);
		}
	}

}