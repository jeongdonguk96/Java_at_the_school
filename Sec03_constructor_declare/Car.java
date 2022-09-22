package Sec03_constructor_declare;

public class Car {

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
