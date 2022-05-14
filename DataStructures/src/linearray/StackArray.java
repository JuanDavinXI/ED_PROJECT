package linearray;

public class StackArray<T> extends ListArray<T>{
	public StackArray(int n) {
		super(n);
	}
	public StackArray() {
		super();
	}
	public T peek() {
		return super.peekBack();
	}
	public boolean push(T item) {
		return super.pushBack(item);
	}
	public T pop() {
		return super.popBack();
	}
	public void clearStack() {
		super.clearArray();
	}
	public void printStack() {
		super.printList();
	}
}
