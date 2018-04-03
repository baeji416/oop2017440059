import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out.println("7번 문제");
		//7. 0이 입력될 때까지 계속 정수를 입력 받고,
		//입력된 모든 숫자들의 총합을 출력하시오.
		
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		i=input.nextInt();
		
		int num=0;
		while(i!=0) {
			num=num+i;
			System.out.print("정수를 입력하시오:");
			i=input.nextInt();
		}
		System.out.println(num);
	}

}
