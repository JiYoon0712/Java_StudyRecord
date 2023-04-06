package ch04.unit3;

public class Ex015_while {

	public static void main(String[] args) {
		int dan, n;
		
		dan = 2;
		while(dan <=9) {
			System.out.println("**" + dan + "단 **");
			n= 0;
			while(n<9) {
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan*n);
			}
			System.out.println();
			dan++;
		}

	}

}
