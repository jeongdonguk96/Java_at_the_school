package Exercise;

public class Ex1 {

	public static void main(String[] args) {
		
		float[] f = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
		float sum = 0;
		
		for (int i=0; i<f.length; i++) {
			// System.out.println(f[i]);
			System.out.printf("f[%d] = %3.1f\n", i, f[i]);
			sum += f[i];
		}
		double avg = (double)sum/f.length;
		
//		System.out.println("배열 요소의 총합은 = " + sum);
		System.out.printf("배열 요소희 총합은 %3.1f입니다\n", sum);
//		System.out.println("배열 요소의 평균은 = " + avg);
		System.out.printf("배열 요소의 평균은 %3.1f입니다", avg);
		

	}
}