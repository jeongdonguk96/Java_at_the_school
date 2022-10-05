package sec03_generic_method;

public class SwapTest {
	
	// call by reference (매서드 호출시 주소값으로 전달) 
	public static<T> void swap(T[] arr) {
		T tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
	}
	
	public static<E> void printArray(E[] arr) {
		for(E item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArr = {10, 20};
		printArray(intArr);
		swap(intArr);
		printArray(intArr);
		
		String[] strArr = {"hi", "there"};
		printArray(strArr);
		swap(strArr);
		printArray(strArr);
		
	}

}
	
	
	
	
	

