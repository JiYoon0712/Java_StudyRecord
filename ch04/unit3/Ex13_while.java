package ch04.unit3;

public class Ex13_while {

	public static void main(String[] args) {
		// 1 + (1+2) + (1+2+3) +... +(1+2+...+10)

		int a,b,c;
		a = b = c= 0;
		
		while (a<10) {
			a++;
			b+=a;
			c+=b;
		}
		System.out.println("결과 : " +c);
		
	}

}
