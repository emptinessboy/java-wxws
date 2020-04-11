package com.huxiaofan.myshopping.data;

import java.util.Scanner;

public final class Customer {
	
	private Scanner sc=new Scanner(System.in);
	//二维数组存放会员信息，三列分别存放会员号，生日和积分。
	private String[][] users=new String[200][3];
	private int index = -1;	//计数器，保存现在的用户数
	
	
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
	
	public void doAdd() {
		System.out.println("\n");
		System.out.print("请输入会员号(<4位整数>)：");
		String id = sc.nextLine();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String birth = sc.nextLine();
		System.out.print("请输入积分：");
		String num = sc.nextLine();
		if(add(id,birth,num))
			System.out.println("新会员添加成功！\n继续添加会员吗？（y/n）");
		else
			System.out.println("输入错误，添加失败！\n重新添加会员吗？（y/n）");
	}
	
	public void doShow() {
		System.out.println("\nMyShopPing管理系统 > 客户信息管理 > 显示客户信息\n");
		System.out.println("\n会员号\t\t生日\t\t积分");
		System.out.println("-----------|-------------|------------");
		for(int i=0;i<=index;i++) {
			for(int j=0;j<3;j++)
				System.out.print(users[i][j]+"\t\t");
			System.out.println("\t\n");
		}
		System.out.print("\n请按'n'返回上一级菜单：");
	}
	
	
	public Customer(){
		//初始化三个自带用户
		this.add("0001","06/05","8888");
		this.add("0002","06/06","9999");
		this.add("0003","06/01","5555");
	}
	
}
