package lsb.binbin.arrays;

import java.util.Scanner;

public class ArrInsert {
    /**
     * ��������
     * @param args
     */
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr={2,3,5,8,9};
		System.out.println("��������Ҫ�����ֵ��");
		int num=in.nextInt();
		System.out.println();
		arr[arr.length-1]=num;
		for(int i=arr.length-1;i>0;i--){
			if(arr[i]<arr[i-1]){
				int t=arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=t;
			}else{
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}
