package sec04_hashmap;

import java.util.*;
import java.util.Map.*;

public class HashMapBasic {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		// put매서드를 이용해 데이터를 추가
		map.put("철수", "90");
		map.put("철수", "88");
		map.put("영희", "79");
		map.put("길동", "92");
		map.put("호동", null);
		map.put(null, "90");
		
		// get매서드를 이용해 데이터를 불러오기. key를 입력하면 value를 반환
		String value = map.get("길동");
		System.out.println("Key=길동, Value=" + value);
		
		// 추가하지 않은 key를 불러올 경우
		value = map.get("순신");
		System.out.println("Key=이순신, Value=" + value);
		
		// 추가하지 않은 key를 불러올 때 catch처럼 지정한 데이터를 출력하는 방법
		value = map.getOrDefault("이순신", "등록되지 않은 사람입니다.");
		System.out.println("Key=이순신은 " + value);
		
		// key, value데이터의 존재 여부 확인
		System.out.println("영희라는 key가 존재합니까? " + map.containsKey("영희"));
		System.out.println("92라는 value가 존재합니까? " + map.containsValue("92"));
		
		// Map에 저장된 데이터를 엔트리의 형태로 변수에 저장해서 반환
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println("entrySet = " + entrySet);
		
		// Map에 저장된 모든 데이터 조회
		Set<String> keySet = map.keySet();
		for(String arr : keySet) {
			System.out.println("Key=" + arr + ", Value=" + map.get(arr));
		}
		
		// size매서드를 이용해 길이 확인
		System.out.println("map의 size = " + map.size());
		
		// remove매서드를 이용해 데이터 삭제
		map.remove("철수");
		System.out.println("철수 삭제 후 = " + map);
		
		// key를 null로 지정했을 경우
		value = map.get(null);
		System.out.println("Key=null, Value=" + value);
		
	}

}
