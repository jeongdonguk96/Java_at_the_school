import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {
		
		Week today = Week.THURSDAY;
		
		System.out.println("today = " + today);
		
		// compareTo는 두 값의 순서 차이를 반환 열거형(Enumeraion) 타입의 비교
		Week day1 = Week.WEDNESDAY; // 3
		Week day2 = Week.MONDAY; // 1
		int result = day1.compareTo(day2);
		System.out.println("비교 결과는 = " + result);
		int result2 = day2.compareTo(day1);
		System.out.println("비교 결과는 = " + result2);
		System.out.println();
	
		// valueOf() : ()안에 있는 문자열과 일치하는 열거형 상수 반환
		Week day3 = Week.valueOf("SUNDAY");
		System.out.println("day3 = " + day3);
		System.out.println();
		
		if(day3==Week.SUNDAY) {
			System.out.println("오늘은 일요일입니다.");
		} else System.out.println("오늘은 평일입니다.");
		System.out.println();
		
		// values() : 열거형의 모든 값을 반환
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		System.out.println();
		
		// ordinal() : 열거형 타입의 순서를 가져온다.
		int ord = day3.ordinal();
		System.out.printf("%s의 Index번호는 = %d\n", day3, ord);
		
	}
}