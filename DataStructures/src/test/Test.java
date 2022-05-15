package test;
import linearray.QueueArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray<Integer> tst = new QueueArray<Integer>(10);
		System.out.println(11%10);
		for(int i = 0; i<=10;i++) {
			System.out.println(i+"++");
			tst.enqueue(i);
		}
		for(int i = 0;i<=10;i++) {
			tst.dequeue();
		}
		for(int i = 0; i<=10;i++) {
			tst.enqueue(i);
		}
		tst.printQueue();
		tst.dequeue();
		tst.dequeue();
		tst.printQueue();
	}

}
