package lsb.binbin.arrays;

import java.util.Scanner;

/**
 * ����ƽ����
 * �����ֵ
 * @author Administrator
 *
 */
public class ArrAvg {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("������ڣ�"+(i+1)+"��ѧԱ");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		
		//�ж����
		int max=arr[0];//�����ֵ
		for(int i=0;i<arr.length;i++){
			
             max=max<arr[i]?max=arr[i]:max;
		}
		int avg=sum/5;//ƽ����
		System.out.println(max);
		
	}
}
