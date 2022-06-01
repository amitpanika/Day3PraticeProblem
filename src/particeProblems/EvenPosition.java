package particeProblems;

public class EvenPosition {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("even position are");

		// position
		for (int i = 1; i < num.length; i = i + 2) {
			System.out.println(num[i]);

		}
	}
}