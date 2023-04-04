package ch04.unit1;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
	
		// Quiz 3번 다시 풀어본것!
		
		Scanner sc = new Scanner(System.in);
		
		char put, a ;
		
		System.out.println("문자 ?");
		put = sc.next().charAt(0);
		
		
		if( put>='A' && put<='Z') {
		a = (char)(put + 32); 
		} else if (put>='a' && put<='z') {
			a = (char)(put -32);
		}else a = put ;
		
		System.out.printf("%c => %c", put, a);
		

		sc.close();
		
		
	}

}
