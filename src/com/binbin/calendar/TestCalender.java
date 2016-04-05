package com.binbin.calendar;

import java.util.Scanner;

public class TestCalender {
     public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
    	 Lsb_Calendar lsb=new Lsb_Calendar();
    	 System.out.println("请输入年份");
		 int year=in.nextInt();
		 System.out.println("请输入月份");
		 int month=in.nextInt();
		 lsb.calendar(year, month);
	}
}
