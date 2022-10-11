package Exercise;

public class Ex3 {

	public static void main(String[] args) {
		
		int[] a = new int[10];

		System.out.print("{");
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100)+1;
			if(i!=(a.length-1)) {
				System.out.printf("%d, ", a[i]);
			} else {
				System.out.printf("%d", a[i]);
			}
		}
		System.out.println("}");
		
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {max=a[i];}
		}
		for(int i=1; i<a.length; i++) {
			if(a[i]<min) {min=a[i];}
		}
		// System.out.println("가장 큰 수는 = " + max);
		System.out.printf("가장 큰 수는 = %d\n", max);
		// System.out.println("가장 작은 수는 = " + min);
		System.out.printf("가장 작은 수는 = %d\n", min);
		
	}
}
