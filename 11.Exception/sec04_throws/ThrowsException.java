package sec04_throws;

public class ThrowsException {

	public static void main(String[] args) {
		
		try {
			searchClass();
		} catch (ClassNotFoundException e) {
			System.out.println("예외발생!! 존재하지 않는 클래스를 호출했습니다.");
		}
	}
	
	public static void searchClass() throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String2"); // throws : 예외발생시 호출한 매서드로 예외 떠넘기기
	}
	

}
