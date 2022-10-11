package sec01;

public class NullPointEx {

	public static void main(String[] args) {
		
		String refVar1 = ("abc");
		String refVar2 = "";
		int[] a = {1, 3, 5,7, 9};
		String str = "가나다라마바사";
		String refVar100 = null;

		System.out.println("refVal1의 길이 : " + refVar1.length());
		System.out.println("refVal2의 길이 : " + refVar2.length());
		System.out.println("int배열 a의 길이 : " + a.length);
		System.out.println(str.charAt(0));
		System.out.println(str.toCharArray());
		System.out.println("refVal100의 길이 : " + refVar100.length());
		
		

	}
}