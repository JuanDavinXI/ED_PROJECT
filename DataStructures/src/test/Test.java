package test;
import linearray.DinamicArray;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DinamicArray<Integer> tst = new DinamicArray<Integer>();
		tst.addFront(0);
		tst.addBack(1);
		tst.addFront(5);
		System.out.println(tst.peekFront());
		System.out.println(tst.peekBack());
		tst.popFront();
		System.out.println(tst.peekFront());
		tst.popBack();
		tst.popBack();
		tst.popFront();
		tst.popBack();
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		tst.addFront(5);
		System.out.println(tst.count);
	}

}
