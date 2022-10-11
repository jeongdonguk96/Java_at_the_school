package sec02;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		int sum = 0;
		
		score[0] = 87;
		score[1] = 85;
		score[2] = 78;
		score[3] = 89;
		score[4] = 90;

		for (int i=0; i<score.length; i++) {
			System.out.printf("score[%d] = %d\n", i, score[i]);
//			System.out.println("score["+i+"] = " + score[i]);
			sum += score[i];
		}
		double avrg = (double)sum/score.length;
		
		System.out.println("\n점수의 총합은 = " + sum);
		System.out.println("점수의 평균은 = " + avrg);
	}
}