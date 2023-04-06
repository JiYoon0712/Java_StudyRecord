package ch04.unit3;

public class Ex009_while {

	public static void main(String[] args) {
		// 10!(1*2*...*10)의 결과 출력
		int n, s;
		
		n = 0;
		s = 1;
		while(n < 10) {
			n++;
			s *= n;
		}
		System.out.println("결과:" + s);
	}

}
