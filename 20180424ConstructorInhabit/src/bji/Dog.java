package bji;

public class Dog extends Animal {
	public Dog() {//디폴트 생성자
		//명시적 수퍼클라스의 생성자 호출  super();
		System.out.println("Dog 디폴트 생성자");
	}
	public Dog(int a) {
	  super(a);
		System.out.println("Dog 정수형생성자");
}
}
