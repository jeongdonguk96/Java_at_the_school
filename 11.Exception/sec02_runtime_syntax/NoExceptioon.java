package sec02_runtime_syntax;

public class NoExceptioon {

	public static void main(String[] args) {
		int num = 10;;
		int result = 0;
		
		for(int i=0; i<10; i++) { 
			try {
				result = num / (int)(Math.random()*10);
				System.out.println(result);	
			} catch (ArithmeticException e) {
				System.out.println("you cant divide it by zero");
			}
		}
	}
	
}
