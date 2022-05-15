package test;
import linearlinked.QueueLinked;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinked<Integer> tst = new QueueLinked<Integer>();
		System.out.println(11%10);
		for(int i = 0; i<10;i++) {
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
		tst.enqueue(5);
		tst.printQueue();
	}

}
