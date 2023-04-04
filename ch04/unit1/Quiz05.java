package ch04.unit1;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay, h, rate = 10000;
		
		System.out.println("근무 시간 ?");
		h= sc. nextInt();
		
		if(h > 8) {
			pay = 8 * rate + (int)((h-8)*rate *1.5);
		} else {
			pay = h * rate;
		}
				
		System.out.printf("급여 : %,d\n", pay);
				
		sc.close();

	}

}
