package test;
import java.util.*;
import test.clothes.Clothes;

public class Armario {
	static Cajon<Clothes> camisas= new Cajon<Clothes>("Camisa");
	static Cajon<Clothes> pantalones= new Cajon<Clothes>("Pantalon");
	static Cajon<Clothes> Zapatos= new Cajon<Clothes>("Zapatos");
	static Cajon<Clothes>[] cajones= new Cajon[] {camisas,pantalones,Zapatos};
	public static void main(String[] args) {
		String window="actual";
		System.out.println("Para tu cajon de de camisas ingresa 1\n"
				+ "Para tu cajon de de Pantalones ingresa 2\n"
				+ "Para tu cajon de de Zapatos ingresa 3\n"
				  +"Para devolverte ingresa 'Back'");
		while(window.compareTo("actual")==0) {
			step();
		}
	}
	static void step(){
		try (Scanner in = new Scanner(System.in)) {
			String select=in.nextLine();
			switch(select) {
				case "1":
					camisas.main(null);
					break;
				case "2":
					pantalones.main(null);
					break;
				case "3":
					Zapatos.main(null);
					break;
				case "EXIT":
					System.exit(-1);
				case "Back":
					Test.main(null);
					break;
				default:
					System.out.println("Intentalo de nuevo");
					step();
					break;
			}
		}
	
	}
}
