import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		System.out.println("6번문제");
		//6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
		//사용자 입력 : 한 개의 두 자리 정수
		 //출력 : 자릿수의 순서가 반대로 된 정수
		int a;
		int b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("두자리 정수를 입력하시오:");
		a=input.nextInt();
		b=a/10;
		c=a%10;
		a=b+c*10;
		System.out.print("자릿수의 순서가 반대로 된 정수:"+a);
		
		
	}

}
