package ch05.unit1;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = new int[5]; // 배열 선언과 동시에 메모리 할당
		
		int n = 1;
		for(int i=0; i<a.length; i++) { // length 속성 : 배열의 길이
			a[i] = n;
			n += 2;
		}
		
		for(int i=0; i<5; i++) { // a.length : 5
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		
		// 향상된 for 문
		System.out.println("\n향상된 for문 ...");
		for(int x : a) { // for(자료형 변수 : 컬렉션) {
			System.out.print(x + "  ");
		}
		System.out.println();
		
		// var(타입 추론) 키워드 사용
		System.out.println("\nvar 키워드 ...");
		for(var x : a) {
			System.out.print(x + "  ");
		}
		System.out.println();
	}
}
