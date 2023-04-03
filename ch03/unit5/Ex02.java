package ch03.unit5;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 홀짝 확인
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		// s = a % 2 == 0 ? "짝수" : "홀수";
/*
		5  => 0101 & 0001 = 1  
		13 => 1101 & 0001 = 1
		12 => 1100 & 0001 = 0
		6  => 0110 & 0001 = 0
 */
		s = (a & 1) == 1 ? "홀수" : "짝수";
		
		System.out.println(a +" : " + s);
		
		sc.close();
	}

}
