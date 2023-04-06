package ch04.unit3;

public class Ex002_while {

	public static void main(String[] args) {
		// 1~10 까지 짝수 출력
		
		int n = 0;
		while (n < 10) {
			n += 2;
			System.out.print(n + " ");
		}
		System.out.println("\n밖 :" + n);

	}

}
