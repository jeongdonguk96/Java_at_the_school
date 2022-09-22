package sec02_field_declare;

public class Car_test {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.speed = "60km/h";
		
		System.out.printf("제조회사 = %s\n", myCar.company);
		System.out.printf("모델    = %s\n", myCar.model);
		System.out.printf("색상    = %s\n", myCar.color);
		System.out.printf("최고속력 = %s\n", myCar.maxSpeed);
		System.out.printf("현재속력 = %s\n", myCar.speed);
	
	}	
}
