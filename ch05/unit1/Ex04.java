package ch05.unit1;

public class Ex04 {

	public static void main(String[] args) {
		// 일반 변수
		int x = 10;
		int y = x; // x라는 변수가 가지고 있는 값을 y 변수에 대입
		y += 20;
		System.out.println(x + ", " + y); // 10, 30
		System.out.println();
		
		// 배열
		int []a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		System.out.println("초기 a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 10 20 30
		}
		System.out.println();
		
		int []b = a; // a배열이 참조하는 주소를 b 배열에 대입
					// a배열과 b배열은 동일한 주소를 참조
					// 하나의 배열을 a와 b 배열이 공유
		a[0] = 500;
		b[1] += 100;
		b[2] += 100;
		
		System.out.println("a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 500 120 130 
		}
		System.out.println();
		
		System.out.println("b 배열...");
		for(int n : b) {
			System.out.print(n + " "); // 500 120 130 
		}
		System.out.println();
		
		
		
		

	}

}
