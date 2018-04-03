
public class TwentyFive {

	public static void main(String[] args) {
		System.out.println("25번 문제");

	 //25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
	 //(1) *********** (2)54321012345
	 //********* 432101234
	 //******* 3210123
	 //***** 21012
	 //*** 101
	 //* 0
	 //*** 101 
	 //***** 21012 
	 // ******* 3210123 
	 //********* 432101234 
	 //*********** 54321012345
		int a,b;
		
		for(a=0;a<11;a++) {
			if(a<6) {
				for(b=0;b<11-2*a;b++)
					System.out.print("*");
					System.out.println("");
				}
			else { 
				for(b=0;b<2*a-9;b++)
					System.out.print("*");
				System.out.println("");
			}
		
			
				
		}
	

}
}
