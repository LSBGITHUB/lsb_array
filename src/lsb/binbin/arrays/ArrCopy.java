package lsb.binbin.arrays;

/**
 * Êý×é¸´ÖÆ
 * @author Administrator
 *
 */
public class ArrCopy {
   public static void main(String[] args) {
	 
	   int[] arrA={1,2,3,4,5,6};
	   int[] arrB=new int[arrA.length];
	   for(int i=0;i<arrA.length;i++){
		   arrB[i]=arrA[i];
	   }
	   for(int i=0;i<arrA.length;i++){
		   System.out.print(arrA[i]);
	   }
	   System.out.println("\n");
	   for(int i=0;i<arrB.length;i++){
		   System.out.print(arrB[i]);
	   }
}
}
