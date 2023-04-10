package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// for문 응용문제 1]

		Scanner sc = new Scanner(System.in);
		int n, diff, result=0, min=0;

		System.out.print("5개의 숫자를 입력하세요...");
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();
			diff = n>7? n-7 : 7-n; //7과의 차이
			
			if( i ==0 || diff < min) {
				min = diff;
				result = n;
			}
			
			
		}
		System.out.println(result);
		

		sc.close();

	}

}
