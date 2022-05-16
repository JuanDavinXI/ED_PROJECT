package test;
import test.clothes.Clothes;
import java.util.Random;
public class Test {
	public static Clothes[] testSubjects(int size) {
		Clothes[] array = new Clothes[size];
		String[] types = {"Camisa","Pantalon","Zapatos"};
		Random rndm = new Random();
		for(int i = 0; i<size; i++) {
			int random = rndm.nextInt(3);
			array[i] = new Clothes(Integer.toString(i),types[random]);
		}
		return array;
	}	
	public static void main(String[] args) {
		Clothes[] subjects = testSubjects(10000);
		long start = System.currentTimeMillis();
		
		//CODIGO A MEDIR EL TIEMPO
		
		long finish = System.currentTimeMillis();
		finish = finish-start;
		System.out.println("Tiempo de operación: "+finish);
	}
}