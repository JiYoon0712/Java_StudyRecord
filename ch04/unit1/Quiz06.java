package ch04.unit1;

import java.util.Scanner;

/*
	두수 및 연산자를 입력 받아 사칙 연산을 하는 프로그램
*/
public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char oper;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		oper = sc.next().charAt(0);
		
		/*
		if(oper == '+') {
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		} else if(oper == '-') {
			System.out.printf("%d - %d = %d\n", a, b, a-b);
		} else if(oper == '*') {
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		} else if(oper == '/') {
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		} else {
			System.out.println("연산자 입력 오류 입니다.");
		}
		*/
		
		if(oper == '+' || oper == '-' || oper == '*' || oper == '/') {
			int result;
			
			if(oper == '+') {
				result = a + b;
			} else if(oper == '-') { 
				result = a - b;
			} else if(oper == '*') { 
				result = a * b;
			} else { 
				result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, oper, b, result);
			
		} else {
			System.out.println("연산자 입력 오류 입니다.");
		}
		
		sc.close();
	}
}