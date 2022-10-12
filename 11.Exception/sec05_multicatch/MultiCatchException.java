package sec05_multicatch;

/* 
* 명령행에서 데이터를 2개 입력받아 계산을 수행
* multi catch로 예외처리
*/
public class MultiCatchException {

	public static void main(String[] args) {		
		try {
			String data0 = args[0];
			String data1 = args[1];	
			
			int value1 = Integer.valueOf(data0);
			int value2 = Integer.valueOf(data1);
			
			int result = value1 + value2;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("**예외발생** 실행 입력값의 개수가 부족합니다.");
			System.out.println("[실행 방법] java MultiCatchException num num2");
		} catch(NumberFormatException e) {
			System.out.println("**예외발생** 실행 입력값이 숫자로 변환할 수 없는 데이터입니다.");	
		} catch(Exception e) { // Exception은 모든 예외를 처리하기 때문에 가장 뒤에 두는 게 좋음
			System.out.println("뭔지 모르겠지만 실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
