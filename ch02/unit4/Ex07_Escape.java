package ch02.unit4;

public class Ex07_Escape {

	public static void main(String[] args) {
		// 확장열(Escape Sequence)
		System.out.println("a\tb\tc");
		System.out.println("x\ny\nz");
		System.out.println("1\\2"); // \ 자체를 출력
		System.out.println('\101'); // 8진수 101 => 65 => A
		System.out.println('\u0041'); // 유니코드(16진수) => 65 => A
	}
}
