package sec11;

public class ConditionalOp {

	public static void main(String[] args) {
		
		int x = -10;
		int result = 0;
		
		result = (x>=0) ? x : -x;
		
//		System.out.printf("x=%d의 절대값은 %d입니다.\n", x, result);
		
		// int변수 score에 0~100 사이의 값을 저장한다.
		// String변수 grade에는 scroe의 값이 60보다 작으면 "합격" 그렇지 않으면 "불합격"을 저장하여 결과를 출력한다.
		// <출력결과> score = 78 결과 : 합격
		
		int score = 78;
		String grade = (score>=60) ? "합격" : "불합격";
		System.out.println("score = " + score);
		System.out.println("결과 = " + grade);
		
		
		System.out.printf((score>=60) ? "score = %d \n결과 = 합격" : "score = %d \\n결과 = 불합격", score);
		
	}
}
