package sec04_wildcard;

public class MyMath {

	public static void main(String[] args) {
		
		Integer a = 23;
		Integer b = 67;
		System.out.println(add(a, b));
		
		float x = 12.5f;
		float y = 23.4f;
		System.out.println(add(x, y));

		// <T extends Number>로 인해 Number의 자손 참조변수만 올 수 있음
		// System.out.println(add("dd", "dda"));
		
	}
	
	public static<T extends Number> double add(T first, T second) {
		return first.doubleValue()+second.doubleValue();
	}
	

}
