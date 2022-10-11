package sec01;

public class CommandLineArg {

	public static void main(String[] args) {
		
		System.out.println("매개변수의 갯수 = " + args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}

	}
}