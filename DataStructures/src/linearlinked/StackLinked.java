package linearlinked;

public class StackLinked<T> extends LinkedListS<T> {
	public StackLinked() {
		super();
	}
	public boolean push(T item) {
		return super.pushFront(item);
	}
	public T pop() {
		return super.popFront();
	}
	public T peek() {
		return super.peekFront();
	}
	public void printStack() {
		super.printList();
	}
	public void clearStack() {
		super.clearList();
	}
}
