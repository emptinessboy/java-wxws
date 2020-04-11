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
				admin.doSetPass();	//调用修改密码
				mainMenu();	//修改完密码显示主界面
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
			case 2:c.doAdd();backToCusInfoMenu();break;
			case 3:c.doModify(1);backToCusInfoMenu();break;
			case 4:System.out.println("查 询 客 户 信 息");;break;
		}
	}
	
	void modifyCustomer() {
		
	}
	
	void backToCusInfoMenu(){	//从上一级返回客户信息管理
		try {	//防止用户乱输入崩溃
			String s=sc.nextLine();
			if(s.equals("n"))
				cusInfoMenu();
			else {
				System.out.print("输入错误，请重新按'n'返回上一级菜单：");
				backToCusInfoMenu();
			}
		} catch (Exception e) {
			System.out.print("输入错误，请重新按'n'返回上一级菜单：");
			backToCusInfoMenu();
			// TODO: handle exception
		}
	}
	

	
	
}





