/* This is the main GUI.
 */

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;



public class MainGUI extends JFrame implements ActionListener {
	
	
	//private ArrayList<taskObject> taskL;
	private Tabs tabs = new Tabs();
	private TaskContainer taskCont = new TaskContainer();
	//private EditWindow editW = new EditWindow();
	private ViewChooser viewChooser = new ViewChooser();
	private JButton add = new JButton("Add");
	
	
	public MainGUI(){
		/*Declare some test data for the table representation.
		 *This will be done with XML later on
		 */
		/*String[] columnNames = {"Task", "Category", "Priority", "Due TIme"};
		
		TaskInformation[][] tasks = {{new TaskInformation("Eat food", "Food eating", "High", "18:50")},
				{new TaskInformation("Clean dishes", "Cleaning", "Low", "19:00")},
				{new TaskInformation("Sleep", "Spare time", "High", "20:20")}};*/
		/*
		String[] columnNames = {"Task name", "Category", "Priority", "Due Time"};
		Object[][] data = {{"Eat food", "Food eating", "High", "18:50"},
				{"Clean dishes", "Cleaning", "Low", "19:00"},
				{"Sleep", "Spare time", "High", "20:20"}};

		JTable table = new JTable(data, columnNames);
		*/
		
		//Declare the table to present the data
		//taskT = new JTable(tasks, columnNames);
		/*add.addActionListener(this);
		getContentPane().setBackground(Color.white);
		setForeground(Color.white);*/
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridBagLayout());
		GridBagConstraints con = new GridBagConstraints();
		
		//Add the tabs
		con.gridy = 0; con.gridx = 0;
		con.insets = new Insets(20,20,0,20);
		con.anchor = GridBagConstraints.NORTHWEST;
		add(tabs, con);
		
		//Add the view chooser
		con.gridy = 1; con.gridx = 0;
		con.insets = new Insets(20,20,20,20);
		add(viewChooser, con);
		
		//Add the add button
		con.gridy = 1; con.gridx = 1;
		con.anchor = GridBagConstraints.EAST;
		con.insets = new Insets(20,20,20,20);
		add.addActionListener(this);
		add(add, con);
		/*
		//Add the table header
		con.gridy = 2; con.gridx = 0;
		con.weightx =1;
		con.gridwidth =2;
		con.insets = new Insets(0,20,0,20);
		con.fill = GridBagConstraints.BOTH;
		add(table.getTableHeader(),con);
		
		//Add the table
		con.weightx = 1; con.weighty = 1;
		con.gridy = 3; con.gridx = 0;
		con.gridwidth = 2;
		con.insets = new Insets(0,20,20,20);
		con.fill = GridBagConstraints.BOTH;
		add(table, con);
		*/
		
		con.gridy = 2; con.gridx=0;
		con.weightx =1;
		con.gridwidth=1;
		con.insets = new Insets(20,20,20,20);
		add(taskCont, con);
		pack();
		
	}


	public static void main(String[] args) {
		MainGUI main = new MainGUI();
	}

	
	/*public void addToTasks(taskObject taskIn) {
		taskL.add(taskIn);
	}*/


	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			new EditWindowGUI();
		}
	}
}
