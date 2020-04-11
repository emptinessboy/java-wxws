package com.huxiaofan.myshopping;

import java.util.Scanner;

class Menu{
	
	Scanner sc = new Scanner(System.in);
	
	void showMainMenu() {
	    System.out.println("\n\t欢迎使用 MyShopPing 管理系统 @2018010587-胡晓帆\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 登 录 系 统\n");
	    System.out.println("\t\t   2. 更 改 管 理 员 密 码\n");
	    System.out.println("\t\t   3. 退 出\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字：");
	}
	
	int doMainMenu(){
		//此函数进行菜单选择，并在用户输入不合法值时要求重新输入。最后返回选择的菜单选项
		showMainMenu();
	    int s=sc.nextInt();;
	    while(s>=3||s<1) {
	    	if(s==3) {
	    		
	    		System.out.println("谢谢您的使用！ ");
	    		System.exit(0);	//退出程序
			}
	    	else {
	    		System.out.print("输入有误！请重新选择，输入数字:");
	    	}
	    	s = sc.nextInt();
	    };
		return s;
	}

	void showWorkMenu() {
	    System.out.println("\n\t欢迎使用 MyShopPing 管理系统 @2018010587-胡晓帆\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 客 户 信 息 管 理\n");
	    System.out.println("\t\t   2. 购 物 结 算\n");
	    System.out.println("\t\t   3. 真 情 回 馈\n");
	    System.out.println("\t\t   4. 注 销\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字：");
	}
	
	int doWorkMenu(){
		showWorkMenu();
	    int s=sc.nextInt();;
	    while(s>4||s<1) {
	    	System.out.print("输入有误！请重新选择，输入数字:");
	    	s = sc.nextInt();	
	    };
		return s;
	}
	
	void showCusInfoMenu() {
	    System.out.println("\nMyShopPing管理系统 > 客户信息管理\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 显 示 所 有 客 户 信 息\n");
	    System.out.println("\t\t   2. 添 加 客 户 信 息\n");
	    System.out.println("\t\t   3. 修 改 客 户 信 息\n");
	    System.out.println("\t\t   4. 查 询 客 户 信 息\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字或按'n'返回上一级菜单：");
	}
	
	int doCusInfoMenu(){
		showCusInfoMenu();
	    char s=sc.next().charAt(0);	
	    //因为有输入'n'返回上一级，所以需要用字符
	    while(s>'4'||s<'1') {
	    	if(s=='n')
	    		return 0;
	    	System.out.print("输入有误！请重新选择，输入数字:");
	    	s = sc.next().charAt(0);	
	    };
		return (int)(s-'0');
	}

	
}