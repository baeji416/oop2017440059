import java.util.Scanner;
public class Nineteen {

	public static void main(String[] args) {
		//19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		int m;
		Scanner input=new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		m=input.nextInt();//키보드에서 숫자 입력
		int i=2;
		if (m<=1)
			System.out.print("소수가 아닙니다");
		else {
			while(m>i) {
				if (m%i==0) {
					break;
				}
				else
					i++;
			}
			if(i==m)
				System.out.print("소수 입니다");
			else
				System.out.print("소수가 아닙니다");
				
		}

	}

}
