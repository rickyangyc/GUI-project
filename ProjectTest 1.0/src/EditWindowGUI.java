



import javax.swing.*;
import java.awt.*;

public class EditWindowGUI extends JFrame{

	public EditWindowGUI() {
		getContentPane().setBackground(Color.white);
		getContentPane().setForeground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(3);
		add(new EditWindow());
		pack();
		
	}
	public static void main(String[] args) {
		EditWindowGUI t = new EditWindowGUI();
	}

}
