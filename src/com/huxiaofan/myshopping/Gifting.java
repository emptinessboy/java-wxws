package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Gifting {
	
	
	public static void daFangSong(Customer c) {	//这个奇怪的名字真的不知道咋翻译
		System.out.println("\nMyShopPing管理系统 > 真情回馈 > 幸运大放送\n\n");
		System.out.print("具有最高积分的会员是：");
		c.findBestUsers();
		System.out.println("\n恭喜！获赠礼品： 一个价值￥12000.0的苹果笔记本电脑");
		System.out.print("\n请按'n'返回上一级菜单：");
	}
	
}
