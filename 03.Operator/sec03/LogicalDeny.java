package sec03;
public class LogicalDeny {
	public static void main(String[] args) {
		
		boolean power = false; // => power가 거짓이라는 값을 저장.
		System.out.println("power = " + power);
		
		power = !power; // => !는 '~가 아닐 때(혹은 반대)'라는 의미 
		System.out.println("power = " + power);
//		피연산자가 boolean일 때만 사용, 값이 true, false 둘 중 하나로 출력.
		
		 int a = 3;
	     a = a + 1;
	     System.out.println("a = " + a);
	}
}
