package sec08_comparator;

import java.util.*;

public class DescendingComparator implements Comparator<Product> {
											// 비교기준을 기본정렬이 아니라 내가 기준을 잡고 싶을 때 사용
//	@Override
//	public int compare(Product o1, Product o2) { // Product의 price를 기준으로 내림차순 정렬
//		if(o1.price < o2.price) {
//			return 1;
//		} else if(o1.price == o2.price) {
//			return 0;
//		} else {
//			return -1;
//		}
//	}
	
	@Override
	public int compare(Product o1, Product o2) {  // Product의 name을 기준으로 내림차순 정렬
		return o2.name.compareTo(o1.name);
	}
}
