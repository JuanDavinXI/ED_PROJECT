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
		super.count++;
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
		super.count--;
		if((this.read-1)%super.array.length<0) {
			return super.array[(this.read-1)%super.array.length+super.array.length];
		}
		return super.array[((this.read-1)%super.array.length)];
	}
	public void printQueue() {
		int pointer = this.read;
		System.out.println("\n-------------\nFirst In");
		System.out.print("[");
		if(pointer==this.write) {
			System.out.print(super.array[pointer]+" ");
			pointer = (pointer+1)%super.array.length;
		}
		while(pointer!=this.write) {
			System.out.print(super.array[pointer]+" ");
			pointer = (pointer+1)%super.array.length;
		}
		System.out.println("]");
		System.out.println("Last In\n-------------");
	}
}
