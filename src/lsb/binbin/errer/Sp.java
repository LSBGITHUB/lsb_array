package lsb.binbin.errer;

public class Sp {
    private String bianhao;//商品编号
    private String mingcheng;//商品名称
    private float jiage;//商品价格
	public Sp(String bianhao, String mingcheng, float jiage) {
		this.bianhao = bianhao;
		this.mingcheng = mingcheng;
		this.jiage = jiage;
	}
	public String getBianhao() {
		return bianhao;
	}
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public float getJiage() {
		return jiage;
	}
	public void setJiage(float jiage) {
		this.jiage = jiage;
	}
}
