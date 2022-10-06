package sec02_interface_extends;

class Unit {
	int currentHP; // 현재 체력
	int x;
	int y;
}

// 움직이는 기능
interface Movable {
	void move(int x, int y);
}

// 공격하는 기능
interface Attackable {
	void attack(Unit u);
}

// 두 인터페이스를 상속한 인터페이스 (인터페이스는 다중 상속 가능)
interface Fightable extends Movable, Attackable{
}

// 상속과 구현을 동시에
class Tank extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.printf("탱크가 (%d, %d)위치로 이동합니다.\n", x, y);
	}

	@Override
	public void attack(Unit u) {
		System.out.printf("탱크가 포를 이용해 %s을 공격합니다.\n", u);
	}
	
}


public class FightTest {

	public static void main(String[] args) {
		
		Tank tank = new Tank();
		tank.move(100, 150);
		tank.attack(tank);

	}

}
