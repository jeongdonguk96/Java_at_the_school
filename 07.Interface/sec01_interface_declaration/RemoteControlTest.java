package sec01_interface_declaration;

public class RemoteControlTest {

	public static void main(String[] args) {
		Audio audio = new Audio();
		RemoteControl tv = new Tv();
		
		audio.turnOn();
		audio.setVolume(5);
		audio.turnOff();

		tv.turnOn();
		tv.setVolume(8);
		tv.turnOff();
		tv.setMute(true);
		
		RemoteControl.changeBattery();
		
	}

}
