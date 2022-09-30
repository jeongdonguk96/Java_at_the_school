package sec10_abstract_class;

public class CdPlayerTest {

	public static void main(String[] args) {
		
		CdPlayer player = new CdPlayer();
		
		player.play(0);
		player.stop();
		player.nextTrack();
		player.prevTrack();
		player.play();
		player.pause();

	}

}
