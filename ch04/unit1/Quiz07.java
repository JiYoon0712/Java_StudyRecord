package ch04.unit1;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, p;
		int a, b, c ,d;
		
		System.out.println("이름 ?");
		name = sc.next();
		
		System.out.println("세과목 점수 ?");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		d= (a + b+ c )/3 ;
				if(a>=40 && b>=40 &&c>=40 && d >=60) {
					p="합격";
				} else if( d >=60) {
					p="과락";
				}else {
					p="불합격";
				}
		
		System.out.println(name + "[님은 "+ p + "]입니다.");
		
		sc.close();

	}

}
