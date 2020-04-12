package com.huxiaofan.myshopping;

import java.util.*;
import com.huxiaofan.myshopping.data.*;

public class ShoppingStart {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Run r = new Run();
		r.mainMenu();
	}
	

	
}


class Run {
	
	//��ʼ���˵���
	Menu menu = new Menu();
	Admin admin = new Admin();
	Customer c=new Customer();
	Scanner sc = new Scanner(System.in);
	
	boolean isLogin;

	void mainMenu() {
		if(menu.doMainMenu()==1) {
			isLogin = admin.doLogin();
			while(!isLogin){
				System.out.println("\n�û��������벻ƥ�䣬���������룺");
				isLogin = admin.doLogin();
			}
			workMenu();
		}
		else {
			isLogin = admin.doLogin();
			if(!isLogin){
				System.out.println("��Ǹ����û��Ȩ���޸ģ�\n");
				System.exit(0);
			}
			else {
				admin.doSetPass();	//�����޸�����
				mainMenu();	//�޸���������ʾ������
			}
		}
	}
	
	void workMenu() {
		int s = menu.doWorkMenu();
		switch(s) {
			case 1:cusInfoMenu();break;
			case 2:Shopping.doShopping(c);backToWorkMenu();break;
			case 3:giftMenu();break;
			case 4:mainMenu();break;
		}
	}
	
	void cusInfoMenu() {
		int s = menu.doCusInfoMenu();
		switch(s) {
			case 0:workMenu();break;
			case 1:c.doShow();backToCusInfoMenu();break;
			case 2:c.doAdd();backToCusInfoMenu();break;
			case 3:c.doModify(1);backToCusInfoMenu();break;
			case 4:c.find(1);backToCusInfoMenu();break;
		}
	}
	
	void giftMenu() {
		int s = menu.doGift();
		switch(s) {
			case 0:workMenu();break;
			case 1:Gifting.daFangSong(c);backToGiftMenu();break;
			case 2:Gifting.goodLuck(c);backToGiftMenu();break;
			case 3:c.doModify(1);backToGiftMenu();break;
		}
	}
	
	void backToCusInfoMenu(){	//����һ�����ؿͻ���Ϣ����
		try {	//��ֹ�û����������
			String s=sc.nextLine();
			if(s.equals("n"))
				cusInfoMenu();
			else {
				System.out.print("������������°�'n'������һ���˵���");
				backToCusInfoMenu();
			}
		} catch (Exception e) {
			System.out.print("������������°�'n'������һ���˵���");
			backToCusInfoMenu();
			// TODO: handle exception
		}
	}
	
	void backToWorkMenu(){	//����һ���������˵�
		try {	//��ֹ�û����������
			String s=sc.nextLine();
			if(s.equals("n"))
				workMenu();
			else {
				System.out.print("������������°�'n'������һ���˵���");
				backToWorkMenu();
			}
		} catch (Exception e) {
			System.out.print("������������°�'n'������һ���˵���");
			backToWorkMenu();
			// TODO: handle exception
		}
	}
	
	void backToGiftMenu(){	//����һ�������������
		try {	//��ֹ�û����������
			String s=sc.nextLine();
			if(s.equals("n"))
				giftMenu();
			else {
				System.out.print("������������°�'n'������һ���˵���");
				backToGiftMenu();
			}
		} catch (Exception e) {
			System.out.print("������������°�'n'������һ���˵���");
			backToGiftMenu();
			// TODO: handle exception
		}
	}
}





