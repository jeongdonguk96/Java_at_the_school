package sec05_final_method;

class Car {

	int speed;
	
	public void speedUp() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("Stop!");
		speed = 0;
	}
}

	
class SportsCar extends Car{
	
	public void speedUp() {
		speed +=10;
	}
	
	// 부모클래스인 Car에서 stop매서드는 final처리 됐기 때문에 오버라이딩 불가.
//	public final void stop() { 
//		System.out.println("Stop!");
//		speed = 0;
//	}
	
}
	
	
public class CarTest {
		
	public static void main(String[] args) {
	
		
		
	}
	
}

