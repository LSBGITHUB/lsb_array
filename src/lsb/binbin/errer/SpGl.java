package lsb.binbin.errer;

import java.util.ArrayList;

public class SpGl {
    private ArrayList<Sp> al=null;
	public SpGl() {
		this.al = new ArrayList<Sp>();
	}
	
	//���
	public void addSp(Sp sp){
		al.add(sp);
		System.out.println("��ӳɹ�");
	}
	//��ѯ
	public void spcx(String bh){
		int i;
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				System.out.println("��Ʒ��Ϣ����");
				System.out.println("��Ʒ��ţ�"+s.getBianhao());
				System.out.println("��Ʒ���ƣ�"+s.getMingcheng());
				System.out.println("��Ʒ�۸�"+s.getJiage()+"Ԫ");
				break;
			}
		}
		if(i==al.size()){
			System.out.println("û��������Ϣ");
		}
	}
	
	//�޸�
	public void spjg(String bh,float jg){
		int i;
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				s.setJiage(jg);
				System.out.println("�۸��޸ĳɹ�");
				break;
			}
		}
		if(i==al.size()){
			System.out.println("�޸�ʧ��");
		}
	}
	
	//ɾ��
	public void spsc(String bh){
		int i;
		
		if(al.size()==0){
			System.out.println("û����Ʒ��ɾ��");
		}
		
		for(i=0;i<al.size();i++){
			Sp s=al.get(i);
			if(s.getBianhao().equals(bh)){
				al.remove(i);
				System.out.println("ɾ���ɹ�");
				break;
			}
		}
		if((i==al.size())&&(al.size()!=0)){
			System.out.println("ɾ��ʧ��");
		}
	}
	
    
}
