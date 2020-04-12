package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Gifting {
	
	Scanner sc=new Scanner(System.in);
	
	public static void daFangSong(Customer c) {	//大放送这个奇怪的名字真的不知道咋翻译
		System.out.println("\nMyShopPing管理系统 > 真情回馈 > 幸运大放送\n\n");
		System.out.print("具有最高积分的会员是：");
		c.findBestUsers();
		System.out.println("\n恭喜！获赠礼品： 一个价值￥12000.0的苹果笔记本电脑");
		System.out.print("\n请按'n'返回上一级菜单：");
	}
	
	public static void goodLuck(Customer c) {
		System.out.println("\nMyShopPing管理系统 > 真情回馈 > 幸运抽奖\n\n");
		System.out.print("是否开始（y/n）：");
		if(Verify.yesOrNo()) {
			System.out.println("幸运客户获赠MP3，会员号为："+c.randomUser());
		}
		System.out.print("\n\n请按'n'返回上一级菜单：");
	}
	
	public static void happyBirth(Customer c) {
		System.out.println("\nMyShopPing管理系统 > 真情回馈 > 生日问候\n\n");
		System.out.print("是否开始（y/n）：");
		if(Verify.yesOrNo()) {
			System.out.println("幸运客户获赠MP3，会员号为："+c.randomUser());
		}
		System.out.print("\n\n请按'n'返回上一级菜单：");
	}
	
	String inPutDate() {	//输入并判断生日
		System.out.print("请输入今天的日期(月/日<用两位表示>)：");
		String birth = sc.nextLine();
		boolean t = true;
		do {
			try {
				String[] c = birth.split("/"); 	// 分割字符串b到数组c
				if (Integer.parseInt(c[0])<=0 || Integer.parseInt(c[0])>12 || Integer.parseInt(c[1])<=0 || Integer.parseInt(c[1])>31 
						|| c.length!=2 || c[0].length()!=2|| c[1].length()!=2) {
					System.out.println("日期不合法，需要重新输入！");
					System.out.print("请输入今天的日期(月/日<用两位表示>)：");
					birth = sc.nextLine();
				}else
					t=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("日期不合法，需要重新输入！");
				System.out.print("请输入今天的日期(月/日<用两位表示>)：");
				birth = sc.nextLine();
			}
		}while(t);
		return birth;
	}
	
}
