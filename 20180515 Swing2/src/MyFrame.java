import java.awt.FlowLayout;
import javax.swing.*;

//������ ����� �ι��� ���: JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		
		//setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
		
		JLabel label = new JLabel("���ڸ� ������ �Է��Ͻÿ�.");//���̺� ��ü ����	
		JTextField tf = new JTextField(30);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("chois button");//��ư ��ü ����
		button.setText("�ּ���");
		tf.setText("���� ���̷ε� ��������");
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		
		this.add(button);//��ư ��ü�� �����ӿ� �߰�
		this.add(panel);
		//this.add(label);//���̺� ��ü�� �����ӿ� �߰�
		//this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		
		//pack(); //������Ʈ���� �� ä���� ������ũ�⸦ ����
		
		
		this.setVisible(true);
	}
}
