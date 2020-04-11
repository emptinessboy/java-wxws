package com.huxiaofan.myshopping;
import java.util.Scanner;

public class Verify {
	
	//����������֤�û������Ƿ�Ϸ�
	
	static Scanner sc = new Scanner(System.in);
	
	//�������Ϊ�˵�����
	static int inputVerifyWithN(int num) {
		//����0���ʾѡ����'n'�����෵��1��2��3��4
		String s = sc.nextLine();
		while (s.length()!=1) {
			System.out.print("������������������Ŷ��");
	    	s = sc.nextLine();
		}
	    char c=(char) s.charAt(0);
	    //��Ϊ������'n'������һ����������Ҫ���ַ�
	    while( c> (char)(num+'0') || c<'1') {
	    	if(c=='n')
	    		return 0;
	    	System.out.print("������������������Ŷ��");
	    	s = sc.nextLine();
	    	c=(char) s.charAt(0);
	    }
		return (int)(c-'0');
	}
	
	static int inputVerify(int num) {	//��֤�����Ƿ���ȷ�ķ���
		
		int n=0;
		while(n==0) {
			String s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
				if(n>num||n<1) {
					System.out.print("�����������������룺");
				}
			} catch (Exception e) {
				System.out.print("�����������������룺");
				// TODO: handle exception
			}
		}
		return n;
	}

}
