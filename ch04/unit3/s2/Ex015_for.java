package ch04.unit3.s2;

public class Ex015_for {

	public static void main(String[] args) {
		int c;
		
		for(int a=2; a<=9; a++) {
			System.out.print(" " + a + "단  \t");//위에 몇단인지 표시
		}
		System.out.println();
		
		for(int b=1; b<=9; b++) { //자바는 세로입력후 옆줄이동 안되서 가로로 입력하는코드로 짜야함
		for(int a=2; a<=9; a++) {//단
				c = a* b;
				System.out.printf("%d*%d=%d\t", a, b, c);
				
			}
			System.out.println();
		}
		
	}

}
