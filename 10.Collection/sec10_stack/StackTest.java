package sec10_stack;

import java.util.*;

public class StackTest { // 원하는 정수의 이진수값을 구하는 방법

	public static void main(String[] args) {
		Stack<Integer> numBox = new Stack<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이진수로 변환할 숫자를 입력하세요: ");
		int num = scan.nextInt();
		int tmp = num;

		while(num>0) {
			numBox.push(num%2);	
			num /= 2;
		}
	
		System.out.printf("입력하신 숫자 %d은(는) 이진수로 ", tmp);
		while(!numBox.empty()) {
			System.out.print(numBox.pop());
		}
		System.out.printf("입니다.\n");
		
	}

}
