package ch04.unit1;

import java.util.Scanner;

public class Ex004_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		String s;

		System.out.println("정수 ?");
		a = sc.nextInt();

		

		if (a % 2 == 1) { //조건이 참인 경우
			s = "홀수";
		} else { //조건이 거짓인 경우
			s= "짝수";
		}
		System.out.println(a + " ->" + s); 

		sc.close();

	}

}
