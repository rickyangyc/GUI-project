// This class is the class that defines the tabs where the tasks are shown

import javax.swing.*;
import java.awt.*;

public class TaskTab extends JPanel {
	
	//instance variables
	private taskObject task;
	private JButton edit, remove;
	//private JCheckBox checkBox = new JCheckBox();
	
	//constructor
	public TaskTab(String taskName, String category,
			String priority, String dueTime) {
		
		task = new taskObject(taskName, category, priority, dueTime);
		edit = new JButton("Edit");
		remove = new JButton("Remove");
		
		// layout fixing
		setLayout(new GridLayout(1,6));

		add(new JLabel(task.getName())); 
		add(new JLabel(task.getCategory()));
		add(new JLabel(task.getPriority()));
		add(new JLabel(task.getTime()));
		add(edit);
		add(remove);
		
		
		setBackground(Color.white);
		setForeground(Color.black);
		
	}
}
