package ch03.unit1;

public class Ex06_String {
	public static void main(String[] args) {
		String s;
		s = "korea" + 9 + 3;
		System.out.println(s); // korea93
		
		s = 9 + 3 + "korea";  // 12korea
		System.out.println(s);
		
		s = 'A' + 3 + "korea";
		System.out.println(s); // 68korea
				
		s = '0' + 3 + "korea";
		System.out.println(s); // 51korea
		
		s = "korea" + 'A' + 3; // koreaA3
		System.out.println("\"korea\" + 'A' + 3 = " + s);
	}
}
