package sec04;

public class BreakEx1 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(true) {

			if(sum>100)
				break;
			
			i++;
			sum += i;
			
		}
		System.out.printf("i=%d, sum=%d\n", i, sum);
		
	}
}