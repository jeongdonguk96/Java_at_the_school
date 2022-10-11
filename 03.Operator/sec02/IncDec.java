package sec02;
public class IncDec {
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("a = " + (++a)); // 증감연산자는 뒤에서 부터 연산 시작 => 5를 먼저 더하니까 값이 6
		
		a = 5;
		System.out.println("a = " + (a++)); // => 단항이 없이 더하기를 먼저 하니까 값이 5
		System.out.println("a = " + a);
		
		int x = 100;
		int y = 200;
//		x의 값을 먼저 증가시키고 x와 y를 더해서 result에 저장 후 출력.
//		=>
		int result = ++x + y;
		System.out.println("result = " + result);
		
		x = 100;
		y = 200;
//		x의 값을 나중에 감소시키고 x와 y를 더해서 result에 저장 후 출력.
//		=>
		result = x-- + y;
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		
		x = 10;
		y = 20;
//		x는 먼저 증가시키고, y는 나중에 증가시킨다.
//		x와 y를 더해서 result에 저장 후 출력.
//		=>
		result = ++x + y++;
		System.out.println("result = " + result);
		System.out.println("x = " + x + ", y = " + y);
		
	}
}
