/*This class will constitute the edit window.
 *The different components are declared directly as instance variables.
 */


import javax.swing.*;

import com.sun.xml.internal.ws.Closeable;

import sun.java2d.Disposer;

import java.awt.*;
import java.awt.event.*;

public class EditWindow extends JPanel implements ActionListener {
	
	private taskObject task;
	
	private JTextField title = new JTextField(15);
	private JComboBox day = new JComboBox();
	private JComboBox month = new JComboBox();
	private JComboBox year = new JComboBox();
	private JComboBox category = new JComboBox();
	private JComboBox priority = new JComboBox();
	private JTextArea notes = new JTextArea(5,15);
	private JLabel titleL = new JLabel("Title: ");
	private JLabel reminder	= new JLabel("Reminder: ");
	private JLabel categoryL = new JLabel("Category: ");
	private JLabel priorityL = new JLabel("Priority: ");
	private JLabel notesL = new JLabel("Notes: ");
	private JButton done = new JButton("Done");
	
	public EditWindow() {
		
		setBackground(Color.white);
		for (int i=1; i<=28;i++)
			day.addItem(i);
		
		month.addItem("January"); month.addItem("February");
		month.addItem("March"); month.addItem("April");
		month.addItem("May"); month.addItem("June");
		month.addItem("July"); month.addItem("August");
		month.addItem("September"); month.addItem("October");
		month.addItem("November"); month.addItem("December");
		
		category.addItem("Work"); category.addItem("School");
		category.addItem("Entertainment");
		
		year.addItem(2013); year.addItem(2014);
		
		priority.addItem("Low"); 
		priority.addItem("Medium");
		priority.addItem("High");
		
		setLayout(new GridBagLayout());
		setBackground(Color.gray);
		GridBagConstraints con = new GridBagConstraints();
		con.anchor = GridBagConstraints.WEST;
		// Add title
		con.gridy = 0; con.gridx = 0;
		con.insets = new Insets(0,0,10,30);
		add(titleL,con);
		con.gridy = 0; con.gridx = 1;
		con.insets = new Insets(0,0,10,30);
		add(title,con);
		
		// Add reminder
		con.gridy = 1; con.gridx = 0;
		con.insets = new Insets(0,0,10,30);
		add(reminder,con);
		con.gridy = 1; con.gridx = 1;
		con.insets = new Insets(0,0,10,10);
		add(day, con);
		con.gridy = 1; con.gridx = 2;
		con.insets = new Insets(0,0,10,10);
		add(month, con);
		con.gridy = 1; con.gridx = 3;
		con.insets = new Insets(0,0,10,10);
		add(year, con);
		
		//Add category
		con.gridy = 2; con.gridx = 0;
		con.insets = new Insets(0,0,10,30);
		add(categoryL, con);
		con.gridy = 2; con.gridx = 1;
		con.insets = new Insets(0,0,10,30);
		add(category, con);
		
		//Add priority
		con.gridy = 3; con.gridx = 0;
		con.insets = new Insets(0,0,10,30);
		add(priorityL, con);
		con.gridy = 3; con.gridx = 1;
		con.insets = new Insets(0,0,10,30);
		add(priority, con);
		
		// Add notes
		con.gridy = 4; con.gridx = 0;
		con.insets = new Insets(0,0,0,30);
		add(notesL, con);
		con.gridy = 4; con.gridx = 1;
		con.anchor=GridBagConstraints.NORTHWEST;
		con.insets = new Insets(0,0,0,30);
		add(notes, con);
		
		con.gridy = 5; con.gridx = 3;
		con.insets = new Insets(0,0,20,20);
		add(done, con);
		done.addActionListener(this);
	}
	
	public taskObject getTask() {
		return task;
	}
	//Listener method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == done) {
			task = new taskObject(title.getText(), 
					category.getItemAt(category.getSelectedIndex()).toString(), 
					priority.getItemAt(priority.getSelectedIndex()).toString(), 
					"fixed example date");
			setVisible(false);
		}
		System.out.print(task);
	}
}
