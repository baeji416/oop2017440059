import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2������");
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		Scanner input=new Scanner(System.in);
		System.out.print("ù���� ������ �Է��Ͻÿ�:");
		a=input.nextInt();
		if (a%2==1) {
			
			System.out.println("a�� Ȧ��");
		}
		else {
				System.out.println("a�� ¦��");
			System.out.print("==============���α׷� ����===============");
		}
			


	}

}
