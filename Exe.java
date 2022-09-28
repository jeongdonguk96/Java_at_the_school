
public class Exe {

	public static void main(String[] args) {
		
		// split을 통해 원하는 문자를 기준으로 문자열을 배열화 .split("");
		// join을 통해 배열을 하나의 문자열로 만듬 String.join("", arr);
		String a = "aaaaoffffoggggohhhoggg";
		a.split("o");
		System.out.println(a);
		String[] arr = a.split("o");
		String str2 = String.join(", ", arr);
		System.out.println(str2);
		
		String animal = "dog, cat, bear";
		String[] arra = animal.split(", ");
		String str = String.join("-", arra);
		System.out.println(str);
		
		// 정수형을 문자열로
		int i = 100;
		String str1 = String.valueOf(i);
		System.out.println(str1);
		
		// 문자열을 정수형으로
		int j = Integer.parseInt("200");
		int j2 = Integer.valueOf("200");
		System.out.println(j2);

	}

}
