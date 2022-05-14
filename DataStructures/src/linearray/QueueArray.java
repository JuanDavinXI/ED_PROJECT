package linearray;

public class QueueArray<T> extends ListArray<T> {
	private int read;
	private int write;
	public QueueArray(int n) {
		super(n);
		this.read = 0;
		this.write = 0;
	}
	public QueueArray() {
		super();
		this.read = 0;
		this.write = 0;
	}
	public boolean enqueue(T item) {
		if(full()) {
			System.out.println("Array is full!");
			return false;
		}
		super.array[this.write] = item;
		this.write = (this.write+1)%super.array.length;
		return true;
	}
	public T peek() {
		if(empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		return super.array[this.read];
	}
	public T dequeue() {
		if(empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		this.read = (this.read+1)%super.array.length;
		return super.array[(this.read-1)%super.array.length];
	}
}
