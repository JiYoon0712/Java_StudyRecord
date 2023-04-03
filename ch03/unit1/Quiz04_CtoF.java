package ch03.unit1;

import java.util.Scanner;

public class Quiz04_CtoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		double f;
		
		System.out.println("섭씨온도 ? ");
		c = sc.nextInt();
		
		f = c * 1.8 + 32;
		
		System.out.printf("화씨온도 : %.1f\n", f);
		
		sc.close();
	}

}
