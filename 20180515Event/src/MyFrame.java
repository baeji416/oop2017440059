import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JButton button,btn;//모든 메소드에서 접근할 수 있다.
	JTextField tf;
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois event");
		
		//새로운 컴포넌트를 프레임에 추가
		this.setLayout(new FlowLayout());//플로우 배치 매니저 사용
		JButton button = new JButton("chois button");//버튼 객체 생성
		this.add(button);//버튼 객체를 프레임에 추가
		this.button.setActionCommand("button1");
		button.addActionListener(this);//이벤트 리스너 객체등록
		this.btn = new JButton("두번째 버튼");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);//이벤트 리스너 객체등록
		
		tf = new JTextField(20);
		this.add(tf);
		this.setVisible(true);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 래퍼런스값) 가져온다.
		//JButton button = (JButton) e.getSource();
		if((e.getActionCommand()).equals("button1"))
			this.tf.setText("첫번째 버튼");
		else 
			this.tf.setText("두번째 버튼");
		
}
}