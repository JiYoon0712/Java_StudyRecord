package ch04.unit1;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		double b;

		System.out.println("점수 ?");
		a = sc.nextInt();

		if (a >= 0 && a <= 100) {
			if (a >= 95) {
				b = 4.5;
			} else if (a >= 90) {
				b = 4.0;
			} else if (a >= 85) {
				b = 3.5;
			} else if (a >= 80) {
				b = 3.0;
			} else if (a >= 75) {
				b = 2.5;
			} else if (a >= 70) {
				b = 2.0;
			} else if (a >= 65) {
				b = 1.5;
			} else if (a >= 60) {
				b = 1.0;
			} else
				b = 0;

			System.out.printf("%d : %.1f\n", a, b);
		} else
			System.out.println("점수 입력 오류 입니다.");

		sc.close();

	}

}
