package ch04.unit1;

import java.util.Scanner;

public class Ex006_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("문자 ?");
		ch= sc.next().charAt(0);
				
				if(ch >= 'A' && ch<= 'Z') {
					System.out.println(ch + ": 대문자");
				} else if(ch >= 'a' && ch <= 'z') {
					System.out.println(ch + " :소문자");
				}else {
					System.out.println(ch + " : 기타문자");
				}
		sc.close();

	}
}
