import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a,b;
		
		Scanner input=new Scanner(System.in);
		System.out.print("ù���� ������ �Է��Ͻÿ�:");
		a=input.nextInt();//Ű���忡�� ���� �Է�
		System.out.print("�ι�° ������ �Է��Ͻÿ�:");
		b=input.nextInt();//Ű���忡�� ���� �Է�
		
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		System.out.print("==============���α׷� ����===============");
		
		}

}