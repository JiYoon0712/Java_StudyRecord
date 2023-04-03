package ch03.unit1;

public class Ex05_Arithmetic {
	public static void main(String[] args) {
		char a ='0', b;
		// b = a + '1'; // 컴오류.
		b = (char)(a + '1');
		System.out.println(b); // a
		
		char ch;
		ch = '0' + '1'; // 리터널 + 리터널 = 형변환이 일어나지 않음. 48 + 49 => 97
		System.out.println(ch); // a
		
		byte x;
		x = 10 + 5;
		System.out.println(x);
		
	}
}
