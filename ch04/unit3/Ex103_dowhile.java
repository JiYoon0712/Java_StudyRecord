package ch04.unit3;

import java.util.Scanner;

public class Ex103_dowhile {

	public static void main(String[] args) {
		// 1~9사이의 수를 입력 받아 구구단 출력.
		// 단, 입력받은 수가 1~9 이외의 수이면 다시 입력 받는다.
		Scanner sc = new Scanner(System.in);
		
		int dan;
		do {
			System.out.print("단[1~9] ?");
		dan = sc.nextInt();
		}while(dan <1 || dan >9);
		
		int n = 0;
		while(n <9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			
		}
		System.out.println();
		
		sc.close();
		

	}

}
