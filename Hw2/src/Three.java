
public class Three {

	public static void main(String[] args) {
		System.out.println("3번문제");
		//3. 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 
		//총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		int i;
		int num=0;
		i=1;
		while(i<=100) {
			if(i%3==0) {
				num=num+i;
				i++;
			}
			else
				i++;
		}
		System.out.println(num);
		
	}

}
