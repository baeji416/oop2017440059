import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.println("3������");
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a,b,c;
		
		Scanner input=new Scanner(System.in);
		System.out.print("ù���� ������ �Է��Ͻÿ�:");
		a=input.nextInt();
		
		System.out.print("�ι��� ������ �Է��Ͻÿ�:");
		b=input.nextInt();
		
		System.out.print("������ ������ �Է��Ͻÿ�:");
		c=input.nextInt();
		
		
		if(a<b) {
			if(b<c)
				System.out.println(c);
			else
				System.out.println(b);
		}
		else {
			if(a<c)
				System.out.println(c);
			else
				System.out.println(a);
		}
			
			
	}

}
