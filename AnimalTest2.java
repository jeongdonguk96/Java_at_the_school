package pack01;

class Animal1 {
	String noise;
	void makeNoise(String noise) {
		System.out.println(noise);
	}
}

class Dog1 extends Animal1 {
	
}

class Cat1 extends Animal1 {
	
}
	

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal1 dog = new Dog1();
		Animal1 cat = new Cat1();
		
		dog.makeNoise("멍멍");
		cat.makeNoise("야옹");
	}

}
