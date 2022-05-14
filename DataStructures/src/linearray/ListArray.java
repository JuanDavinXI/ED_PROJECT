package linearray;

public class ListArray<T> {
	private int count;
	T[] array;
	private static final int N = 5;
	public int getCount() {
		return this.count;
	}
	protected ListArray(int n) {
		this.array = (T[]) new Object[n];
		this.count = 0;
	}
	protected ListArray() {
		this(N);
	}
	public boolean empty() {
		return this.count == 0;
	}
	public boolean full() {
		return this.count == this.array.length;
	}
	public void clearArray() {
		this.count = 0;
		System.out.println("Array is now empty!");
	}
	protected boolean pushBack(T item) {
		if(full()) {
			System.out.println("Array is full!");
			return false;
		}
		this.array[this.count] = item;
		this.count++;
		return true;
	}
	protected T popBack() {
		if(empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		this.count--;
		return this.array[this.count];
	}
	protected T peekBack() {
		if(empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		return this.array[this.count-1];
	}
	protected boolean pushFront(T item) {
		if(full()) {
			System.out.println("Array is full!");
			return false;
		}
		for (int i = this.count-1;i>=0;i--) {
			this.array[i+1] = this.array[i];
		}
		this.array[0] = item;
		this.count++;
		return true;
	}
	protected T popFront() {
		if(empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		T pop = this.array[0];
		for(int i = 0; i<this.count;i++) {
			this.array[i] = this.array[i+1];
		}
		this.count--;
		return pop;
	}
	protected T peekFront() {
		if (empty()) {
			System.out.println("Array is empty!");
			return null;
		}
		return this.array[0];
	}
	protected void printList() {
		if (empty()) {
			System.out.println("Array is empty!");
			return;
		}
		System.out.println("----------\nFirst In");
		System.out.print("[ ");
		for(int i = 0; i<this.count;i++) {
			System.out.print(this.array[i]+" ");
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("Last In\n----------");
	}
}

