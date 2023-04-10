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
//if를 줄이는게 좋음
public class Ex020 {

   public static void main(String[] args) {

	   for(int i =1; i <= 9; i++) {
		   
	   }
	   
	   
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j<=5-i; j++) {
            System.out.print(" ");
         }
         
         for(int j =1; j<=i*2-1; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      for (int i = 4; i >= 1; i--) {
          for (int j = 1; j<=5-i; j++) {
             System.out.print(" ");
          }
          
          for(int j =1; j<=i*2-1; j++) {
             System.out.print("*");
          }
          System.out.println();
       }
      
   }

}
