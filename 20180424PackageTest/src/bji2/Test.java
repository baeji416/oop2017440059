package bji2;

import bji1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age=2; Error: age is a private field
		
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//bji1.Dog aDog = new bji1.Dog();
		
		//2. import ��ɾ ���
		Dog aDog = new Dog();
		aDog.name = "happy";
		//aDog.IDN ="23222"; Error: IDN is a private field
		//aDog.nickName = "kk"; Error: nickName�� ��Ű�� ��������

		Animal aa= new Animal();
		//aa.protectedField = "add";
		
		
		Rosemary rr = new Rosemary();
		
	}

}
