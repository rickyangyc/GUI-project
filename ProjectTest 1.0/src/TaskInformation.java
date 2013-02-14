/* This class will contain the information for the task, the instance variables are quite self explanatory.
 * As of now this is more of a dummy class just to test the basic functionality of the GUI.
 */

public class TaskInformation {
	private String task;
	private String category;
	private String priority;
	private String dueTime;
	
	public TaskInformation(String t, String cat, String prio, String due) {
		task = t;
		category = cat;
		priority = prio;
		dueTime = due;
	}
}
