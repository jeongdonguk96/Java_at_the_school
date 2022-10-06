package sec03_generic_method;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		Integer[] intArr = {40, 55, 23, 67, 89};
		Character[] charArr = {'J', 'A', 'V', 'A'};
		
		printArray(intArr);
		printArray(charArr);
			
	}
	
	// public void printintarr(Integer[] intArr) {	
	// 	}
	// public void printchaarrr(Character[] charArr) {
	// }
	// 위의 두 매서드를 제네릭을 이용해 아래 하나의 매서드로 줄임.
	
	public static<E> void printArray(E[] arr) {
		for(E item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
