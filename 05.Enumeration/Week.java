
// 요일들은 구성원들의 값이지 문자열이 아님
public enum Week {
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"),
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURNDAY("토요일"),
	SUNDAY("일요일");

	final private String name;
	
	private Week(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
// Week이라는 클래스가 생기고 각 요일이 객체로 생성