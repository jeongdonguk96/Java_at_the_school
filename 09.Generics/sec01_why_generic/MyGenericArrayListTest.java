package sec01_why_generic;

public class MyGenericArrayListTest {

	public static void main(String[] args) {
		MyGenericArrayList<String> strList = new MyGenericArrayList<String>();
		
		// 배열에 문자열을 2개 추가.
		strList.add("abc"); //[0]
		strList.add("beta"); //[1]
		dispList(strList);
					// 래퍼클래스 사용(기본형이 아니라 참조형으로 변환해줘야하기 때문)
		/*strList.add(Integer.valueOf(123));*/ // 컴파일 타임에 잘못된 내용을 알려줌.
		dispList(strList);
	}

	// 리스트의 내용을 출력.
	public static void dispList(MyGenericArrayList list) {
		for(int i=0; i<list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
	
}
