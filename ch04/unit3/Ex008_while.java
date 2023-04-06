package ch04.unit3;

import java.util.Scanner;

public class Ex008_while {

	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수의 구구단 출력
		Scanner sc = new Scanner(System.in);
		int num;
		int n;
		
		System.out.print("정수 ? ");
		num = sc.nextInt();
		
		n = 0;
		while(n < 9) {
			n++;
			System.out.printf("%d * %d = %d\n", num, n, num*n);
		}
		
		sc.close();
	}

}
