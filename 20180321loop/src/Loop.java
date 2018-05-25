
public class Loop {

	public static void main(String[] args) {
		//1~10까지 정수를 화면에 출력
		int i;//i는 루프변수
		i=1;//1.루프변수 초기화
		while(i<=10) { //2.루프 조건식
			System.out.println(i);//3.루프문
			i++;//4.루프변수 변화
		}
		//위의 while문을 for문으로 변환
		for (i=1; i<=10;i++) {
			System.out.println(i);
		}
		
		int sum=0;
		i=1;
		while(i<=10) { 
			sum=sum+i;
			i++;
		}
		System.out.println("sum"+ sum);
		 System.out.println("=========================프로그램 종료==============");
		 
		 String str="hello darkness my old friend";
		 int count=0;
		 for(i=0; i<str.length(); i++) {
			 if(str.charAt(i) !='l')
				 continue;//continue= 조건식으로 가는것
			count++;
		 }
		 System.out.println("문장에서 발견한 1의 갯수" + count);
		 
	}

}
