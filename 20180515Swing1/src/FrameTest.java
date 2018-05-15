import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("chois frame");
		frame.setSize(900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//프레임을 화면에 나타나게 하는것
	}

}
