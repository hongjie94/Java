import java.util.LinkedList;

public class MyLinkedList {
	
	public MyLinkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Andy");
		ll.add("Sam");
		ll.add("Ivan");
		ll.add("Zack");
		String first = ll.get(0);
		String last = ll.get(ll.size() - 1);
		
		System.out.println("My Linked List: " + ll);
		System.out.println("First Linked List Element: " + first);
		System.out.println("Last Linked List Element: " + last);

		System.out.println(ll);
	}
}
