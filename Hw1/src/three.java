import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.println("3번문제");
		//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		int a,b,c;
		
		Scanner input=new Scanner(System.in);
		System.out.print("첫번쨰 정수를 입력하시오:");
		a=input.nextInt();
		
		System.out.print("두번쨰 정수를 입력하시오:");
		b=input.nextInt();
		
		System.out.print("세번쨰 정수를 입력하시오:");
		c=input.nextInt();
		
		
		if(a<b) {
			if(b<c)
				System.out.println(c);
			else
				System.out.println(b);
		}
		else {
			if(a<c)
				System.out.println(c);
			else
				System.out.println(a);
		}
			
			
	}

}
