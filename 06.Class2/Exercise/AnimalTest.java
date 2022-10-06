package Exercise;

class Animal {
	String noise;
	
	Animal(String noise){
		this.noise = noise;
	}

	public void noise(String string) {		
		System.out.println(string);
	}
}
	
class Dog extends Animal {
	Dog(){
		super("멍멍");
	}
}

class Cat extends Animal {
	Cat(){
		super("야옹");
	}
}

class BigDog extends Animal {
	BigDog(){
		super("왕왕");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Dog();
		animal[1] = new Cat();
		animal[2] = new BigDog();
		
		animal[0].noise("멍멍");
		animal[1].noise("야옹");
		animal[2].noise("왕왕");
		
	}
}
