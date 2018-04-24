package bji2;

import bji1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age=2; Error: age is a private field
		
		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//bji1.Dog aDog = new bji1.Dog();
		
		//2. import 명령어를 사용
		Dog aDog = new Dog();
		aDog.name = "happy";
		//aDog.IDN ="23222"; Error: IDN is a private field
		//aDog.nickName = "kk"; Error: nickName은 패키지 접근지행

		Animal aa= new Animal();
		//aa.protectedField = "add";
		
		
		Rosemary rr = new Rosemary();
		
	}

}
