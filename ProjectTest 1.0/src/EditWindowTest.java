


import javax.swing.*;
import java.awt.*;

public class EditWindowTest extends JFrame{

	public EditWindowTest() {
		getContentPane().setBackground(Color.white);
		getContentPane().setForeground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(3);
		add(new EditWindow());
		pack();
		
	}
	public static void main(String[] args) {
		EditWindowTest t = new EditWindowTest();
	}

}
