package sec03;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int[][] scores = {
						{78, 85, 90},
						{85, 77, 88},
						{90, 67, 79},
						{55, 46, 40},
						{80, 22, 11}
		};
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length-2; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n" + Arrays.deepToString(scores));
		
	}
}