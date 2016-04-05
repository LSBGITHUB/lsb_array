package com.binbin.calendar;

/**
 * 日历
 * @author Administrator
 *
 */
public class Calendar {
     public static void main(String[] args) {
		@SuppressWarnings("unused")
		int sum=0;//总数
		//计算出1990年到2016年相隔多少天
		for(int year=1900;year<=2015;year++){
			if(year%4==0&&year%100!=0||year%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		
		//计算月份
		for(int month=1;month<=3;month++){
			//判断2月份
			if(month==2){
				//判断是否为闰年
				if(2016%4==0&&2016%100!=0||2016%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else{
				//判断是否小月
				if(month==4||month==6||month==9||month==11){
					sum+=30;
				}else{
					sum+=31;
				}
			}
		}
		sum+=1;
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
		for(int i=1;i<=30;i++){
			if(sum%7==6){
				System.out.print(i+"\n");
			}else{
				System.out.print(i+"\t");
			}
			sum++;
		}
	}
}
