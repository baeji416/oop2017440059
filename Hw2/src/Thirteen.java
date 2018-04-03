import java.util.Scanner;
public class Thirteen {

	public static void main(String[] args) {
		System.out.println("13번 문제");
		//13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) 
		//1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		int m, d;
		Scanner input=new Scanner(System.in);
		System.out.print("월, 일을 순서대로 입력하시오 : ");
		m=input.nextInt();//키보드에서 숫자 입력
		d=input.nextInt();//키보드에서 숫자 입력
		int sum=0;
		switch (m) {
		case 1 : sum= sum + d; break;
		case 2 : sum= sum + 31 +d; break;
		case 3 : sum= sum + 31 + 28 + d; break;
		case 4 : sum= sum + 31 + 28 + 31 + d; break;
		case 5 : sum= sum + 31 + 28 + 31 + 30 + d; break;
		case 6 : sum= sum + 31 + 28 + 31 + 30 + 31 + d; break;
		case 7 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + d; break;
		case 8 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + d; break;
		case 9 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d; break;
		case 10 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d; break;
		case 11 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d; break;
		case 12 : sum= sum + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d; break;
		}
		System.out.print(sum);
	}

}
