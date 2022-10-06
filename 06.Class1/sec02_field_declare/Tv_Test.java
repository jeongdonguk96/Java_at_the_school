package sec02_field_declare;

public class Tv_Test {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		
		tv1.power = true;
		tv1.channel = 6;
		tv1.color = "black";
		
		System.out.printf("현재 채널은 %d번입니다.", tv1.channel);

	}
}