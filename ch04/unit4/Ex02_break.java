package ch04.unit4;

import java.util.Scanner;

public class Ex02_break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실수를 입력 받아 입력 받은 실수의 합을 구한다. 입력 받은 수가 0이하면 합을 출력하고 종료

		double num, sum;

		sum = 0;

		System.out.print("실수 입력(0:종료) ?");
		while (true) {

			num = sc.nextDouble();
			if (num <= 0) {
				break;
			}
			sum += num;
		}
		System.out.println("합 : " + sum);

		sc.close();
	}

}
