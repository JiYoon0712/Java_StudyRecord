package ch02.unit3;

import java.util.Scanner;

/*
  - 두 정수를 입력 받아 사칙연산하는 프로그램
    두정수 ? 10 5
    10 + 5 = 15
    10 - 5 = 5
    10 * 5 = 50
    10 / 5 = 2
 */
public class Ex13_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		
		sc.close();
	}
}
