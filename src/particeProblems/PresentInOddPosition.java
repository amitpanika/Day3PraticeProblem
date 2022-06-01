package particeProblems;

public class PresentInOddPosition {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("odd position");
		for (int i = 1; i < num.length; i = i + 2) {
			System.out.println(num[i]);
		}
	}
}
