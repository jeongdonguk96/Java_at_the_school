package sec07_polymorphism;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = price/10;
	}
}

class Tv extends Product {
	Tv(){
		super(1000);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(){
		super(500);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio(){
		super(1500);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	
	public void buy(Product p) {
		if(money<p.price) {
			System.out.println("금액이 부족합니다.");
			return; // 더 이상 매서드를 실행하지 않고 빠져나감.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.printf("%s을(를) 구매했습니다.\n", p.toString());
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
//		Product p1 = new Tv();  // int i = 10; 
//		b.buy(p1);              // System.out.println(i); 
		b.buy(new Tv());        // 위의 2줄을 1줄로 줄인 것.
		System.out.printf("남은 금액은 %d원입니다.\n", b.money);		
		System.out.printf("적립된 포인트는 %dp입니다.\n", b.bonusPoint);
		System.out.println("");

		b.buy(new Computer());
		System.out.printf("남은 금액은 %d원입니다.\n", b.money);		
		System.out.printf("적립된 포인트는 %dp입니다.\n", b.bonusPoint);
		System.out.println("");
		
	}

}
