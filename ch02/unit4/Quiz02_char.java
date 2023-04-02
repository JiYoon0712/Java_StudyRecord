package ch02.unit4;

import java.util.Scanner;

/*
 - 정수의 문자 코드를 입력 받아 입력 받은 코드에 대한 문자를 출력하는 프로그램 작성
 - 실행 예
   문자코드 ? 65
   65 -> A
 */
public class Quiz02_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자코드 ? ");
		int n = sc.nextInt();
		
		System.out.printf("%d -> %c\n", n, n);
		
		sc.close();
	}

}
