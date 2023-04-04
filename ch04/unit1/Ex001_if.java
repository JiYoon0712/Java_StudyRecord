package ch04.unit1;

import java.util.Scanner;

public class Ex001_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		String result;
		
		System.out.println("이름 ?");
		name = sc.next();
		
		System.out.println("나이 ?");
		age = sc.nextInt();
		
		result = "미성년자";
		if(age >= 19) {
			result = "성인";
		}

		System.out.println(name + "," + result);
		
		sc.close();
		
	}

}
