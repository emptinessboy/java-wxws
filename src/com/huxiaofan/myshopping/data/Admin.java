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
		System.out.print("�������û�����");
		String u = sc.nextLine();
		System.out.print("���������룺");
		String p = sc.nextLine();
		return login(u,p);
	}
	
	void setPass(String u,String p) {
		admin = u;
		adminPass = p;
	}
	
	public void doSetPass() {
		System.out.print("�������µ��û�����");
		String u = sc.nextLine();
		System.out.print("�������µ����룺");
		String p1 = sc.nextLine();
		System.out.print("���ٴ������µ����룺");
		String p2 = sc.nextLine();
		if(p1.equals(p2)) {
			setPass(u,p1);
			System.out.println("�û����������Ѹ��ģ�");
		}
		else
			System.out.println("�������벻һ�¡�");
	}
	
}
