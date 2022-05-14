package linearlinked;

public class QueueLinked<T> extends LinkedListD<T> {
	public QueueLinked() {
		super();
	}
	public boolean enqueue(T item) {
		return super.pushFront(item);
	}
	public T dequeue() {
		return super.popBack();
	}
	public T peek() {
		return super.peekBack();
	}
	public void printQueue() {
		super.printList();
	}
	public void clearQueue() {
		super.clearList();
	}
}
