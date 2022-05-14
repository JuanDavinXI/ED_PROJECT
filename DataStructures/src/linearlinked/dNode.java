package linearlinked;

public class dNode<T> {
	T data;
	dNode<T> prev;
	dNode<T> next;
	public dNode(T data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
