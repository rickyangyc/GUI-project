/* This class contains the buttons for switching between the day view and the month view.
 * The buttons are contained inside a JPanel which will be placed at the main GUI
 */

import javax.swing.*;
import java.awt.*;

public class ViewChooser extends JPanel{
	private JButton day = new JButton("Day");
	private JButton month = new JButton("Month");
	

	public ViewChooser() {
		setLayout(new GridLayout(1,2));
		add(day); add(month);
	}
}
