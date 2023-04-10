package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// for 문 기본문제 3]

		Scanner sc = new Scanner(System.in);


		int n, even, odd;

		even = odd = 0;
		System.out.print("10개 수를 입력하세요..");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			if (n % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("짝수의 개수:" + even);
		System.out.println("홀수의 개수:" + odd);
		sc.close();

}

}
