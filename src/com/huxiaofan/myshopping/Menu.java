package com.huxiaofan.myshopping;

import java.util.Scanner;

class Menu{
	
	Scanner sc = new Scanner(System.in);
	
	void showMainMenu() {
	    System.out.println("\n\n\t��ӭʹ�� MyShopPing ����ϵͳ @2018010587-������\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. �� ¼ ϵ ͳ\n");
	    System.out.println("\t\t   2. �� �� �� �� Ա �� ��\n");
	    System.out.println("\t\t   3. �� ��\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("��ѡ���������֣�");
	}
	
	int doMainMenu(){
		//�˺������в˵�ѡ�񣬲����û����벻�Ϸ�ֵʱҪ���������롣��󷵻�ѡ��Ĳ˵�ѡ��
		showMainMenu();
	    int s=Verify.inputVerify(3);
	    if(s==3) {	
	    	System.out.println("лл����ʹ�ã� ");
	    	System.exit(0);	//�˳�����
		}
		return s;
	}

	void showWorkMenu() {
	    System.out.println("\n\n\t��ӭʹ�� MyShopPing ����ϵͳ @2018010587-������\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. �� �� �� Ϣ �� ��\n");
	    System.out.println("\t\t   2. �� �� �� ��\n");
	    System.out.println("\t\t   3. �� �� �� ��\n");
	    System.out.println("\t\t   4. ע ��\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("��ѡ���������֣�");
	}
	
	int doWorkMenu(){
		showWorkMenu();
		return Verify.inputVerify(4);
	}
	
	void showCusInfoMenu() {
	    System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ����\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. �� ʾ �� �� �� �� �� Ϣ\n");
	    System.out.println("\t\t   2. �� �� �� �� �� Ϣ\n");
	    System.out.println("\t\t   3. �� �� �� �� �� Ϣ\n");
	    System.out.println("\t\t   4. �� ѯ �� �� �� Ϣ\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("��ѡ���������ֻ�'n'������һ���˵���");
	}
	
	int doCusInfoMenu(){
		showCusInfoMenu();
		return Verify.inputVerifyWithN(4);
	}
	
	

	
}