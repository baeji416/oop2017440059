
public class TwentyThree {

	public static void main(String[] args) {
		System.out.println("23�� ����");
		// 23.***** *
		//    *** ***
		//    * *****
		//�� ����Ͻÿ�(�ݺ��� �Ἥ!)
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
