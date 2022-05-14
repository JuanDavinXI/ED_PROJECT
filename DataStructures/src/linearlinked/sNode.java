package linearlinked;

public class sNode<T> {
	public T data;
	public sNode<T> next;
	public sNode(T data) {
		this.data = data;
		this.next = null;
	}
}
