package linearlinked;

public class QueueLinked<T> extends LinkedListD<T> {
	public QueueLinked() {
		super();
	}
	public boolean enqueue(T item) {
		return super.pushBack(item);
	}
	public T dequeue() {
		return super.popFront();
	}
	public T peek() {
		return super.peekFront();
	}
	public void printQueue() {
		super.printList();
	}
	public void clearQueue() {
		super.clearList();
	}
}
