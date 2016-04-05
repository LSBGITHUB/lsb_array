package lsb.binbin.arrays;

import java.util.Scanner;

/**
 * 数组平均分
 * 求最大值
 * @author Administrator
 *
 */
public class ArrAvg {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第："+(i+1)+"个学员");
			arr[i]=in.nextInt();
			sum+=arr[i];
		}
		
		//判断最大
		int max=arr[0];//定义个值
		for(int i=0;i<arr.length;i++){
			
             max=max<arr[i]?max=arr[i]:max;
		}
		int avg=sum/5;//平均分
		System.out.println(max);
		
	}
}
