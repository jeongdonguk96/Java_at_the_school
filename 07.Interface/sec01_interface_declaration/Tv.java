package sec01_interface_declaration;

public class Tv implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv 전원을 끕니다.");
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

}
