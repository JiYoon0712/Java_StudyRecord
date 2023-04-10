package ch04.unit3.s2;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
//if를 줄인 코드
public class Ex021 {

   public static void main(String[] args) {

	   int size = 9;
	   int n;
	   
	   n = size /2;//n=4
	   for(int i =0; i<size; i++) {
		   for(int j =0; j<size-n; j++) {
			   System.out.print((j >=n)? "*" : " ");
		   }
		   n = i < (size /2)? n-1: n+1;
		   System.out.println();
	   }
      
	   // i =0; j = 0~4  n = 4
	   // i =1; j = 0~5  n = 3
	   // i =2; j = 0~6  n = 2
	   // i =3; j = 0~7  n = 1
	   // i =4; j = 0~8  n = 0
	   // i =5; j = 0~7  n = 1
	   // i =6; j = 0~6  n = 2
	   // i =7; j = 0~5  n = 3
	   // i =8; j = 0~4  n = 4
	   
	   
   }

}
