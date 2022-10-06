package Sec03_constructor_declare;

class Car {
	
	String company = "현대자동차";
	String model = "소나타";
	String color = "흰색";
	String maxSpeed = "250km/h";
	String speed;

	Car(){}

	Car(String c, String m){
		color = c;
		model = m;
	}

}


class Car_test {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.printf("제조회사 = %s\n", myCar.company);
		System.out.printf("모델    = %s\n", myCar.model);
		System.out.printf("색상    = %s\n", myCar.color);
		System.out.printf("최고속력 = %s\n", myCar.maxSpeed);
		System.out.printf("현재속력 = %s\n\n", myCar.speed);
		
		Car myCar2 = new Car("검정색", "그랜져");
		
		System.out.printf("제조회사 = %s\n", myCar2.company);
		System.out.printf("모델    = %s\n", myCar2.model);
		System.out.printf("색상    = %s\n", myCar2.color);
		System.out.printf("최고속력 = %s\n", myCar2.maxSpeed);
		System.out.printf("현재속력 = %s\n\n", myCar2.speed);

	}
}
