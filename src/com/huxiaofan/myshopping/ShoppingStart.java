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
				admin.doSetPass();
				mainMenu();
			}
		}
	}
	
	void workMenu() {
		int s = menu.doWorkMenu();
		switch(s) {
			case 1:cusInfoMenu();break;
			case 2:;break;
			case 3:;break;
			case 4:mainMenu();break;
		}
	}
	
	void cusInfoMenu() {
		int s = menu.doCusInfoMenu();
		Customer c=new Customer();
		switch(s) {
		case 0:workMenu();break;
		case 1:c.doShow();backToCusInfoMenu();break;
		case 2:c.doAdd();break;
		case 3:System.out.println("�� �� �� �� �� Ϣ");break;
		case 4:System.out.println("�� ѯ �� �� �� Ϣ");;break;
		}
	}
	
	void backToCusInfoMenu(){	//����һ�����ؿͻ���Ϣ����
	    char s=sc.next().charAt(0);	
	    if(s=='n')
	    	cusInfoMenu();
	    else {
	    	System.out.print("������������°�'n'������һ���˵���");
	    	backToCusInfoMenu();
	    }
	}
	
	
}





