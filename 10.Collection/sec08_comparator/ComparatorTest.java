package sec08_comparator;

import java.util.*;

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<Product> pSet = new TreeSet<>(new DescendingComparator());
		
		pSet.add(new Product("Tv", 10000));
		pSet.add(new Product("Refrige", 9000));
		pSet.add(new Product("Washer", 8000));
		pSet.add(new Product("Audio", 12000));
		
		for(Product p : pSet) {
			System.out.println(p);
		}
	}

}
