package exercise;

public class Ex1 {

	public static void main(String[] args) {
		
		int x = 13;
		
		if(x>10 && x<20) System.out.println("x는 10보다 크고 20보다 작습니다.");	
		
		char ch = 'a';
		if(ch!=' ' || ch!='\t') System.out.println("ch는 공백이 아닙니다."); 
		if(!(ch==' ' || ch=='\t')) System.out.println("ch는 공백이 아닙니다."); 

		String str = "Yes";
		if(str.equals("Yes")) System.out.println("Yes는 문자열입니다.");
		
	}
}
