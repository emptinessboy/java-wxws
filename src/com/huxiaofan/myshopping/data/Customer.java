package com.huxiaofan.myshopping.data;

import java.util.Scanner;
import com.huxiaofan.myshopping.*;

public final class Customer {
	
	private Scanner sc=new Scanner(System.in);
	//二维数组存放会员信息，三列分别存放会员号，生日和积分。
	private String[][] users=new String[200][3];
	private int index = -1;	//计数器，保存现在的用户数
	
	public Customer(){
		//初始化三个自带用户
		this.add("1111","06/05","8888");
		this.add("2222","06/06","9999");
		this.add("3333","06/01","5555");
	}
	
	private boolean add(String id,String birth,String num) {
		try {	//以免用户错误的输入导致程序崩溃
			index ++;
			users[index][0]=id;
			users[index][1]=birth;
			users[index][2]=num;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			index --;
			return false;
		}
	}
	
	public void doShow() {
		System.out.println("\nMyShopPing管理系统 > 客户信息管理 > 显示客户信息\n");
		System.out.println("\n会员号\t\t生日\t\t积分");
		System.out.println("-----------|-------------|------------");
		for(int i=0;i<=index;i++) {
			for(int j=0;j<3;j++)
				System.out.print(users[i][j]+"\t\t");
			System.out.println("\t");
		}
		System.out.print("\n请按'n'返回上一级菜单：");
	}
	
	public void doAdd() {
		System.out.println("\nMyShopPing管理系统 > 客户信息管理 > 添加客户信息\n\n");
		String id = fourInt();
		System.out.print("请输入");
		String birth = inPutBirth();
		System.out.print("请输入");
		String num = jifenInt();
		boolean r = this.add(id,birth,num);
		if(r) {	//这个if是判断方法有没有报错
			System.out.println("新会员添加成功！\n继续添加会员吗？（y/n）");
			if(Verify.yesOrNo())
				doAdd();
			else {
				System.out.print("\n请按'n'返回上一级菜单：");
				return;
			}
		}
		else {
			System.out.println("输入错误，添加失败！\n重新添加会员吗？（y/n）");
			if(Verify.yesOrNo())
				doAdd();
			else {
				System.out.print("\n请按'n'返回上一级菜单：");
				return;
			}
		}
	}
	
	public void doModify(int show) {
		//修改会员功能
		if(show==1) {
			System.out.println("\nMyShopPing管理系统 > 客户信息管理 > 修改客户信息\n\n");
		}
		String u = fourInt();
		int i;
		for(i=0;i<=index;i++) {
			if(u.equals(users[i][0]))
				break;	//退出循环的时候i的值就是索引值
		}
		if(i>index) {
			System.out.println("没有这个会员号，需要重新输入！");
			doModify(0);
			return;
		}
			
		//输出查找到的会员的信息
		System.out.println("\n会员号\t\t生日\t\t积分");
		System.out.println("-----------|-------------|------------");
		
		for(int j=0;j<3;j++)
			System.out.print(users[i][j]+"\t\t");
		System.out.println("\t");
	
		modify(i);
	}
	
	private void modify(int i) {
	
		Menu.showModifySwitch();	//显示切换菜单
		
		int s = Verify.inputVerify(2);
		
		switch(s) {
			case 1:
				System.out.print("修改后的");
				users[i][1]=inPutBirth();
				System.out.println("生日信息已更改！");
				break;
			case 2:
				System.out.print("修改后的会员");
				users[i][2]=jifenInt();
				System.out.println("会员积分已更改！");
			break;
		}
		
		System.out.println("是否修改其他属性(y/n)：");
		if(Verify.yesOrNo())
			modify(i);
		else {
			System.out.print("\n请按'n'返回上一级菜单：");
			return;
		}
	}
	
	public void find(int show) {
		//查找会员功能
		if(show==1) {
			System.out.println("\nMyShopPing管理系统 > 客户信息管理 > 查询客户信息\n\n");
		}

		String u = fourInt();
		int i;
		for(i=0;i<=index;i++) {
			if(u.equals(users[i][0]))
				break;	//退出循环的时候i的值就是索引值
		}
		if(i>index) {
			System.out.println("抱歉，没有你查询的会员信息。\n");
			System.out.print("要继续查询吗（y/n）：");
			if(Verify.yesOrNo()) {
				find(0);
				return;
			}
			else {
				System.out.print("\n请按'n'返回上一级菜单：");
				return;
			}
		}
			
		//输出查找到的会员的信息
		System.out.println("\n会员号\t\t生日\t\t积分");
		System.out.println("-----------|-------------|------------");
		
		for(int j=0;j<3;j++)
			System.out.print(users[i][j]+"\t\t");
		System.out.println("\t");
		
		System.out.print("\n要继续查询吗（y/n）：");
		if(Verify.yesOrNo()) {
			find(0);
			return;
		}
		else {
			System.out.print("\n请按'n'返回上一级菜单：");
			return;
		}
		
	}
	
	private String inPutBirth() {	//输入并判断生日
		System.out.print("会员生日（月/日<用两位数表示>）：");
		String birth = sc.nextLine();
		try {
			//try catch 防止输入的字符串不能转换成数字造成程序崩溃
			String[] c = birth.split("/"); 	// 分割字符串b到数组c
			if (Integer.parseInt(c[0])<=0 || Integer.parseInt(c[0])>12 || Integer.parseInt(c[1])<=0 || Integer.parseInt(c[1])>31) {
				System.out.println("生日不合法，需要重新输入！");
				inPutBirth();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("生日不合法，需要重新输入！");
			inPutBirth();
		}
		return birth;
	}
	
	private String fourInt() {	//判断4位整数
		System.out.print("请输入会员号(<4位整数>)：");
		String num = sc.nextLine();
		try {
			//try catch 防止输入的字符串不能转换成数字造成程序崩溃
			int n = Integer.parseInt(num);
			if(1000>n||n>9999) {
				System.out.println("您输入的不是4位整数，请重新输入！（大于等于1000，小于等于9999）");
				fourInt();
			}
		} catch (Exception e) {
			System.out.println("您输入的不是4位整数，请重新输入！（大于等于1000，小于等于9999）");
			fourInt();
			// TODO: handle exception
		}
		return num;
	}
	
	private String jifenInt() {	//判断4位整数
		System.out.print("积分：");
		String num = sc.nextLine();
		try {
			int n = Integer.parseInt(num);
			if(n<0||n>999999) {
				System.out.println("积分超出范围，请重新输入！");
				jifenInt();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入异常，请重新输入！");
			jifenInt();
		}
		return num;
	}
	
}
