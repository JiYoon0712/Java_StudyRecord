package ch04.unit5;

import java.util.Scanner;

public class Quiz01_continue3 {

	public static void main(String[] args) {
		// 5개의 홀수를 입력 받아 입력 받은 홀수의 합 구하기
		// 단, 입력 받은 수가 짝수이거나 0이하면 다시 입력 받는다
		// while문 이용!!!

		Scanner sc = new Scanner(System.in);
		int s, n;

		s = 0;
		
		for(int i =1; i<=5; i++) {
			do {
				n = sc.nextInt();
			}while(n % 2 == 0 || n <= 0);
			
			s+=n;
		}

		System.out.println("결과 : " + s);

		sc.close();

	}

}
