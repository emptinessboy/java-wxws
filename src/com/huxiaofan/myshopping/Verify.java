package com.huxiaofan.myshopping;
import java.util.Scanner;

public class Verify {
	
	//此类用来验证用户输入是否合法
	
	static Scanner sc = new Scanner(System.in);
	
	//输入参数为菜单长度
	static int inputVerifyWithN(int num) {
		//返回0则表示选中了'n'，其余返回1，2，3，4
		String s = sc.nextLine();
		while (s.length()!=1) {
			System.out.print("输入有误！请重新输入哦：");
	    	s = sc.nextLine();
		}
	    char c=(char) s.charAt(0);
	    //因为有输入'n'返回上一级，所以需要用字符
	    while( c> (char)(num+'0') || c<'1') {
	    	if(c=='n')
	    		return 0;
	    	System.out.print("输入有误！请重新输入哦：");
	    	s = sc.nextLine();
	    	c=(char) s.charAt(0);
	    }
		return (int)(c-'0');
	}
	
	static int inputVerify(int num) {	//验证输入是否正确的方法
		
		int n=0;
		while(n==0) {
			String s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
				if(n>num||n<1) {
					System.out.print("输入有误！请重新输入：");
				}
			} catch (Exception e) {
				System.out.print("输入有误！请重新输入：");
				// TODO: handle exception
			}
		}
		return n;
	}

}
