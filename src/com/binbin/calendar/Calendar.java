package com.binbin.calendar;

import java.util.Scanner;

/**
 * 日历
 * @author Administrator
 *
 */
public class Calendar {
     public static void main(String[] args) {
    	 
		Scanner in=new Scanner(System.in);
    	 System.out.println("请输入年份");
    	 int year=in.nextInt();
    	 System.out.println("请输入月份");
    	 int month=in.nextInt();
		 int sum=0;//总数
		 int day=0;
		//计算出1990年到2016年相隔多少天
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		
		//计算月份
		for(int i=1;i<month;i++){
			//判断2月份
			if(i==2){
				//判断是否为闰年
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				//判断是否小月
				if(i==4||i==6||i==9||i==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
		sum+=1;
		
		
		
		//判断2月份
		//计算月份天数，存在一个变量里
		if(month==2){
			//判断是否为闰年
			if(year%4==0&&year%100!=0||year%400==0){
				day=29;
			}else{
				day=28;
			}
		}else{
			//判断是否小月
			if(month==4||month==6||month==9||month==11){
				day=30;
			}else{
				day=31;
			}
		}
		
/*		switch (month) {
	      case 4:
	      case 6:
	      case 9:
	      case 11:
	           day=30;
		       break;
	      case 1:
	      case 3:
	      case 5:
	      case 7:
	      case 8:
	      case 10:
	      case 12:
	    	   day=31;
	    	   break;
	default:
		if(year%4==0&&year%100!=0||year%400==0){
			day=29;
		}else{
			day=28;
		}
		break;
	}*/
		
		
		//天数
		//System.out.println("1990年1月1日到2016年5月7日一共"+sum+"天");
		//总天数%7就等于星期几
		//System.out.println("2016年4月7日"+sum%7);
		int wekday=sum%7;//星期
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=wekday;i++){
			System.out.print("\t");
		}
//		System.out.print("2");
		//输出日期天数
		for(int i=1;i<=day;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			sum++;
		}
	
	}
}
