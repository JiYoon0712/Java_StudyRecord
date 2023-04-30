package ch05.unit1;

/*
 - 배열은 크기를 변경 할 수 없다.
 - 배열의 크기를 변경하면 이전 배열은 위치를 참조할 수 없으며,
   이전 배열은 가비지 컬렉터(garbage collector)의 대상이된다.
 - 크기를 변경하여 만든 배열은 새로운 위치에 메모리를 할당 받는다.
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		// System.out.println(a); // [I@58ceff1
		
		System.out.println("크기가 3인 배열을 선언후 값을 할당 한후...");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  "); // 10  20  30  
		}
		System.out.println();
		
		a = new int[5]; // 숫자 배열은 0으로 초기화가 된다.
		a[3] = 40; a[4] = 50;
		
		// System.out.println(a); // [I@7c30a502
		
		System.out.println("\n배열의 크기를 5로 변경후...");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  "); // 0 0 0 40 50
		}
		System.out.println();

	}

}
