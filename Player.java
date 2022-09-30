package sec10_abstract_class;

// 음악을 재생하는 플레이어 클래스
public abstract class Player {
	int currentPos; // 마지막 재생 지점
	boolean pause; // 일시정지 상태 저장
	
	Player(){
		pause = false;
		currentPos = 0;
	}
	// play의 구체적인 동작을 구현할 수 없음.
	abstract void play(int pos); // 특정 지점에서 재생
	abstract void stop();
	
	// 추상클래스에도 일반매서드 구현 가능
	void play() {
		play(currentPos); // 마지막 재생시점에서 트는 매서드
		                  // 일반매서드 내에서 추상매서드 호출 가능
	}
	
	// 일시정지 기능의 매서드
	void pause() {
		if(pause) {             // 현재 정지상태
			pause = false;
			play(currentPos);
		} else {              // 현재 재생상태
			pause = true;
			stop();
		}
	
	}
}
