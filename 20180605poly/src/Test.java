
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//Upcasting
		Animal aCat = new Cat("망고");//Upcasting
		aDog.sing();
		//error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch();
		
		((Dog) aDog).playFetch();//Downcasting
		//error ((Cat) aCat).playFetch();    컨파일 타입 에러(말도안되는것)
		//error ((Dog) aCat).playFetch(); 	  런타입 에러
		aCat.sing();
	}

}
