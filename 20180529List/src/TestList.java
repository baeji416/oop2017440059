import java.util.*;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		//upcasting: 부모(인터페이스)타입의 참조변수로 자식(구현클라스)타입을 객체로 참조하는것
		//Upcasting은 인터페이스 사용 및 다형성을 위해 필요한 기능이다.
		//LinkedList<String> list = new LinkedList<String>();
		//List<String> list = new ArrayList<String>();
		list.add(0,"zero");
		list.add("one");
		list.add("two");
		list.add(1,"돌");
	
		System.out.println(list);
		
	}
}
