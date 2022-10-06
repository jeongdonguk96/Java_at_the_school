package sec04_hashmap;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.*;

public class HashMapTest {
	public static void main(String[] args) throws IOException {
		
		Map<String, Double> men = new HashMap<>();
		
		men.put("김우빈", 188.0);
		men.put("임시완", 166.0);
		men.put("김수현", 177.0);
		men.put("권지용", 168.5);
		men.put("에릭", 177.5);
		men.put("강호동", null);
		
		System.out.println("김수현의 키 = " + men.get("김수현"));
		System.out.println();
		
		Set<String> keySet = men.keySet();
		for(String arr : keySet) {
			System.out.println("Key=" + arr + ", Value=" + men.get(arr));
		}
		System.out.println();
		
		System.out.println("Map men의 길이는 = " + men.size());
		System.out.println("김수현이라는 Key가 존재하나요? " + men.containsKey("김수현"));
		System.out.println("키가 177.0인 사람이 존재하나요? " + men.containsValue(177.0));
		System.out.println("men이라는 Map이 비어있나요? " + men.isEmpty());
		men.remove("강호동");
		System.out.println();
		
	}

}
