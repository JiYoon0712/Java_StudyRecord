package ch04.unit2;

import java.util.Scanner;

public class Ex02_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		// 1~3 사이의 수를 입력 받아 입력 받은 수만큼 * 출력
		
		System.out.print("수 ? ");
		n = sc.nextInt();
		
		// break; : switch 문을 빠져 나감
		switch(n) {
		case 3: System.out.print("*");
				System.out.print("&#");
				break;
		case 2: System.out.print("*");
				System.out.print("&");
				break;
		case 1: System.out.print("*");
				break; // 마지막의 break는 생략 가능
		}
		System.out.println();
		
		sc.close();

	}

}
