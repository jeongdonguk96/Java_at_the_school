package sec01;

public class NestedForEx1 {

	public static void main(String[] args) {
		
		// 구구단 출력
		for (int i=2; i<=9; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d\n", i, j, i*j); // printf 출력을 통해 변수값을 넣어주기 
//		        == System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
	}
}