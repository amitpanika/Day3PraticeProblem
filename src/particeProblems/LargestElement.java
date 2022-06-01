package particeProblems;

public class LargestElement {

	public static void main(String[] args) {

		int[] marks = new int[] { 100, 200,300};
		int max = marks[0];
		for (int i = 1; i < marks.length; i++) {
			if (marks[i] > max)
				max = marks[i];
		
		}

		System.out.println(max);
	}

}
