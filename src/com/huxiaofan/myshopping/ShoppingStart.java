package com.huxiaofan.myshopping;

import java.util.*;
import com.huxiaofan.myshopping.data.*;

public class ShoppingStart {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Run r = new Run();
		r.mainMenu();
	}
	

	
}


class Run {
	
	//初始化菜单类
	Menu menu = new Menu();
	Admin admin = new Admin();
	Scanner sc = new Scanner(System.in);
	
	boolean isLogin;

	void mainMenu() {
		if(menu.doMainMenu()==1) {
			isLogin = admin.doLogin();
			while(!isLogin){
				System.out.println("\n用户名和密码不匹配，请重新输入：");
				isLogin = admin.doLogin();
			}
			workMenu();
		}
		else {
			isLogin = admin.doLogin();
			if(!isLogin){
				System.out.println("抱歉，您没有权限修改！\n");
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
		case 3:System.out.println("修 改 客 户 信 息");break;
		case 4:System.out.println("查 询 客 户 信 息");;break;
		}
	}
	
	void backToCusInfoMenu(){	//从上一级返回客户信息管理
	    char s=sc.next().charAt(0);	
	    if(s=='n')
	    	cusInfoMenu();
	    else {
	    	System.out.print("输入错误，请重新按'n'返回上一级菜单：");
	    	backToCusInfoMenu();
	    }
	}
	
	
}





