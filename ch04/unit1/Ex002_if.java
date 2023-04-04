package ch04.unit1;

import java.util.Scanner;

public class Ex002_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수 ?");
		a= sc.nextInt();
		
		if(a % 2 ==1) { // if((a&1) ==1) ->이렇게 해도 결과는 동일
			System.out.println(a + " : 홀수");		
		}
		
		sc.close();
		
	}

}
