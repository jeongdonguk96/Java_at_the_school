package sec08_method_overloading;

class Display2{
	
	public void disp(int num) {
		System.out.println(num);
	}

	public void disp(char c) {
		System.out.println(c);
	}
	
	public void disp(String s) {
		System.out.println(s);
	}
}

public class OverloadTest {

	public static void main(String[] args) {
		Display2 d = new Display2();
		d.disp("dsdsaddas");
		d.disp(11131312);
		d.disp('a');

	}

}
