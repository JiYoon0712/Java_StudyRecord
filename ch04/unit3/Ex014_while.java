package ch04.unit3;

public class Ex014_while {

	public static void main(String[] args) {
		// 무한 루프
		int n, s;
		
		n = s = 0;
		while(true) {
			n++;
			s += n;
			if(n == 100) {
				break; // 반복문(while)을 빠져나감
			}
		}
		System.out.println("결과 : " + s);
	}

}
