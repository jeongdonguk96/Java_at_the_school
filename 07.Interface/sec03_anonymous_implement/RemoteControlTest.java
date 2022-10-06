package sec03_anonymous_implement;

import sec01_interface_declaration.RemoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		// 익명클래스를 이용 (단발성 클래스)
		// 클래스 구현부 끝 중괄호에 세미콜론 쳐야함 };
		// 주로 안드로이드 중 불필요한 객체생성을 줄일 때 사용
		RemoteControl rc = new RemoteControl() {
		int volume;

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다");
			}

			@Override
			public void setVolume(int volume) {
				
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
					System.out.println("최대 볼륨입니다.");
				} else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
					System.out.println("최소 볼륨입니다.");
				} else {
					this.volume = volume;
				}
				System.out.printf("현재의 볼륨은 %d입니다.\n", volume);
			}
			
		};	
		
		rc.turnOn();
		rc.setVolume(10);
	}

}
