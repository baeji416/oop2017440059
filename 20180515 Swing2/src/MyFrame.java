import java.awt.FlowLayout;
import javax.swing.*;

//프레임 만드는 두번떄 방법: JFrame으로부터 상속받은 클라스를 만든다.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		
		//setLayout(new FlowLayout());//플로우 배치 매니저 사용
		
		JLabel label = new JLabel("네자리 정수를 입력하시오.");//레이블 객체 생성	
		JTextField tf = new JTextField(30);//텍스트필드 객체 생겅
		JButton button = new JButton("chois button");//버튼 객체 생성
		button.setText("최성종");
		tf.setText("봄은 봄이로되 졸립구먼");
		
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		
		this.add(button);//버튼 객체를 프레임에 추가
		this.add(panel);
		//this.add(label);//레이블 객체를 프레임에 추가
		//this.add(tf);//텍스트필드 객체를 프레임에 추가
		
		//pack(); //컴포넌트들을 꽉 채워서 프레임크기를 정함
		
		
		this.setVisible(true);
	}
}
