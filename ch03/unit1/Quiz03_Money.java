package ch03.unit1;

import java.util.Scanner;

public class Quiz03_Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m;
		
		System.out.println("금액 ? ");
		m = sc.nextInt();
		
		System.out.println("5만원권 개수 : " + (m/50000));
		System.out.println("1만원권 개수 : " + (m%50000)/10000);
		System.out.println("5천원권 개수 : " + (m%10000)/5000);
		System.out.println("1천원권 개수 : " + (m%5000)/1000);
		System.out.println("5백원권 개수 : " + (m%1000)/500);
		System.out.println("1백원권 개수 : " + (m%500)/100);
		System.out.println("50원권 개수 : " + (m%100)/50);
		System.out.println("10원권 개수 : " + (m%50));
		
		sc.close();
	}

}
