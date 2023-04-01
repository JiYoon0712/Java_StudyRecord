package ch02.unit3;

/*
	System.out.println([인수])
	  : 인수의 내용을 출력 장치를 통해 출력하고 라인을 넘긴다.
	  : 인수에 아무것도 없으면 라인만 넘긴다.
*/

public class Ex02_println {
	public static void main(String[] args) {
		System.out.println("HTML 5");
		System.out.println("CSS 3");
		System.out.println();
		
		System.out.println("JAVA\n");
		System.out.println("ORACLE\n");
		System.out.println();
		
		System.out.println("국어\t영어\t수학");
		System.out.println(80 + "\t" + 90 + "\t" + 85);
	}
}
