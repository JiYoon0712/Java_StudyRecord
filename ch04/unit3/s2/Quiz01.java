package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// for 문 기본문제 1]
		
		Scanner sc = new Scanner(System.in);
		int a ;
		
		do {
		System.out.println("수 ?");
		a = sc. nextInt();
		}while (a <1 || a > 1000);
		
		int c = 0;
		for(int b =1; b<=a; b++) {
			c += b;
		}
		System.out.println("1~"+a+ "까지 합: " + c);
		sc.close();
		

	}

}
