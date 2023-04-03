package ch03.unit3;

public class Ex03 {

	public static void main(String[] args) {
		int a = 123;
		int key = 7898;
		
		System.out.println("a : " + a);
		
		a = a ^ key;
		System.out.println("암호화 : " + a);
		
		a = a ^ key;
		System.out.println("복호화 : " + a);
	}
}
