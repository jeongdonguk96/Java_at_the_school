package sec07_polymorphism2;

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
	Product[] items = new Product[10]; // 구매한 제품을 저장할 배열.
	int index = 0;                         // 배열에 사용할 상품저장 위치.
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("금액이 부족합니다.");
			return; // 더 이상 매서드를 실행하지 않고 빠져나감.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		items[index++] = p; // 구매한 제품을 저장하고 인덱스를 1 증가시킴.
		System.out.printf("%s을(를) 구매했습니다.\n", p.toString());
	}
	
	void summary() {
		int total = 0; // 물품을 구매한 합계금액 저장
		System.out.println("<<<구매한 물품의 목록>>>");
		for(int i=0; i<index; i++) {
			total += items[i].price;
			System.out.print(items[i] + ", ");
		}
		System.out.printf("구매한 물품의 총 금액은 %d원입니다.\n", total);
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		// Product p1 = new Tv();  // int i = 10; 
		// b.buy(p1);              // System.out.println(i); 
		b.buy(new Tv());        // 위의 2줄을 1줄로 줄인 것.
		System.out.printf("남은 금액은 %d원입니다.\n", b.money);		
		System.out.printf("적립된 포인트는 %dp입니다.\n", b.bonusPoint);
		System.out.println("");

		b.buy(new Computer());
		System.out.printf("남은 금액은 %d원입니다.\n", b.money);		
		System.out.printf("적립된 포인트는 %dp입니다.\n", b.bonusPoint);
		System.out.println("");
		
		b.buy(new Audio());
		System.out.printf("남은 금액은 %d원입니다.\n", b.money);		
		System.out.printf("적립된 포인트는 %dp입니다.\n", b.bonusPoint);
		System.out.println("");
		
		b.summary();
		
	}

}
