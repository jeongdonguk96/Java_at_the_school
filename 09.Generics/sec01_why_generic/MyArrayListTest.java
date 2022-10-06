package sec01_why_generic;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();
		
		// 배열에 문자열을 2개 추가.
		strList.add("abc"); //[0]
		strList.add("beta"); //[1]
		dispList(strList);
					// 래퍼클래스 사용(기본형이 아니라 참조형으로 변환해줘야하기 때문)
		strList.add(Integer.valueOf(123));
		dispList(strList);
	}

	// 리스트의 내용을 출력.
	public static void dispList(MyArrayList list) {
		for(int i=0; i<list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
	
}
