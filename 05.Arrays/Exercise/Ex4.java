package Exercise;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		
		float[] sum = new float[9];
		float[][] code = {
						{256.5f, 654.2f, 456.3f, 76.9f},
						{204.1f, 610.4f, 108.8f, 66.6f},
						{231.3f, 752, 143.1f, 142.3f},
						{302.9f, 692.6f, 307.6f, 98.7f},
						{256.9f, 1053.60f, 225.5f, 45.6f},
						{256.5f, 770.6f, 363.3f, 139.3f},
						{264.3f, 567.5f, 231.2f, 59.7f},
						{215.9f, 599.8f, 293.1f, 76.7f},
						{109.1f, 388, 427.3f, 223.1f}							
		};
		
		// 내 답안
		for(int i=0; i<9; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%8.2f ", code[i][j]);
				sum[i] += code[i][j];
			}
			System.out.printf("(%7.2f)\n", sum[i]);
		}
		// 소수점 출력으로 표의 줄 맞츰 (3.1f로 하면 표가 뒤죽박죽)
		
		// 선생님 답안. sum을 메인필드에 0으로 초기화해서 매 반복문이 끝날때 다시 0으로 초기화
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.printf("%8.2f ", code[i][j]);
//				sum[i] += code[i][j];
//			}
//			System.out.printf("(%7.2f)\n", sum[i]);
//		}
		
		// toString으로 보기좋게 출력
//		for(int i=0; i<9; i++) {
//			System.out.printf("%s", Arrays.toString(code[i]));
//			for(int j=0; j<4; j++) {
//			sum[i] += code[i][j];
//			}
//			System.out.printf("(%3.1f)\n", sum[i]);
//	}
	}
}
	
//	sum[i] += code[i][j];
//	if(code[i][j]==(code[i][3]))  System.out.println(Arrays.deepToString(code));
//}
//}		