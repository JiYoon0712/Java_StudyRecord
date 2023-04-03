package ch03.unit2;

/*
  - 논리연산자
    && : and
    || : or
    ! : not
*/
public class Ex04_Logical {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		a=20; b=20;
		c = ++a > 20 && ++b > 20;
		System.out.println(a+","+b+","+c); // 21 21 true
		
		a=20; b=20;
		c = a++ > 20 && ++b > 20;
		System.out.println(a+","+b+","+c); // 21 20 false
		
		a=20; b=20;
		c = ++a > 20 && b++ > 20;
		System.out.println(a+","+b+","+c); // 21 21 false
		
		a=20; b=20;
		c = ++a > 20 || ++b > 20;
		System.out.println(a+","+b+","+c);  // 21 20 true
		
	}

}
