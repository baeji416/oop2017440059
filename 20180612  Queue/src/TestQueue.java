import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		Queue<String> strs = new LinkedList<>();
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while (!strs.isEmpty()) {
			System.out.println(strs.remove());
			Thread.sleep(2000);
		}
		

	}

}
