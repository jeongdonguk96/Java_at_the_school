package sec01_why_generic;

// 여러가지 변수타입을 저장하는 데이터 구조체
public class MyGenericArrayList<E> {
	
	private Object[] elements; // 모든 타입의 참조변수 저장 가능.(Object가 최고 조상) 
	private int size;          // 저장된 항목의 수.
	public MyGenericArrayList() {
		elements = new Object[10]; // 초기에 10개의 데이터 저장.
		size = 0;
	}
	
	// 데이터를 저장하는 매서드
	public void add(E e) {
		// 배열의 항목 수보다 작아야 저장 가능.
		if(size<elements.length) {
			elements[size] = e;
			++size;
		} else {
			// 배열의 항목 수보다 크면 저장 불가능.
		}
	}
	
	// 특정 위치의 항목을 반환하는 매서드.
	public E get(int index) {
		if(index>=size) {
			System.out.println("인덱스 지정이 잘못되었습니다.");
			return null;
		}
		return (E)elements[index];
	}

	// 현재 저장된 항목 수를 반환.
	public int size() {
		return size;
	}
	
}
