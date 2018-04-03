import java.util.Scanner;
public class TwentyOne {

	public static void main(String[] args) {
		// 21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		n=input.nextInt();//키보드에서 숫자 입력
		int sum=0;
		int k=2;
		while(n>=k) {
			int i=2;
			while(k>i) {
				if (k%i==0) 
					break;				
				else
					i++;
			}
			if(k==i) {
				sum=k+sum;
				k++;
			}
			else 
				k++;
				
		}
		
		System.out.print(sum);
	}

}
