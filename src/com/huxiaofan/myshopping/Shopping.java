package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Shopping {
	static Scanner sc=new Scanner(System.in);
	static void doShopping(Customer c) {
		Menu.showPay();
		String user = sc.nextLine();
		
		int id = c.findId(user);
		double money = 0;
		int jifen = 0;
		int[][] list=new int[7][7];
		do{
			System.out.print("\n请输入商品编号：");
			int shangPin =  Verify.inputVerify(7);
			System.out.print("请输入数目：");
			int number =  Verify.numVerify();
			
			switch(shangPin) {
			case 1:
				money+=880*number;jifen+=300*number;
				list[0][0]+=number;list[0][1]+=880*number;
				break;
			case 2:
				money+=200*number;jifen+=80*number;
				list[1][0]+=number;list[1][1]+=200*number;
				break;
			case 3:
				money+=350*number;jifen+=120*number;
				list[2][0]+=number;list[2][1]=350*number;
				break;
			case 4:
				money+=180*number;jifen+=70*number;
				list[3][0]+=number;list[3][1]=180*number;
				break;
			case 5:
				money+=900*number;jifen+=300*number;
				list[4][0]+=number;list[4][1]=900*number;
				break;
			case 6:
				money+=70*number;jifen+=30*number;
				list[5][0]+=number;list[5][1]=70*number;
				break;
			case 7:
				money+=180*number;jifen+=75*number;
				list[6][0]+=number;list[6][1]=180*number;
				break;
			}
			System.out.print("是否继续（y/n）：");
		}while(Verify.yesOrNo());	//循环添加商品
		money = money*0.85;
		
		genList(list,money,jifen);	//打印购物清单
		
		c.addJIfen(id, jifen);	//购物完成后动态修改积分
		
		System.out.print("\n请'n'返回上一级菜单：");
	}
	
	static void genList(int[][] list,double money,int jifen) {
		System.out.println("\n＊＊＊＊＊＊＊＊＊＊＊＊ 消费清单 ＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("物品\t\t 单价 \t个数\t金额\n");
		
		for(int i=0;i<list.length;i++) {
			if(list[i][0]>0) {
				
				switch(i+1) {
				case 1:
					System.out.println("addidas 运动鞋\t ￥880"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 2:
					System.out.println("Kappa 网球裙\t ￥200"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 3:
					System.out.println("网球拍\t ￥350"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 4:
					System.out.println("addidas T恤\t ￥180"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 5:
					System.out.println("Nike 运动鞋\t ￥900"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 6:
					System.out.println("Kappa 网球\t ￥70"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				case 7:
					System.out.println("Kappa T恤\t ￥180"+"\t "+list[i][0]+"\t￥"+list[i][1]);
					break;
				}
				
			}
		}
		System.out.println("\n折扣：  0.85");
		System.out.printf("金额总计： ￥%.1f\n",money);
		System.out.print("实际交费：  ￥");
		int pay  =  Verify.numVerify();
		while(pay<money) {	//加入付钱判断
			System.out.println("客户给的钱不够，无法交易！");
			System.out.print("请重新输入实际缴费：  ￥");
			pay  =  Verify.numVerify();
		}
		System.out.printf("找钱： ￥%.1f\n",pay-money);
		System.out.println("本次购物所获的积分是：  "+jifen);
	}
}
