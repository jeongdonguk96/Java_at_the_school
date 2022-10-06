package sec08_method_overloading;

class Display {
	
	public void dispInt(int num) {
		System.out.println(num);
	}

	public void dispChar(char c) {
		System.out.println(c);
	}
	
	public void dispStr(String s) {
		System.out.println(s);
	}
	
}

public class DisplayInfo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		d.dispInt(5);
		d.dispChar('a');
		d.dispStr("abc");

	}

}
