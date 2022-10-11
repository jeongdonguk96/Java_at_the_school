package sec02;

public class NestedWhileEx1 {

	public static void main(String[] args) {
		
		int i = 2;
		while(i<=9) {
			System.out.println("***" + i + "단 ***");
			int j=1;
			while(j<=9) {
				System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			System.out.print('\n');
			i++;
		}
		
	}
}