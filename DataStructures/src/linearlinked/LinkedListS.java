package linearlinked;

public class LinkedListS<T> {
	sNode<T> head;
	sNode<T> tail;
	int count;
	public LinkedListS() {
		this.head = null;
		this.tail = null;
	}
	public boolean empty() {
		return this.head == null;
	}
	public boolean pushFront(T item){
		if(empty()) {
			this.head = this.tail = new sNode<T>(item);
			this.count++;
			return true;
		}
		sNode<T> p = new sNode<T>(item);
		p.next = this.head;
		this.head = p;
		this.count++;
		return true;
	}
	public boolean pushBack(T item) {
		if(empty()) {
			this.head = this.tail = new sNode<T>(item);
			this.count++;
			return true;
		}
		this.tail.next = new sNode<T>(item);
		this.tail = this.tail.next;
		this.count++;
		return true;
	}
	public T popFront() {
		if(empty()) {
			System.out.println("List is empty!");
			return null;
		}
		sNode<T> ref = this.head;
		this.head = this.head.next;
		this.count--;
		return ref.data;
	}
	public T popBack() {
		if(empty()) {
			System.out.println("List is empty!");
			return null;
		}
		sNode<T> ref = this.head;
		while(ref.next.next!=null) {
			ref = ref.next;
		}
		sNode<T> poped = ref.next;
		ref.next = null;
		this.tail = ref;
		this.count--;
		return poped.data;
	}
	public T peekFront() {
		if(empty()) {
			System.out.println("List is empty!");
			return null;
		}
		return this.head.data;
	}
	public T peekBack() {
		if(empty()) {
			System.out.println("List is empty!");
			return null;
		}
		return this.tail.data;
	}
	public void printList() {
		if(empty()) {
			System.out.println("List is empty!");
			return;
		}
		System.out.println("----------\nFirst In");
		System.out.print("[ ");
		sNode<T> ref = this.head;
		while(ref != null) {
			System.out.print(ref.data+" ");
			ref = ref.next;
		}
		System.out.print("]");
		System.out.println("");
		System.out.println("Last In\n----------");
	}
	public void clearList() {
		this.head = this.tail = null;
	}
}
