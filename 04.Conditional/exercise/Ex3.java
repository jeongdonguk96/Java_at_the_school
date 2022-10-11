package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print("정수를 입력해 주세요. : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println((n==1) ? "One" : (n==2) ? "Two" : (n==3) ? "Three" : (n==4) ? "Four" : (n==5) ? "Five" : (n==6) ? "Six" : (n==7) ? "Seven" : (n==8) ? "Eight" : (n==9) ? "Nine" : "잘못 입력된 값입니다.");
		System.out.println("프로그램을 종료합니다.");

	}
}
