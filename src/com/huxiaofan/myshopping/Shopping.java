package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Shopping {
	static Scanner sc=new Scanner(System.in);
	static void doShopping(Customer c) {
		Menu.showPay();
		String user = sc.nextLine();
		
		int id = c.findId(user);
		double money = 0;
		int jifen = 0;
		int[][] list=new int[7][7];
		do{
			System.out.print("\n��������Ʒ��ţ�");
			int shangPin =  Verify.inputVerify(7);
			System.out.print("��������Ŀ��");
			int number =  Verify.numVerify();
			
			switch(shangPin) {
			case 1:
				money+=880*number;jifen+=300*number;
				list[0][0]+=number;list[0][1]+=880*number;
				break;
			case 2:
				money+=200*number;jifen+=80*number;
				list[1][0]+=number;list[1][1]+=200*number;
				break;
			case 3:
				money+=350*number;jifen+=120*number;
				list[2][0]+=number;list[2][1]=350*number;
				break;
			case 4:
				money+=180*number;jifen+=70*number;
				list[3][0]+=number;list[3][1]=180*number;
				break;
			case 5:
				money+=900*number;jifen+=300*number;
				list[4][0]+=number;list[4][1]=900*number;
				break;
			case 6:
				money+=70*number;jifen+=30*number;
				list[5][0]+=number;list[5][1]=70*number;
				break;
			case 7:
				money+=180*number;jifen+=75*number;
				list[6][0]+=number;list[6][1]=180*number;
				break;
			}
			System.out.print("�Ƿ������y/n����");
		}while(Verify.yesOrNo());	//ѭ�������Ʒ
		money = money*0.85;
		
		genList(list,money,jifen);	//��ӡ�����嵥
		
		c.addJIfen(id, jifen);	//������ɺ�̬�޸Ļ���
		
		System.out.print("\n��'n'������һ���˵���");
	}
	
	static void genList(int[][] list,double money,int jifen) {
		System.out.println("\n������������������������ �����嵥 ������������������������");
		System.out.println("��Ʒ\t\t ���� \t����\t���\n");
		
		for(int i=0;i<list.length;i++) {
			if(list[i][0]>0) {
				
				switch(i+1) {
				case 1:
					System.out.println("addidas �˶�Ь\t ��880"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 2:
					System.out.println("Kappa ����ȹ\t ��200"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 3:
					System.out.println("������\t ��350"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 4:
					System.out.println("addidas T��\t ��180"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 5:
					System.out.println("Nike �˶�Ь\t ��900"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 6:
					System.out.println("Kappa ����\t ��70"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				case 7:
					System.out.println("Kappa T��\t ��180"+"\t "+list[i][0]+"\t��"+list[i][1]);
					break;
				}
				
			}
		}
		System.out.println("\n�ۿۣ�  0.85");
		System.out.printf("����ܼƣ� ��%.1f\n",money);
		System.out.print("ʵ�ʽ��ѣ�  ��");
		int pay  =  Verify.numVerify();
		while(pay<money) {	//���븶Ǯ�ж�
			System.out.println("�ͻ�����Ǯ�������޷����ף�");
			System.out.print("����������ʵ�ʽɷѣ�  ��");
			pay  =  Verify.numVerify();
		}
		System.out.printf("��Ǯ�� ��%.1f\n",pay-money);
		System.out.println("���ι�������Ļ����ǣ�  "+jifen);
	}
}
