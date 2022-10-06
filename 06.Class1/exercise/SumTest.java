package exercise;

class Sum {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
//	public int sum(int a, int b) {
//		return a+b;
//	}
	
	public void sum(float a, float b) {
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
	
public class SumTest {

	public static void main(String[] args) {
		
		Sum s1 = new Sum();
		s1.sum(1, 5);
		s1.sum(1.2f, 3.4f);
		s1.sum(5, 7, 6);

	}

}
