package lsb.binbin.arrays;

import java.util.Scanner;

/**
 * ��������
 * @author Administrator
 *
 */
public class ArrFind {
    public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("��������Ҫ�ҵ�ѧ������:");
		String name=in.next();
        String[] arr={"����","����","����","����","С��"};
        
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
        	if(name.equals(arr[i])){
        		flag=true;
        		break;
        	}
        }
        if(flag==true){
        	System.out.println("�ҵ���");
        }else{
        	System.out.println("û��ƥ�������");
        }
    }
}
