
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//Upcasting
		Animal aCat = new Cat("����");//Upcasting
		aDog.sing();
		//error aDog.playFetch();
		Dog gae = (Dog) aDog;
		gae.playFetch();
		
		((Dog) aDog).playFetch();//Downcasting
		//error ((Cat) aCat).playFetch();    ������ Ÿ�� ����(�����ȵǴ°�)
		//error ((Dog) aCat).playFetch(); 	  ��Ÿ�� ����
		aCat.sing();
	}

}
