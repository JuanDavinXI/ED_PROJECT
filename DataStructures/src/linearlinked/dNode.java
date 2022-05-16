package linearlinked;

public class dNode<T> {
	protected T data;
	dNode<T> prev;
	dNode<T> next;
	public dNode(T data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public dNode<T> getNext() {
		return next;
	}
}
