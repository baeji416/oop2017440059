import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class cal extends JFrame{
	
		
	
	public cal() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("µ¡¼À °è»ê±â");
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		JTextField textField = new JTextField(20);
		textField.setText("");
		
		
		
		   JButton button[] = new JButton[10];	
		   
		   for(int i=0; i<10; i++) {	//¹øÈ£³Ö¾î
			   button[i] = new JButton(""+i);
			

		   }
		   
		   JButton buttonPlus = new JButton();
		   buttonPlus.setText("+");
		   
		   
		   JButton buttonClear = new JButton();
		   buttonClear.setText("C");
		   
		   JButton butt = new JButton();
		   butt.setText("=");
				   
		   
		   panel.add(textField);
		   for(int i=0;i<10;i++) {
			   
		   panel.add(button[i]);
		   
		   }
		   panel.add(buttonPlus);
		   panel.add(buttonClear);
		   panel.add(butt);
			

	 for(int i=0; i<10; i++) {
		   button[i].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource(); 
				String equation = textField.getText();
				
				equation += button.getText().trim();
							
				textField.setText(equation);

			}
		} );
	
	 }
	 
	 buttonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource(); 
				String equation = textField.getText();
				
				equation += button.getText().trim();
							
				textField.setText(equation);

			}
		} );
	 
	 
	 buttonClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource(); 
				String equation = textField.getText();
				
				equation += button.getText().trim();
							
				textField.setText(equation);

			}
		} );
	 
	 
	 
	 butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton button = (JButton) e.getSource(); 
				String equation = textField.getText();
				
				equation += button.getText().trim();
							
				textField.setText(equation);

			}
		} );
	 
	 
	 
	 
	 
	 
		   this.setContentPane(panel);
		setVisible(true);
	 }
	   


}

public class calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new cal();
	}
	
}

