package test.clothes;

public class Clothes {
	public String name;
	protected String type;
	protected String desc;
	public Clothes(String id,String clothe){
		name=id;	
		type=clothe;
	}
	public void data() {
		System.out.println("Nombre="+ name);
		System.out.println("Tipo="+ type);
	}
	
}
