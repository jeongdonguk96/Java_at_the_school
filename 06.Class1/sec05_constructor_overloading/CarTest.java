package sec05_constructor_overloading;

class Car{
	
	String company = "현대자동차";
	String model;
	String color;
	String maxSpeed;

	//생성자 오버로딩 (기본생성자 1, 매개변수생성자 3)
	Car(){
//		this.model = "sm";
//		this.color = "회색";
//		this.maxSpeed = "200km/h";
		this("sm", "회색", "200km/h"); // 기본생성자에도 this()를 이용해 아예 값을 각인시켜 줄 수 있다.
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, String maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 생성자를 이용한 인스턴스 복사
	Car(Car myCar4){
		this.model = myCar4.model;
		this.color = myCar4.color;
		this.maxSpeed = myCar4.maxSpeed;
	}

}


public class CarTest {

	public static void main(String[] args) {
		
		Car myCar0 = new Car();
		Car myCar1 = new Car("소나타");
		Car myCar2 = new Car("아반떼", "흰색");
		Car myCar3 = new Car("그랜져", "검정색", "250km/h");
		Car myCar4 = new Car(myCar3);
		
		System.out.printf("****myCar0****\n회사 = %s\n모델 = %s\n색상 = %s\n최고속력 = %s\n\n",
				myCar0.company, myCar0.model, myCar0.color, myCar0.maxSpeed);
		System.out.printf("****myCar1****\n회사 = %s\n모델 = %s\n색상 = %s\n최고속력 = %s\n\n",
				myCar1.company, myCar1.model, myCar1.color, myCar1.maxSpeed);
		System.out.printf("****myCar2****\n회사 = %s\n모델 = %s\n색상 = %s\n최고속력 = %s\n\n",
				myCar2.company, myCar2.model, myCar2.color, myCar2.maxSpeed);
		System.out.printf("****myCar3****\n회사 = %s\n모델 = %s\n색상 = %s\n최고속력 = %s\n\n",
				myCar3.company, myCar3.model, myCar3.color, myCar3.maxSpeed);
		System.out.printf("****myCar4****\n회사 = %s\n모델 = %s\n색상 = %s\n최고속력 = %s\n",
				myCar4.company, myCar4.model, myCar4.color, myCar4.maxSpeed);
		
	}
}
