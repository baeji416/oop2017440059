
public class s {

	public static void main(String[] args) {
		int a= 10;
		String str;
		str = new String("Hello darkness my old friend");
		
		//String 객체의 길이
		//메소드 호출방법: 참조변수.메소드() 
		int len = str.length(); 
		System.out.println(len);
		String str1;
		str1= str.toUpperCase();
		System.out.println(str1);
		String str2;
		str2=str.toLowerCase();
		System.out.println(str2);
	}

}
