package ch02.unit4;

import java.util.Scanner;

/*
 - 한문자를 입력 받아 입력받은 문자와 문자의 ASCII 코드를 출력하는 프로그램 작성
 - 실행 예
   한문자 ? A
   A -> 65
 */
public class Quiz01_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("한문자 ? ");
		c = sc.next().charAt(0);
		
		int n = c;
		System.out.println(c + " -> " + n);
		
		// System.out.printf("%c -> %d\n", c, c); // 런타임오류. char형은 %d로 출력 불가
		// System.out.printf("%c -> %d\n", c, (int)c);
		
		sc.close();
	}

}
