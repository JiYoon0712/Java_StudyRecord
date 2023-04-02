package ch02.unit4;

public class Ex06_String {

	public static void main(String[] args) {
		// String : 문자열을 나타내는 클래스
		String s1, s2, s3;
		
		s1 = "seoul";
		s2 = "korea";
		s3 = s1 + s2;  // 문자열에서 + 는 문자열 결합
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		s3 = ""; // 문자열 길이가 0인 문자열
		System.out.println(s3);
		
		s3 = "X" + 'A' + 10; // 문자열+기본자료형 => 문자열로 결합
		System.out.println(s3); // XA10
		
		s3 = 'A' + 10 + "X";
		System.out.println(s3); // 75X
	}
}
