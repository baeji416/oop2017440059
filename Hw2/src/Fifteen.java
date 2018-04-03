import java.util.Scanner;
public class Fifteen {

	public static void main(String[] args) {
		System.out.println("15번 문제");
		//15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨),10번 이내로 그 숫자를 맞추는 게임을 작성하시오.
		//(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)
		//예) 답이 49일 경우:
		//숫자를 입력하시오: 36
		//입력하신 숫자보다 큽니다.
		//숫자를 입력하시오: 51
		//입력하신 숫자보다 작습니다.
		//숫자를 입력하시오: 49
		//정답입니다!
		int a = 30;
		int m;
		Scanner input=new Scanner(System.in);
		int count=0;
		
		while(count<10) {
		System.out.println("숫자를 입력하시오 : ");
		m=input.nextInt();//키보드에서 숫자 입력
		if(a<m) 
			System.out.println("입력하신 숫자보다 작습니다");
		else if (a>m)
			System.out.println("입력하신 숫자보다 큽니다");
		else 
			break;
		count++;
		}
		if (count == 10)
			System.out.println("Game over");
		else
			System.out.println("정답입니다");

		

	}
}
