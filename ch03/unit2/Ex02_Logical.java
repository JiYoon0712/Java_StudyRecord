package ch03.unit2;

/*
  - 논리연산자
    && : and
    || : or
    ! : not
*/
public class Ex02_Logical {

	public static void main(String[] args) {
		boolean a = true, b = false;
		
		System.out.printf("%b && %b = %b\n", a, b, a&&b);
		System.out.printf("%b || %b = %b\n", a, b, a||b);
		System.out.printf("! %b\n", !a);

	}

}
