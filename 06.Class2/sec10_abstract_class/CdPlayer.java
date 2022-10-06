package sec10_abstract_class;

public class CdPlayer extends Player {

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.println("CD 플레이어가 " + pos + "지점을 재생합니다.");
	}

	@Override
	void stop() {
		System.out.println("CD 플레이어가 재생을 중지합니다.");
	}

	void nextTrack() {
		System.out.println("CD 플레이어가 다음 곡을 재생합니다.");
	}
	
	void prevTrack() {
		System.out.println("CD 플레이어가 이전 곡을 재생합니다.");
	}
	
}
