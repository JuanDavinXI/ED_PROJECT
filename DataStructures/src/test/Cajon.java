package test;

import java.util.*;
import linearlinked.LinkedListD;
import linearlinked.QueueLinked;
import linearlinked.dNode;
import test.clothes.*;

public class Cajon<T> extends QueueLinked<T> {
	public String type;
	public Cajon(String Clothe){
		type=Clothe;
	}
	public void main(String[] args) {
		while(true) {
			my_cajon();
		}
		
	}
	
	public void my_cajon() {
		Scanner in= new Scanner(System.in);
		print();
		System.out.println("Ingrese 'ADD' si desea agregar una prenda de este tipo");
		System.out.println("Ingrese el nombre de la prenda si quiere ver sus caracteristicas");
		System.out.println("Ingrese 'BACK' para volver al armario");
		String text= in.nextLine();
		if(text.compareTo("ADD")==0) {
			System.out.println("Ingrese el nombre de su prenda");
			String name= in.nextLine();
			add(name);
		}else if(text.compareTo("BACK")==0) {
			Armario.main(null);
		}else {
			show(text);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void add(String name) {
		Scanner in= new Scanner(System.in);
		if(find(name)!=null) {
			System.out.println("El nombre ya esta en uso, ingrese uno nuevo o ingrese 'CANCEL' para cancerlar");
			String text= in.nextLine();
			if(text.compareTo("CANCEL")==0) {
				System.out.println("Operacion cancelada");
			}else {
				add(text);
			}
		}else {
			Clothes temp=new Clothes(name,type);
			pushFront((T) temp);
		}
	}
	
	public Clothes find(String id) {
		dNode<Clothes> Actual=(dNode<Clothes>) head;
		while(Actual!=null) {
			if (Actual.getData().name.compareTo(id)==0) return Actual.getData();
			Actual=Actual.getNext();
		}
		return null;
	}
	
	
	public void print() {
		if(head==null) {
			System.out.println("Cajon Vacio");
		}else {
			dNode<Clothes> Actual=(dNode<Clothes>) head;
			System.out.print(Actual.getData().name);
			Actual=Actual.getNext();
			while(Actual!=null) {
				System.out.print(",");
				System.out.print(Actual.getData().name);
				Actual=Actual.getNext();
			}
			System.out.println(" ");
		}
	}
	
	public void show(String id) {
		Scanner in= new Scanner(System.in);
		Clothes temp=find(id);
		if(temp!=null){
			temp.data();
		}else if(id.compareTo("CANCEL")==0) {
			return;
		}
		else {
			System.out.println("EL nombre ingresado no existe, intente nuevamente o ingrese 'CANCEL' para cancelar");
			String text= in.nextLine();
			show(text);
		}
	}
}
