package lsb.binbin.errer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainGl {
    public static void main(String[] args) throws Exception{
    	SpGl sg=new SpGl();
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	while(true){
    		System.out.println("�밴��ʾ���в���:\t");
    		System.out.print("��1�������Ʒ�밴\t");
    		System.out.print("��2����ѯ��Ʒ�밴\t");
    		System.out.print("��3��ɾ����Ʒ�밴\t");
    		System.out.print("��4���޸���Ʒ�밴\t");
    		System.out.println("��0���˳��밴\t");
    		String str=br.readLine();
    		if(str.equals("1")){
    			System.out.println("��������Ʒ���");
    			String bh=br.readLine();
    			System.out.println("��������Ʒ����");
    			String name=br.readLine();
    			System.out.println("��������Ʒ�۸�");
    			float jg=Float.parseFloat(br.readLine());
    			Sp s=new Sp(bh, name, jg);
    			sg.addSp(s);
    		}else if(str.equals("2")){
    			System.out.print("��������Ʒ��ţ�");
    			String bh=br.readLine();
    			sg.spcx(bh);
    		}else if(str.equals("3")){
    			System.out.print("��������Ҫɾ������Ʒ��ţ�");
    			String bh=br.readLine();
    			sg.spsc(bh);
    		}else if(str.equals("4")){
    			System.out.print("��������Ʒ���\t");
    			String bh=br.readLine();
    			System.out.print("������Ҫ�޸ĵļ۸�\t");
    			float jg=Float.parseFloat(br.readLine());
    			sg.spjg(bh, jg);
    		}else if(str.equals("0")){
    			System.out.println("��ӭ�´�ʹ��");
    			System.exit(0);
    		}else{
    			System.out.println("��������");
    		}
    	}
    	
    	
    }
}
