import java.util.Scanner;
public class Nine {

	public static void main(String[] args) {
		System.out.println("9번문제");
		//8. 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.(5이면 5단을 출력)
		//9. 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니,
		//이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 
		//다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("출력할 구구단 :");
		i=input.nextInt();//키보드에서 숫자 입력
		
		int p=1;
		while(p<10) {
			if (i>9) {
				System.out.print("다시 입력하시오 :");
			i=input.nextInt();
			}
			else {
				System.out.println(p*i);
				p++;
			}
				
		}

	}

}
