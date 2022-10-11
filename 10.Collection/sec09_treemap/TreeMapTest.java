package sec09_treemap;

import java.util.*;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<>();
		
		map.put("baby", "아기");
		map.put("love", "사랑");
		map.put("apple", "사과");
		map.put("butterfly", "나비");
		map.put("flower", "꽃");
		map.put("music", "음악");
		
		Scanner scan = new Scanner(System.in);
		
//		String word = "";                          // 선생님 방법
//		
//		do {
//			System.out.print("찾을 단어를 입력하세요:");
//			word = scan.nextLine();
//			
//			if(map.containsKey(word)) {
//				System.out.printf("%s : %s\n", word, map.get(word));
//			} else {
//				System.out.println("찾는 단어가 없습니다.");
//			}
//		} while(!word.equals("0"));
//		System.out.println("프로그램 종료");
		
		
		for(int i=0; i<map.size(); i++) {
			System.out.print("찾을 단어를 입력하세요: ");
			String item = scan.nextLine();
			
			if(item.equals("0")) {			
				System.out.println("프로그램을 비정상 종료합니다.");
				break;
			} else if(map.containsKey(item)) {
				System.out.printf("%s : %s\n", item, map.get(item));	
			} else {
				System.out.println("잘못된 단어를 입력했습니다.");
			}
		}
	}

}
