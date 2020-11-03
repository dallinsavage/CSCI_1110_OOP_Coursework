/* Dallin Savae
 * 11/2/20
 */

import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList {

private java.util.LinkedList<E> list = new java.util.LinkedList<>();
	GenericQueue() {
		super();
	}

	public void enqueue(E e) {
		list.addLast(e);
	}
	public E dequeue() {
		return list.removeFirst();
	}
	
	public String toString() {
		return list.toString();
	}
}

class Exercise_24_5 {
	public static void main(String[] args) {
		GenericQueue queue = new GenericQueue();
		queue.enqueue(1);
		System.out.println(queue);
		queue.enqueue("2");
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
	}
}