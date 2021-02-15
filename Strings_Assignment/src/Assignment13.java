
public class Assignment13 {
	public static void main(String[] args) {
		String str1 = "angeq";
		String str2 = "glean";
		

		
		
		if (str1.equals(str2)) {
			System.out.println("The strings are equal and not anagrams");
			System.exit(0);
		}
		if (str1.length() != str2.length()){
			System.out.println("The strings are different lengths");
			System.exit(0);
		}
		
		int[] map = new int[str1.length()];
		
		for (int i = 0; i < map.length; i++){
			map[i] = -1;
			System.out.println(map[i]);
		}
		
		for (int i = 0; i < str1.length(); i++) {
			
		}
		
		
	}
}
