package lsb.binbin.errer;

import java.util.ArrayList;

public class SpGl {
    private ArrayList<Sp> al=null;
	public SpGl() {
		this.al = new ArrayList<Sp>();
	}
	
	//添加
	public void addSp(Sp sp){
		al.add(sp);
		System.out.println("添加成功");
	}
	//查询
	public void spcx(String bh){
		int i;
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				System.out.println("商品信息如下");
				System.out.println("商品编号："+s.getBianhao());
				System.out.println("商品名称："+s.getMingcheng());
				System.out.println("商品价格："+s.getJiage()+"元");
				break;
			}
		}
		if(i==al.size()){
			System.out.println("没有这条信息");
		}
	}
	
	//修改
	public void spjg(String bh,float jg){
		int i;
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				s.setJiage(jg);
				System.out.println("价格修改成功");
				break;
			}
		}
		if(i==al.size()){
			System.out.println("修改失败");
		}
	}
	
	//删除
	public void spsc(String bh){
		int i;
		
		if(al.size()==0){
			System.out.println("没有商品可删除");
		}
		
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				al.remove(i);
				System.out.println("删除成功");
				break;
			}
		}
		if((i==al.size())&&(al.size()!=0)){
			System.out.println("删除失败");
		}
	}
	
    
}
