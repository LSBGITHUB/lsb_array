package com.binbin.calendar;

/**
 * 日历
 * 求出1990年1月1日到现在的天数
 * @author Administrator
 *
 */
public class Lsb_Calendar {
	
	
    public void calendar(int year,int month){
        
    	int sum=0;//计算出相隔总天数
    	int day=0;//天数
    	int weekDay=0;//星期
    	
    	//通过循环计算出总天数
    	for(int i=1990;i<year;i++){
    		if(year%4==0&&year%100!=0||year%400==0){
    			sum+=366;
    		}else{
    			sum+=365;
    		}
    	}//System.out.println("相隔总天数："+sum);
    	
    	//计算出一个月的总天数加到总天数去
    	//到出几月
        if(month>=0&&month<=12){
        	for(int i=1;i<month;i++){
        		if(i==2){
        			//是闰年就加上29
        			if(year%4==0&& year%100!=0||year%400==0){
        				sum+=29;
        			}else{
        				sum+=28;
        			}
        		}else{
        			//判断是否大小月 30/31
        			if(i==4||i==6||i==9||i==11){
        				sum+=30;
        			}else{
        				sum+=31;
        			}
        		}
        	}
    	}else{
    		System.out.println("输入有误");
    	}
        sum+=1;//天数
        
        //判断月份的30、31天
        if(month==2){
        	if(year%4==0&&year%100!=0||year%400==0){
        		day=29;
        	}else{
        		day=28;
        	}
        }else{
        	if(month==4||month==6||month==9||month==11){
        		day=30;
        	}else{
        		day=31;
        	}
        }
        
        
        
        weekDay=sum%7;//计算出一周的星期几
       
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for(int i=1;i<=weekDay;i++){
        	System.out.print("\t");
        }
        
        //输出日期
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
