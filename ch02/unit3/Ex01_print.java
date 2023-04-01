package ch02.unit3;

/*
 	System.out.print(인수)
 	  : 인수의 내용을 출력 장치를 통해 출력하며, 라인을 넘기지 않는다.
 */
public class Ex01_print {
	public static void main(String[] args) {
		// System.out.print(); // 컴파일 오류. 괄호안에 인수가 필요
		System.out.print("HTML5, ");
		System.out.print("CSS 3, ");
		System.out.print("javascript");
		System.out.print("\n"); // \n:라인을 넘김(코드값:10)
		
		System.out.print("Java\n\nJsp\nServlet");
		System.out.print("\nSpring\n\n");
		
		System.out.print("Oracle\n");
		
		System.out.print("국어\t"); // \t:탭간격
		System.out.print("영어\t");
		System.out.print("수학\n");
		
		System.out.print(80 + "\t"); // 숫자+문자열 => 결과는 문자열
		System.out.print(90 + "\t");
		System.out.print(85 + "\n");
	}
}
