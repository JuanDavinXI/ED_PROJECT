package linearlinked;

public class LinkedListD<T> {
	protected dNode<T> head;
	dNode<T> tail;
	public int count;
	public LinkedListD() {
		this.head = null;
		this.tail = null;
	}
	public boolean empty() {
		return this.head == null;
	}
	public boolean pushFront(T item){
		if(empty()) {
			this.head = this.tail = new dNode<T>(item);
			this.count++;
			return true;
		}
		this.head.prev = new dNode<T>(item);
		this.head.prev.next = this.head;
		this.head = this.head.prev;
		this.count++;
		return true;
	}
	public boolean pushBack(T item) {
		if(empty()) {
			this.head = this.tail = new dNode<T>(item);
			this.count++;
			return true;
		}
		this.tail.next = new dNode<T>(item);
		this.tail.getNext().prev = this.tail;
		this.tail = this.tail.getNext();
		this.count++;
		return true;
	}
	public T popFront() {
		if(empty()) {
			//System.out.println("List is empty!");
			return null;
		}
		dNode<T> ref = this.head;
		if(this.head==this.tail) {
			this.head = this.tail = null;
			this.count--;
			return ref.data;
		}
		this.head = this.head.next;
		this.head.prev = null;
		this.count--;
		return ref.getData();
	}
	public T popBack() {
		if(empty()) {
			//System.out.println("List is empty!");
			return null;
		}
		dNode<T> ref = this.tail;
		if(this.tail==this.head) {
			this.head = this.tail = null;
			this.count--;
			return ref.data;
		}
		this.tail = this.tail.prev;
		this.tail.next = null;
		this.count--;
		return ref.getData();
	}
	public T peekFront() {
		if(empty()) {
			//System.out.println("List is empty!");
			return null;
		}
		return this.head.getData();
	}
	public T peekBack() {
		if(empty()) {
			//System.out.println("List is empty!");
			return null;
		}
		return this.tail.getData();
	}
	public void printList() {
		if(empty()) {
			System.out.println("List is empty!");
			return;
		}
		System.out.println("----------\nFirst In");
		System.out.print("[ ");
		dNode<T> ref = this.head;
		while(ref != null) {
			System.out.print(ref.getData()+" ");
			ref = ref.getNext();
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("Last In\n----------");
	}
	public void clearList() {
		this.head = this.tail = null;
	}
	
	
}
