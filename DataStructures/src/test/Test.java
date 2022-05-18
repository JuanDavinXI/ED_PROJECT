package test;

import java.util.*;

import test.clothes.Clothes;

public class Test {
	static Armario armario= new Armario();	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			if(Armario.camisas.peek()==null) {
				System.out.println("Camisa: "+"No hay prendas de este tipo en tu armario");
			}else {
				System.out.println("Camisa: "+Armario.camisas.peek().name);
			}
			if(Armario.pantalones.peek()==null) {
				System.out.println("Pantalon: "+"No hay prendas de este tipo en tu armario");
			}else {
				System.out.println("Pantalon: "+Armario.pantalones.peek().name);
			}
			if(Armario.Zapatos.peek()==null) {
				System.out.println("Zapatos: "+"No hay prendas de este tipo en tu armario");
			}else {
				System.out.println("Zapatos: "+Armario.Zapatos.peek().name);
			}			
			System.out.println("Si quieres modificar alguno ingresa el numero correspondiente de arriba hacia abajo (1-3)\n"
					+ "Si quieres ver tu armario ingresa 'Armario'o si quieres salir ingresa 'Exit'y si quieres agregar 'ADD'");
			
			changes();
		}
	}
	
	public static void changes() {
		Scanner in=new Scanner(System.in);
		if(in.hasNextInt()==true) {
			int temp_in= in.nextInt();
			if(temp_in>0 && temp_in<armario.cajones.length){
				Cajon<Clothes> temp;
				Clothes temp_clothe;
				temp = armario.cajones[temp_in-1];
				if(temp.peek()==null) {
					System.out.println("No tienes prendas, ingresa a tu armario para añadir");						
				}else if (temp.count==1) {
					System.out.println("No tienes mas prendas, ingresa a tu armario para añadir");	
					System.out.println(temp.peek().name);
				}else {
					System.out.println("Ingresa 1 si quieres rotar la prenda a la izq, 2 para la derecha y 3 para aceptar");
					String choice= in.nextLine();
					choice= in.nextLine();
					switch(choice) {
						case "1":
							temp_clothe=temp.dequeue();
							temp.enqueue(temp_clothe);
							System.out.println(temp.peek().name);
							break;
						case "2":
							temp_clothe=temp.popFront();
							temp.pushBack(temp_clothe);
							System.out.println(temp.peek().name);
							break;
						case "3":
							break;
						default:
							System.out.println("Intentalo de nuevo");
							changes();
							break;
					}
			   }
			} else {
				System.out.println("Intentalo de nuevo");
				
			}
		}else {
			String temp_str=in.nextLine();
			if(temp_str.compareTo("Exit")==0){
				System.exit(-1);
			}else if(temp_str.compareTo("Armario")==0){
				armario.main(null);
			}else if(temp_str.compareTo("ADD")==0){
				add_prenda();
			}else{
				System.out.println("Intentalo de nuevo");
				changes();
			}
		}
	}
	public static void add_prenda(){
		Scanner in=new Scanner(System.in);
		System.out.println("Para agregar camisas ingresa 1\n"
				+ "Para agregar Pantalones ingresa 2\n"
				+ "Para agregar Zapatos ingresa 3\n"
				+ "Para Cancelar ingresa'Cancel'");
		if(in.hasNextInt()==true) {
			int temp_in= in.nextInt();		
			if(temp_in>0 && temp_in<armario.cajones.length){
				Cajon<Clothes> temp;
				Clothes temp_clothe;
				temp = armario.cajones[temp_in-1];
				String name= in.nextLine();
				name= in.nextLine();
				System.out.println("Ingresa el nombre de tu prenda");
				temp.add(name);
			}else {
				System.out.println("Intentalo de nuevo");
				add_prenda();
				}
			}else {
				String temp_str=in.nextLine();
				if(temp_str.compareTo("CANCEL")!=0){
					System.out.println("Intentalo de nuevo");
					changes();				
				}
			}
		}
}	
			
			
