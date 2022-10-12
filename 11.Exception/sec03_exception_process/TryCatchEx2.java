package sec03_exception_process;

public class TryCatchEx2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // try문에 예외가 발생하면 뒤에 남은 try문은 무시하고 바로 catch로 간다
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); 
		} finally {				   
			System.out.println(6);
		}
		System.out.println(7);
		
		
	}

}
