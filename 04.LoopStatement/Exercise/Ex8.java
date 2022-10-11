package Exercise;


	public class Ex8 {
		public static void main(String[] args) { 
		
			int a = 0;

			while(true) {
				a = (int)(Math.random()*6)+1; // 주사위 나오는 값
				System.out.println("주사위를 굴려보세요 : " + a);
				if(a==6) 
					break;
			}
			System.out.println("프로그램 종료!");
		
	}
}