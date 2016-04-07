package lsb.binbin.errer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainGl {
    public static void main(String[] args) throws Exception{
    	SpGl sg=new SpGl();
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	while(true){
    		System.out.println("请按提示进行操作:\t");
    		System.out.print("（1）添加商品请按\t");
    		System.out.print("（2）查询商品请按\t");
    		System.out.print("（3）删除商品请按\t");
    		System.out.print("（4）修改商品请按\t");
    		System.out.println("（0）退出请按\t");
    		String str=br.readLine();
    		if(str.equals("1")){
    			System.out.println("请输入商品编号");
    			String bh=br.readLine();
    			System.out.println("请输入商品名称");
    			String name=br.readLine();
    			System.out.println("请输入商品价格");
    			float jg=Float.parseFloat(br.readLine());
    			Sp s=new Sp(bh, name, jg);
    			sg.addSp(s);
    		}else if(str.equals("2")){
    			System.out.print("请输入商品编号：");
    			String bh=br.readLine();
    			sg.spcx(bh);
    		}else if(str.equals("3")){
    			System.out.print("请输入你要删除的商品编号：");
    			String bh=br.readLine();
    			sg.spsc(bh);
    		}else if(str.equals("4")){
    			System.out.print("请输入商品编号\t");
    			String bh=br.readLine();
    			System.out.print("请输入要修改的价格：\t");
    			float jg=Float.parseFloat(br.readLine());
    			sg.spjg(bh, jg);
    		}else if(str.equals("0")){
    			System.out.println("欢迎下次使用");
    			System.exit(0);
    		}else{
    			System.out.println("输入有误！");
    		}
    	}
    	
    	
    }
}
