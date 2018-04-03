import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5번문제");
		//5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		//choose one of the following.
		 //apple
		 //orange
		 //banana
		 //peach

		 //enter your choice here : (사용자 입력)orange

		 //--------------
		 //Your choice is “orange”.
		String a;
		System.out.println("choose one of the following");
		System.out.println("apple,orange,banana,peach");
		Scanner input=new Scanner(System.in);
		a=input.next();
		System.out.print("enter your choice here:"+ a);
		
		
		

	

	}

}
