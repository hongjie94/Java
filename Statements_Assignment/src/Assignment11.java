
public class Assignment11 {
	public static void main(String[] args) {
		int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < myNum.length; i++) {
			for(int j = 1; j <= 10; j++) {
				int result = myNum[i] * j;
				System.out.println("result: " + result);
			}  
		}
	}
}
