
public class TwentyThree {

	public static void main(String[] args) {
		System.out.println("23번 문제");
		// 23.***** *
		//    *** ***
		//    * *****
		//를 출력하시오(반복문 써서!)
		int i=0;
		
		while(i<3) {
			int a=0;
			while(a<7) {
				if(i==0&&a==5||i==1&&a==3||i==2&&a==1)
					System.out.print(" ");
				else
					System.out.print("*");
				a++;
			}
			System.out.println("");
			i++;
			
		}
		
 		
		
	}

}
