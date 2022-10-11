package sec04;

public class ArrayCopy {

	public static void main(String[] args) {
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		// System.arraycopy();를 이용해 배열 abc와 num을 붙여서 하나의 큰 배열로 만들기
		char[] result = new char[abc.length+num.length];
		System.arraycopy(abc, 0, result, 0, abc.length); // result에 abc를 복사
		System.arraycopy(num, 0, result, 4, num.length); // abc가 복사된 result에 num을 복사
		System.out.println(result);
		// (복사할 배열, 복사할 첫 인덱스자리, 결과물, 결과물에 붙일 인덱스자리, 복사할 인덱스 길이)
		
		
		
		
	}
}