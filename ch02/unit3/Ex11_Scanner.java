package ch02.unit3;

import java.util.Scanner;

public class Ex11_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		char gender;
		int age;
		double h;

		System.out.print("이름 ? ");
		name = sc.next(); // 공백없는 문자열 입력
			// next(), nextInt(), nextDouble() 에서 엔터나 공백은 구분자 역할을 한다.
		
		System.out.print("성별[M/F] ? ");
		gender = sc.next().charAt(0); // 한문자 입력
		
		System.out.print("나이 ? ");
		age = sc.nextInt(); // 정수입력
		
		System.out.print("키 ? ");
		h = sc.nextDouble(); // 실수입력

		System.out.println("\n입력 내용 !!!");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + h);
		
		sc.close();
	}
}
