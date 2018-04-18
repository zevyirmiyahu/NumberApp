package number_info;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ControllerApp implements ActionListener, FocusListener {
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("Ok")) {
			
			//Reset labels
			FrameApp.Even.setText("Even: ");
			FrameApp.Odd.setText("Odd: ");
			FrameApp.isPrime.setText("Prime: ");
			FrameApp.isMer.setText("Mersenne Prime: ");
			FrameApp.happy.setText("Happy Number: ");
			FrameApp.fibb.setText("Fibbonacci Number: ");
			
			
			String number = FrameApp.field.getText();
			
			
			//Checks input validity, safeguards against any input that is NOT a number
			if(!number.chars().allMatch(Character::isDigit)) { //if input contains an letters
				FrameApp.field.setBackground(Color.RED);
				FrameApp.field.setForeground(Color.WHITE);
				FrameApp.field.setText("Must be integer");
				return;
			}
			//Safe guards against fibb[] array index being to large
			if(number.length() > 8) {
				FrameApp.field.setBackground(Color.RED);
				FrameApp.field.setForeground(Color.WHITE);
				FrameApp.field.setText("Less than 9 digits");
				return;
			}
			
			int n = Integer.parseInt(number);
			
			if(ModelApp.isEven(n)) FrameApp.Even.setText(FrameApp.Even.getText() + "Yes");
			else FrameApp.Even.setText(FrameApp.Even.getText() + "No");
			
			if(!ModelApp.isEven(n)) FrameApp.Odd.setText(FrameApp.Odd.getText() + "Yes");
			else FrameApp.Odd.setText(FrameApp.Odd.getText() + "No");
			
			if(ModelApp.isPrime(n)) FrameApp.isPrime.setText(FrameApp.isPrime.getText() + "Yes");
			else FrameApp.isPrime.setText(FrameApp.isPrime.getText() + "No");
			
			if(ModelApp.isMersenne(n)) FrameApp.isMer.setText(FrameApp.isMer.getText() + "Yes");
			else FrameApp.isMer.setText(FrameApp.isMer.getText() + "No");
			
			if(ModelApp.happy(n)) FrameApp.happy.setText(FrameApp.happy.getText() + "Yes");
			else FrameApp.happy.setText(FrameApp.happy.getText() + "No");
			
			if(ModelApp.fibb(n)) FrameApp.fibb.setText(FrameApp.fibb.getText() + "Yes");
			else FrameApp.fibb.setText(FrameApp.fibb.getText() + "No");
			
		}
		else if(ae.getActionCommand().equals("About")) {
			
			FrameApp.infoFrame.setVisible(true);
			FrameApp.info.setText(ModelApp.getText());
		}
	}
	
	//Clears textfield
	public void focusGained(FocusEvent e) {
		FrameApp.field.setBackground(Color.WHITE);
		FrameApp.field.setForeground(Color.BLACK);
		FrameApp.field.setText(null);
		
	}
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
	}
}
