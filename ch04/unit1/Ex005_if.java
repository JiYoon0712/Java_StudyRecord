package ch04.unit1;

import java.util.Scanner;

public class Ex005_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;
		
		//10 7 5
		System.out.println("세개의 정수 입력 ?");
		a= sc. nextInt();
		b= sc. nextInt();
		c= sc. nextInt();
		
		System.out.printf("입력받은 수 : %d, %d, %d\n", a, b, c);
		
		//적은수에서 큰수 순으로 출력
		
		
		int t;
		if(a > b) {
			t = a; a = b; b= t;
		}
		if(a > c) {
			t = a; a = c; c= t;
		}
		if(b > c) {
			t = b; b = c; c= t;
		}
		
	
		System.out.printf("크기순 : %d, %d, %d\n", a, b, c);
		
		
		sc.close();

	}

}
