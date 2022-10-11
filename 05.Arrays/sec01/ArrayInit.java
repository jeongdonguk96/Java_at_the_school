package sec01;

public class ArrayInit {

	public static void main(String[] args) {
		
		// float 배열
		double[] arr1 = {5.5, 5.7, 5.9, 4.2, 3.8};
		
		for (int i=0; i<arr1.length; i++) {
			System.out.printf("arr1[%d] = %3.1f\n", i, arr1[i]);
		}
		System.out.println();
		
		// char 배열
		char[] chArr = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
		
		for (int i=0; i<chArr.length; i++) {
			System.out.printf("chArr[%d] = %c\n", i, chArr[i]);
		}
		
		// 문자(char)를 문자열(String)로
		String str = new String(chArr);
		System.out.println("\nstr = " + str + "\n");
		
		// 문자열(String)을 문자(char)로
		char[] ch = str.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			System.out.printf("ch[%d] = %c\n", i, ch[i]);
		}
		System.out.println();
		
		// 문자열의 배열
		String[] name = {"가", "나", "다"};
//		String[] name = new String[3];
//		name[0] = "가";
//		name[1] = new String("나");
//		name[2] = "다";
		
		for (int i=0; i<name.length; i++) {
		System.out.printf("name[%d] = %s\n", i, name[i]);
		}
	}
}