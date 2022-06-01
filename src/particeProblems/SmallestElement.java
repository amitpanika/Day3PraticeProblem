package particeProblems;

public class SmallestElement {

	public static void main(String[] args) {
		int[] a = new int[] { 100, 200, 300, 400, 500 };
		for( int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		int min = a[0];
		for (int i = 1; i <a.length; i++) {
			if (a[i] < min)
				min = a[i];
			System.out.println("smalleat"+ min);
		}
	}

}
