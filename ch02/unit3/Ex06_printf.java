package ch02.unit3;

public class Ex06_printf {

	public static void main(String[] args) {
		String s = "Seoul Korea";
		System.out.printf("%s\n", s); // Seoul Korea 
			// %s : 문자열 출력
		System.out.printf("%S\n", s); // SEOUL KOREA
		System.out.printf("%.5s\n", s); // Seoul
		System.out.println();
		
		int a=10, b=5;
		System.out.printf("%d %d %d %d %d\n", a, b, a, a, b);
		System.out.printf("%1$d %2$d %1$d %1$d %2$d\n", a, b);
	}
}
