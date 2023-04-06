package ch04.unit3.s2;

public class Ex006_for {

	public static void main(String[] args) {

		int s, n;
		s = 0;
		n = 1;
		for( ; n<= 10;) {//값을빼도 ;만 들어와도됌
			s +=n;
			n++;
		}
		System.out.println(s);
	}
}
