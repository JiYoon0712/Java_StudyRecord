package ch04.unit2;

import java.util.Scanner;

public class Ex05_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("과목 ?");
		s = sc.next();
		
		switch(s) { // 문자열은 JDK 7부터 가능
		case "a1" : System.out.println("자바"); break;
		case "a2" : System.out.println("오라클"); break;
		case "a3" : System.out.println("서블릿"); break;
		default :  System.out.println("입력오류..."); break;
		}
		
		// if (s == "a1") {} //잘못 된 코딩. ==으로는 문자열을 비교할 수 없다.
		
		sc.close();
		
		


	}

}
