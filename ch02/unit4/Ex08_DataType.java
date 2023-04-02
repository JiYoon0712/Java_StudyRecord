package ch02.unit4;

/*
 - boolean : 1byte, true 와 false만 표현가능
 */
public class Ex08_DataType {

	public static void main(String[] args) {
		boolean b1 = true, b2;
		
		// b2 = "false"; // 컴오류
		b2 = false;
		
		System.out.println(b1 + ", " + b2);
	}
}
