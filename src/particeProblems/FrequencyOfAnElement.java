package particeProblems;

import java.util.Scanner;

public class FrequencyOfAnElement {

	
	public static void main(String[] args) {
		int key;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		key=scanner.nextInt();
		int[]numbers = new int[] { 1,5, 2, 3, 4, 5, 6 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
	     if (i==key)
	    	 System.out.println("frequency");
	     else
	    	 System.out.println("not");
		
	}
	}
}

