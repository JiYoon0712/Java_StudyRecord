package ch04.unit2;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a,b;
		String cal;
		
		System.out.println("두수 ?");
		a = sc.nextInt( );
		b = sc.nextInt( );
		
		System.out.println("연산자[+ - * /] ?");
		cal = sc. next();
		
	      String s;
	      switch(cal) {
	      case "+" :    s = a + " + " + b + " = " + (a + b); break;
	      case "-" :    s = a + " + " + b + " = " + (a + b); break;
	      case "*" :    s = a + " + " + b + " = " + (a + b); break;
	      case "/" :   s = a + " + " + b + " = " + (a + b); break;
	      default :   s = "연산자 입력 에러";   break;
	      }
	      System.out.println(s);

	      
	      
	      /*
		switch (cal) {
		case "+" : System.out.printf("%d %s %d = %d",a,cal,b,a+b); break;
		case "-" : System.out.printf("%d %s %d = %d",a,cal,b,a-b); break;
		case "*" : System.out.printf("%d %s %d = %d",a,cal,b,a*b); break;
		case "/" : System.out.printf("%d %s %d = %d",a,cal,b,a/b); break;
		default : System.out.println("입력오류"); break;
		}
	       */
	
	      
	      
	      
	      
		/*
		var s = switch (cal) {
		case "+" -> "+";
		case "-" -> "-";
		case "*" -> "*";
		case "/" -> "/";
		default -> "입력오류";
		} ;
		System.out.printf("%d %s %d = %d",a,cal,b,a+b);
		*/
		
		sc.close();
	}
}
