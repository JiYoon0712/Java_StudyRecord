package ch04.unit3.s2;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// for 문 기본문제 2]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단 ? ");
		int dan;
		do {
		dan = sc. nextInt();
		}while(dan <1 || dan >9);
		
		for(int n=1; n<=9; n++) {
			System.out.printf("%d * %d = %d\n,dan,n,dan*n");
		}
		System.out.println();
		
		
		
		sc.close();
		

	}

}
