package ch04.unit3.s2;

public class Ex007_for {

	public static void main(String[] args) {
		int start = 2000000000;
		int count =0 ;
		
		//for문에서 float를 증감변수로 사용해서는 안된다. 
		for(float n = start; n<start + 50; n++) {
			count ++;
		}
		System.out.println(count); //0
		
		float a = 2000000050.0f;
		float b = 2000000000.0f;
		System.out.println(a == b);//true
		
		
		double total = 0;
		total += 4.7;
		total += 0.4;
		System.out.println(total == 5.1);//false
		System.out.println(total); //5.1000000000000005
		
	}
}
