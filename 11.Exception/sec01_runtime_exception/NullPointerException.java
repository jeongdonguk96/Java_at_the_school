package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		
		String data = null; // 저장소가 할당되지 않음
		String data2 = "";
		String data3;
		
		// data = new String("abc"); // new연산자를 통해 객체 생성
		
		System.out.println(data.toString());
		System.out.println(data2.toString());
		// System.out.println(data3.toString());
		
		
		
	}

}
