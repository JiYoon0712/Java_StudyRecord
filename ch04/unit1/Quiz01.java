package ch04.unit1;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("두 정수?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c;
		if(a>b)
			c = a-b;
		else
			c = b-a;
		
		System.out.println("차이 :" + c);
		
		sc.close();

	}

}
