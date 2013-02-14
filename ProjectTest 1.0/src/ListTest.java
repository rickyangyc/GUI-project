import java.util.*;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Skit> l = new LinkedList<Skit>();
		l.add(new Skit(7,"Hej"));
		l.add(new Skit(15,"Hej2"));
		
		System.out.println(l);
		
		System.out.println(l.get(0));
	}
	
	
}
