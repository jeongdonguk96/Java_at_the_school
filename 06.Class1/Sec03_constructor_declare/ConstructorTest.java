package Sec03_constructor_declare;

class Data1{
	int value = 10;
}

class Data2{
	int value;
	Data2(){}
	
	Data2(int x){
		value = x;
	}
}

class ConstructorTest {
	
	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); // 오류발생 ( Data2에는 기본생성자가 없음 / 매개변수 생성자가 있으면 자동으로 생성X)
		Data2 d3 = new Data2(555); // 매개변수 생성자 Data2를 이용, 생성자의(int)에 원하는 값을 넣으면 그대로 출력)
		
		System.out.println(d1.value);
		System.out.println(d2.value);
		System.out.println(d3.value);

	}
}
