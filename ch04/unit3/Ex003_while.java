package ch04.unit3;

public class Ex003_while {

	public static void main(String[] args) {
		// A ~ Z까지 영문자 출력
		/*
		char ch = 'A';
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			ch++;
		}
		System.out.println();
		*/
		
		
		
		/*
		// char ch = 'A' - 1;
		char ch = 64;
		while(ch++ < 'Z') {
			System.out.print(ch + " ");
		}
		System.out.println();
		*/
		
		
		
		// 한줄에 7개씩 영문자를 출력
		/*
		char ch = 'A';
		int n = 0;
		while(ch <= 'Z') {
			System.out.print(ch + " ");
			n++;
			if(n%7 == 0) {
				System.out.println();
			}
			ch++;
		}
		System.out.println();
		*/

		
		
		char ch = 'A';
		int n = 0;
		while(ch <= 'Z') {
			n++;
			System.out.print(ch + (n%7==0 ? "\n":" "));
			ch++;
		}
		System.out.println();
		

	}

}
