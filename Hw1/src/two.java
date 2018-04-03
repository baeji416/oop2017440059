import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2번문제");
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int a;
		Scanner input=new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하시오:");
		a=input.nextInt();
		if (a%2==1) {
			
			System.out.println("a는 홀수");
		}
		else {
				System.out.println("a는 짝수");
			System.out.print("==============프로그램 종료===============");
		}
			


	}

}
