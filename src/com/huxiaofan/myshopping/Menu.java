package com.huxiaofan.myshopping;

import java.util.Scanner;

public class Menu{
	
	Scanner sc = new Scanner(System.in);
	
	void showMainMenu() {
	    System.out.println("\n\n\t欢迎使用 MyShopPing 管理系统 @2018010587-胡晓帆\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 登 录 系 统\n");
	    System.out.println("\t\t   2. 更 改 管 理 员 密 码\n");
	    System.out.println("\t\t   3. 退 出\n");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字：");
	}
	
	int doMainMenu(){
		//此函数进行菜单选择，并在用户输入不合法值时要求重新输入。最后返回选择的菜单选项
		showMainMenu();
	    int s=Verify.inputVerify(3);
	    if(s==3) {	
	    	System.out.println("谢谢您的使用！ ");
	    	System.exit(0);	//退出程序
		}
		return s;
	}

	void showWorkMenu() {
	    System.out.println("\n\n\t欢迎使用 MyShopPing 管理系统 @2018010587-胡晓帆\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 客 户 信 息 管 理\n");
	    System.out.println("\t\t   2. 购 物 结 算\n");
	    System.out.println("\t\t   3. 真 情 回 馈\n");
	    System.out.println("\t\t   4. 注 销\n");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字：");
	}
	
	int doWorkMenu(){
		showWorkMenu();
		return Verify.inputVerify(4);
	}
	
	void showCusInfoMenu() {
	    System.out.println("\nMyShopPing管理系统 > 客户信息管理\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 显 示 所 有 客 户 信 息\n");
	    System.out.println("\t\t   2. 添 加 客 户 信 息\n");
	    System.out.println("\t\t   3. 修 改 客 户 信 息\n");
	    System.out.println("\t\t   4. 查 询 客 户 信 息\n");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字或按'n'返回上一级菜单：");
	}
	
	int doCusInfoMenu(){
		showCusInfoMenu();
		return Verify.inputVerifyWithN(4);
	}
	
	public static void showModifySwitch() {
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 修 改 会 员 生 日\n");
	    System.out.println("\t\t   2. 修 改 会 员 积 分\n");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字：");
	}
	
	static void showPay() {
		System.out.println("\nMyShopPing管理系统 > 购物结算\n");
	    System.out.println("\n*********************************\n");
	    System.out.println(" 1. addidas 运动鞋");
	    System.out.println(" 2. Kappa 网球裙");
	    System.out.println(" 3. 网球拍");
	    System.out.println(" 4. addidas T恤");
	    System.out.println(" 5. Nike 运动鞋");
	    System.out.println(" 6. Kappa 网球");
	    System.out.println(" 7. Kappa T恤");
	    System.out.println("\n*********************************\n");
	    System.out.print("请输入会员号：");
	}
	
	void showGift() {
	    System.out.println("\nMyShopPing管理系统 > 真情回馈\n");
	    System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.println("\t\t   1. 幸 运 大 放 送\n");
	    System.out.println("\t\t   2. 幸 运 抽 奖\n");
	    System.out.println("\t\t   3. 生 日 问 候\n");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
	    System.out.print("请选择，输入数字或按'n'返回上一级菜单：");
	}
	
	int doGift(){
		showGift();
		return Verify.inputVerifyWithN(3);
	}
	
}