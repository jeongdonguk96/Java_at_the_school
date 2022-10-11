package Exercise;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		String[] name = {"이순신", "유관순", "장보고", "안창호", "홍길동"};
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("name[%d] = %s\n", i, name[i]);
			if(name[i].equals("장보고")) 
				break;
			}
		System.out.printf("%s!!\n%s를 찾았습니다.\nname[] 배열에서 장보고는 3번째에 위치합니다.\n프로그램을 종료합니다.", "장보고", "장보고");
		
	}
}

//if (i.equals(name[4])) {
//System.out.println("프로그램을 종료합니다.");
//}
//
//while(true) {
//a = (int)(Math.random()*6)+1; // 주사위 나오는 값
//System.out.println("주사위를 굴려보세요 : " + a);
//if(a==6) 
//	break;
//}
//System.out.println("프로그램 종료!");

//int[][] a = {
//		{ 100, 50, 10},
//		{ 1, 5, 9},
//		{ 33, 55, 99}
//};
//System.out.println("\n" + a[2][2]);

//int[] a = {0,1,2,3,4,5};
//int[][] b = {
//		{0,1},
//		{2,3},
//		{4,5}
//};
//System.out.println("\n" + Arrays.toString(a));
//System.out.println(Arrays.deepToString(b));
