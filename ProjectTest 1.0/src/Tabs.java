import javax.swing.*;
import java.awt.*;

public class Tabs extends JPanel{
	private JButton calendar = new JButton("Calendar");
	private JButton overall = new JButton("Overall");
	private JButton timer = new JButton("timer");
	
	public Tabs() {
		setBackground(Color.white);
		setLayout(new GridLayout(1,3));
		add(calendar); add(overall); add(timer);
		setSize(new Dimension(200,50));
	}

}
