package ch04.unit3;



public class Ex010_while {

	public static void main(String[] args) {
		// 1/2 + 2/3 + 3/4 ... 9/10의 결과
		
	int n = 0;
	double s = 0;
	
	while(n <9) {
		n++;
		s += (double)n/(n+1);
	}
	System.out.println(s);

	
	
	}

}
