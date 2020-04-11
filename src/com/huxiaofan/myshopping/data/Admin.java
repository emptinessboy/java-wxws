package com.huxiaofan.myshopping.data;

import java.util.Scanner;

public final class Admin{
	private String admin = "manager";
	private String adminPass = "0000";
	Scanner sc = new Scanner(System.in);
	
	boolean login(String u,String p) {
		if (u.equals(admin)&&p.equals(adminPass))
			return true;
		else {
			return false;
		}
	}
	
	public boolean doLogin() {
		System.out.print("请输入用户名：");
		String u = sc.nextLine();
		System.out.print("请输入密码：");
		String p = sc.nextLine();
		return login(u,p);
	}
	
	void setPass(String u,String p) {
		admin = u;
		adminPass = p;
	}
	
	public void doSetPass() {
		System.out.print("请输入新的用户名：");
		String u = sc.nextLine();
		System.out.print("请输入新的密码：");
		String p1 = sc.nextLine();
		System.out.print("请再次输入新的密码：");
		String p2 = sc.nextLine();
		if(p1.equals(p2)) {
			setPass(u,p1);
			System.out.println("用户名和密码已更改！");
		}
		else
			System.out.println("两次密码不一致。");
	}
	
}
