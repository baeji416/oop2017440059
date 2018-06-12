import java.util.*;

public class Sweep {
	public static void main(String[] args) {
		Set<String> strs;
		// strs = new HashSet<>();//�ؽ��Լ� ������ ... �� ������ �� �� ����
		//strs = new TreeSet<>();//���ĺ������� ���ĵǾ� ����
		strs = new LinkedHashSet<>();//�Է¼�����. . .
		//�⺻�� �޼ҵ� add(), remove(),sweep ...
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		Iterator<String> e = strs.iterator();
		while(e.hasNext()) {//������ �ȴ�
			String str = e.next();//�ϳ��� ������.
			System.out.println(str);
		}
		//�ι�° �ȴ� ���: for() �ݺ��� ���
		for(String str: strs) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			System.out.println(str);
		}
		
		
	}
}