package ch04.unit3.s2;

public class Ex014_for {

	public static void main(String[] args) {
		int c;
		
		for(int a=2; a<=9; a++) {
			System.out.println("**" + a + "단 **");
			for(int b=1; b<=9; b++) {
				c = a* b;
				System.out.printf("%d + %d = %d\n", a, b, c);
			}
			System.out.println();
		}
		
	}

}
