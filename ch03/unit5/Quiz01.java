package ch03.unit5;

import java.util.Scanner;

/*
 - 한문자를 입력 받아 입력 받은 문자가 소문자이면 대문자로, 대문자이면 소문자로 변환하는 프로그램 작성
   단, 입력 받은 문자가 영문자가 아니면 입력 받은 문자를 그대로 출력
   'A' : 65, 'a' : 97, 형변환이 필요
   
   문자 ? A
   A -> a

   문자 ? 3
   3 -> 3
 */
public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a, b;
		
		System.out.print("문자 ? ");
		a = sc.next().charAt(0);
		
		b = a >= 'A' && a <= 'Z' ? (char)(a + 32) : (a >= 'a' && a <='z' ? (char)(a - 32) : a); 		
		
		System.out.println(a + " -> " + b);
		
		sc.close();
	}

}
