package Exercise;

public class Ex5 {

	public static void main(String[] args) {
				
		int i = 1;
		while(i<=110) {
			if(i%3==0 && i%5==0) {
				System.out.println("짝짝짝");
			} else if(i%5==0) {
				System.out.println("짝짝");
			} else if(i%3==0) {
				System.out.println("짝");
			} else
				System.out.println(i);
			i += 1; // 기본출력이 조건문 뒤에 나와야 함.
		}		
		
	}
}