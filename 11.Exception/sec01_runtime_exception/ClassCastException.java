package sec01_runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}


public class ClassCastException {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat); // cat과 dog는 어떠한 관계도 없어서 형변환되지 않음.
	}
	
	public static void changeDog(Animal animal) {
		Dog dog =  (Dog)animal;
	}

}
