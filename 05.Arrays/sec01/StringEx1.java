package sec01;

public class StringEx1 {

	public static void main(String[] args) {
		
		String str1 = new String("Java Program");
		
//		// string.charAt(); : 문자열의 ()번째 인덱스의 문자값
//		System.out.println("str1의 5번 인덱스의 값 = " + str1.charAt(5));
//		System.out.println("str1의 0번 인덱스의 값 = " + str1.charAt(0));
//		
//		// string.length() : 문자열의 길이(갯수) *문자열이기 때문에 ()사용
//		System.out.println("str1의 문자열 길이(갯수)는 = " + str1.length());
//
//		// string.substring() : 원하는 인덱스부터 문자열 출력 
//		System.out.println("str1의 5번 인덱스부터의 문자열은 : " + str1.substring(5));
//		
//		// string.substring( , ) : 원하는 인덱스범위의 문자열 출력
//		System.out.println("str1의 0~4번까지 인덱스의 문자열은 : " + str1.substring(0, 4));
//				
//
//		String st1 = "Java Program";
//		String st2 = "Java Program";
//		
//		if (st1.equals(st2)) System.out.println("st1과 st2는 같다");
		
		for (int i=0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
//		int[] a = {1, 3, 5, 6, 7};
//		System.out.println(a.length);
//		System.out.println(a[3]);
	}
}