package ch04.unit2;

import java.util.Scanner;

public class Ex04_Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		System.out.println("정수 ?");
		n = sc.nextInt();
		
		// default : case 조건을 만족하는 것이 없는 경우 실행. 위치는 상관없음
		switch(n) {
		case 3 : System.out.println("***"); break;
		case 2 : System.out.println("**"); break;
		case 1 : System.out.println("**"); break;
		default : System.out.println("입력 에러 !!!"); break;
		}
		
		sc.close();
		
		


	}

}
