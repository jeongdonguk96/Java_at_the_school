package Exercise;

public class Ex1 {

	public static void main(String[] args) {
		
		int sum = 0;
		float avrg = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
			avrg = ((sum)/100f);
		}
		System.out.println("1~100의 합계는 "+ sum);
		System.out.println("1~100의 평균은 "+ avrg);
		
		
		

	}

}
