package lsb.binbin.arrays;

import java.util.Scanner;

/**
 * 查找数组
 * @author Administrator
 *
 */
public class ArrFind {
    public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("请输入你要找的学生姓名:");
		String name=in.next();
        String[] arr={"张三","李四","王五","赵六","小彬"};
        
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
        	if(name.equals(arr[i])){
        		flag=true;
        		break;
        	}
        }
        if(flag==true){
        	System.out.println("找到了");
        }else{
        	System.out.println("没有匹配的名字");
        }
    }
}
