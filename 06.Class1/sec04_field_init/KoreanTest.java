package sec04_field_init;

class Korean{
	
	String nation = "대한민국";
	String name;
	String birthday;
	
	public Korean(String name, String birthday) { // 매개변수 생성자 생성
		this.name = name;
		this.birthday = birthday;
		
	}
}


public class KoreanTest {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("홍길동", "1908. 08. 12"); //매개변수 생성자에 값 넣음
		Korean k2 = new Korean("이순신", "1508. 02. 12"); //매개변수 생성자에 값 넣음
		
		System.out.printf("국적 = %s\n이름 = %s\n생년월일 = %s\n\n", k1.nation, k1.name, k1.birthday);
		System.out.printf("국적 = %s\n이름 = %s\n생년월일 = %s\n", k2.nation, k2.name, k2.birthday);
		
	}
}
