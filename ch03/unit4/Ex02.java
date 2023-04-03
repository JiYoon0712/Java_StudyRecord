package ch03.unit4;

public class Ex02 {

	public static void main(String[] args) {
		int a;
		
		a = (+-+-+-((5%3) * (4/2)));
		System.out.println(a); // -4
		
		int x=2, y=5, z=0;
		x += 3 + 2;
		System.out.println(x+","+y+","+z); // 7, 5, 0
		
		x += y -= z = 4;
		System.out.println(x+","+y+","+z); // 8, 1, 4
	}

}
