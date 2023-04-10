package ch04.unit5;

import java.util.Scanner;

public class Quiz01_continue2 {

	public static void main(String[] args) {
		// 5개의 홀수를 입력 받아 입력 받은 홀수의 합 구하기
		// 단, 입력 받은 수가 짝수이거나 0이하면 다시 입력 받는다
		// while문 이용!!!

		Scanner sc = new Scanner(System.in);
		int s, n, i;

		s = 0;
		i = 0;

		System.out.println("5개의 홀수 입력,,,"); // 1 2 3 4 5
		while (i < 5) {
			n = sc.nextInt();
			if (n % 2 == 0 || n <= 0) {
				continue;
			}
			i++;
			s += n;
		}
		System.out.println("결과 : " + s);

		sc.close();

	}

}
