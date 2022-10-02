package pack01;

class Animal {
	String noise;
	public Animal(String noise) {
		this.noise = noise;
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
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new BigDog();
		
		System.out.println(a1.noise);
		System.out.println(a2.noise);
		System.out.println(a3.noise);
				
	}

}
