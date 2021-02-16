import java.util.ArrayList;


public class MyArrayList {
	
	public MyArrayList() {
		ArrayList<String> al = new ArrayList<String>();
	
		al.add("Andy");
		al.add("Sam");
		al.add("Ivan");
		al.add("Zack");
		String first = al.get(0);
		String last = al.get(al.size() - 1);

		System.out.println("My Array List: " + al);
		System.out.println("First Array List Element: " + first);
		System.out.println("Last Array List Element: " + last);

		
		
	}
}
