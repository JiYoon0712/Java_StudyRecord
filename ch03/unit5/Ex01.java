package ch03.unit5;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 절대 값 구하기
		int a, b;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		b = a > 0 ? a : -a;
		System.out.println(a +"의 절대값 : " + b);
		
		sc.close();
	}

}
