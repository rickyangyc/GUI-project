// This class is made to contain the TaskTabs

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TaskContainer extends JPanel {
	//private ArrayList<taskObject> tabs;
	
	public TaskContainer() {
		
	
		setLayout(new GridLayout(4, 1, 0, 2));
		setBackground(Color.black);
		
		TaskTab t1 = new TaskTab("Go to school", "School", "Low", "18:10");
		TaskTab t2 = new TaskTab("Go home", "Home", "Low", "20:00");
		TaskTab t3 = new TaskTab("Eat", "School", "Low", "18:10");
		TaskTab t4 = new TaskTab("Go to school", "School", "Low", "18:10");
		add(t1); add(t2); add(t3); add(t4);
		
		
		/*tabs = taskObjectList;
		setLayout(new GridLayout(tabs.size(), 1, 0, 2));
		setBackground(Color.black);

		
		Iterator itr = tabs.iterator();
		
		int i = 0;
		
		while(itr.hasNext()){
			add(new TaskTab(tabs.get(i)));
			i++;
		}*/
	}
	
	
}
