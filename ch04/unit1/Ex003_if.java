package ch04.unit1;

import java.util.Scanner;

public class Ex003_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		String s;

		System.out.println("정수 ?");
		a = sc.nextInt();

		// if(a % 2 ==1) {
		// s = "홀수";
		// }
		// System.out.println(a + " ->" + s); // 컴 오류 . s가 초기화 되어있지 않음

		// s = ""; //초기화
		s = "홀수가 아님";

		if (a % 2 == 1) {
			s = "홀수";
		}
		System.out.println(a + " ->" + s);

		sc.close();

	}

}
