package bji1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		// tina.IDN = "30942394";  Error: IDN is a private field.
		tina.nickName = "tt"; 
		tina.publicField = "u2";
		//tina.privateField = "Sting";
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa= new Animal();
		aa.protectedField = "add";
	}

}
