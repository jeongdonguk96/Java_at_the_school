package sec05;
public class Overflow {
	public static void main(String[] args) {
		
		/* 1, 2, 3 */ 
		int a = 10_000_000;
		int b = 20_000_000;
		int c = a * b;
		System.out.println("1. c(a*b) = " + c);
		System.out.println("");
		long d = a * b; // int * int = int인데, 최종 값 int가 한계를 넘어버리면 출력이 제대로 안됨.
		System.out.println("2. d(a*b) = " + d);
		System.out.println("");
		d = (long)a * b; // 그래서 둘 중 하나를 long타입으로 캐스팅해서 연산한 후 출력해야함.
		System.out.println("3. d(a*b) = " + d);
		System.out.println("");
		
		/* 4, 5, 6 */
		float PI = 3.141592f;
		float shortPI = (int)(PI*1000) / 1000f;
		System.out.println("4. shortPI = " + shortPI);
		System.out.println("");
		float shortPI2 = (int)(PI*100000) / 100000f;
		System.out.println("4. shortP2I = " + shortPI2);
		System.out.println("");
		
	}
}
