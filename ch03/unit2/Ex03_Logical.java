package ch03.unit2;

/*
  - 논리연산자
    && : and
    || : or
    ! : not
*/
public class Ex03_Logical {

	public static void main(String[] args) {
		int a;
		boolean b1, b2;
		
		a = 100;
		b1 = false;
		// b2 = a > 20 && (b1 = true); // b1<-true, b2<-true
		b2 = a < 20 && (b1 = true); // 단축연산. && 앞이 false이므로 뒤쪽 연산을 하지 않음
		System.out.println(b1 + ", " + b2); // false, false
		
		a = 100;
		b1 = false;
		b2 = a > 20 || (b1 = true); // 단축연산. || 앞이 true 이므로 뒤쪽 연산을 하지 않음
		System.out.println(b1 + ", " + b2); // false, true
		
		a = 100;
		b1 = false;
		b2 = a < 20 || (b1 = true);
		System.out.println(b1 + ", " + b2); // true, true
	}

}
