
public class TestString {

	public static void main(String[] args) {
	int a=10;  //int 형의 변수 a 
		 		//string 객체 생성 
		 String str;//클라스 스트링을 참조할 수 있는 참조변수(레퍼런스 변수) 생성 
		str = new String("Hello darkness my old friend");//객체 생성 
				 
		 	//String 객체의 길이 
			//메소드 호출방법: 참조변수.메소드() 
	int len = str.length(); 
	 System.out.println("string length is "+ len); 
		 		 
	String str1; 
	str1 = str.toUpperCase(); 
	System.out.println("str1: "+ str1); 


	}

}
