import java.util.*;

public class taskObject {
	
	private String taskName, category, priority, dueTime; 
	
	public taskObject( String name, String cat, String prio, String dueT) {
		taskName = name;
		category = cat;
		priority = prio;
		dueTime = dueT;
	}
	
	public String getName() {
		return taskName;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public String getTime() {
		return dueTime;
	}
	
	public String toString() {
		return "{" + taskName + ", " + category + ", " + priority + ", " + dueTime + "}";
	}
}
