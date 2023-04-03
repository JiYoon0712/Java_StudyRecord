package ch02.unit5;

public class Ex01_var {

	public static void main(String[] args) {
		// 지역변수 유형 추록 : var keyword , JDK 10 이상 가능
		// var x; // 컴파일 오류. 반드시 초기화 필요
		var n = 10;
		int a = n;
		System.out.println(a);
		
		var s = "Java";
		System.out.println(s instanceof String);
			// instanceof : 변수가 해당 클래스의 타입이면 true
	}
}
