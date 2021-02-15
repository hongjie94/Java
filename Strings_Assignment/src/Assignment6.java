
public class Assignment6 {
	public static void main(String[] args) {
		String sentence = "Hello My Name is Java";
		int index = sentence.indexOf(" ", sentence.indexOf(" ") + 1);
//		int index = sentence.indexOf(" ", 6);

		System.out.println("The second space is at: " + index);
	}
}
