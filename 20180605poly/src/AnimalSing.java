import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AnimalSing {
	List<Animal> list;//Animal�� �ڽ�Ŭ�󽺸� ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal>();
		}
	//�ϴ� ����ȯ�� �ϴ� �ñ����� ������ �޼ҵ��� �Ű������� ��� �����Ҽ��ִ�.
	//������ ������ �ֱ⿡ �׷��ٶ�� ������ �� ������.
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();
		}
	}
}