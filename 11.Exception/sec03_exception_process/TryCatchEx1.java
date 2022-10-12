package sec03_exception_process;

public class TryCatchEx1 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {    // Exception으로 퉁치는 것보다 예외를 알 수 있도록 예외를 써주는 게 좋다 
			System.out.println(5); // 아무런 예외가 발생하지 않아 catch부분은 건너 뛴다
		} finally {				   // 예외가 나도 무조건 실행되어야 하는 finally
			System.out.println(6);
		}
		System.out.println(7);
		
		
	}

}
