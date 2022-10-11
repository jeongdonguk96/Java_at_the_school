package sec04;

public class VariableArray {

	public static void main(String[] args) {
		
		// 가변배열의 선언
		int[][] score = new int[3][]; // 행만 지정하고 열은 나중에 필요할 때 아래서 지정
		
		// 여기서 열에 필요한 메모리를 지정
		score[0] = new int[5];
		score[1] = new int[4];
		score[2] = new int[3];
		
		score[0][0] = 87;
		score[0][1] = 85;
		score[0][2] = 97;
		score[0][3] = 17;
		score[0][4] = 57;
		
		score[1][0] = 55;
		score[1][1] = 80;
		score[1][2] = 90;
		score[1][3] = 27;
		
		score[2][0] = 55;
		score[2][1] = 88;
		score[2][2] = 99;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		int[][] num = {
				{87, 45, 89},
				{11, 54, 83},
				{23, 1, 55},
				{18, 87, 73, 45, 48}
		};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}