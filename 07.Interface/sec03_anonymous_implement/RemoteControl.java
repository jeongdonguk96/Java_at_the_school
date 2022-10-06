package sec03_anonymous_implement;
public interface RemoteControl {
	
	// 인터페이스는 public static final이 기본이라 생략 가능 (모든 게 상수)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스는 public abstract가 기본이라 역시 생략 가능
	void turnOn(); // 전원을 켜는 기능
	void turnOff(); // 전원을 끄는 기능
	void setVolume(int volume);
	
	// 추상매서드가 기본이지만 필요한 클래스만 쓰도록 default매서드도 구현 가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음을 해지합니다.");
		}
	}
	
	// static매서드는 main매서드에서 객체생성 없이 사용하는 부모클래스의 매서드.
	static void changeBattery() {
		System.out.println("리모컨의 배터리를 교체합니다.");
	}
	
}