package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Gifting {
	
	Scanner sc=new Scanner(System.in);
	
	public static void daFangSong(Customer c) {	//����������ֵ�������Ĳ�֪��զ����
		System.out.println("\nMyShopPing����ϵͳ > ������� > ���˴����\n\n");
		System.out.print("������߻��ֵĻ�Ա�ǣ�");
		c.findBestUsers();
		System.out.println("\n��ϲ��������Ʒ�� һ����ֵ��12000.0��ƻ���ʼǱ�����");
		System.out.print("\n�밴'n'������һ���˵���");
	}
	
	public static void goodLuck(Customer c) {
		System.out.println("\nMyShopPing����ϵͳ > ������� > ���˳齱\n\n");
		System.out.print("�Ƿ�ʼ��y/n����");
		if(Verify.yesOrNo()) {
			System.out.println("���˿ͻ�����MP3����Ա��Ϊ��"+c.randomUser());
		}
		System.out.print("\n\n�밴'n'������һ���˵���");
	}
	
	public static void happyBirth(Customer c) {
		System.out.println("\nMyShopPing����ϵͳ > ������� > �����ʺ�\n\n");
		System.out.print("�Ƿ�ʼ��y/n����");
		if(Verify.yesOrNo()) {
			System.out.println("���˿ͻ�����MP3����Ա��Ϊ��"+c.randomUser());
		}
		System.out.print("\n\n�밴'n'������һ���˵���");
	}
	
	String inPutDate() {	//���벢�ж�����
		System.out.print("��������������(��/��<����λ��ʾ>)��");
		String birth = sc.nextLine();
		boolean t = true;
		do {
			try {
				String[] c = birth.split("/"); 	// �ָ��ַ���b������c
				if (Integer.parseInt(c[0])<=0 || Integer.parseInt(c[0])>12 || Integer.parseInt(c[1])<=0 || Integer.parseInt(c[1])>31 
						|| c.length!=2 || c[0].length()!=2|| c[1].length()!=2) {
					System.out.println("���ڲ��Ϸ�����Ҫ�������룡");
					System.out.print("��������������(��/��<����λ��ʾ>)��");
					birth = sc.nextLine();
				}else
					t=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ڲ��Ϸ�����Ҫ�������룡");
				System.out.print("��������������(��/��<����λ��ʾ>)��");
				birth = sc.nextLine();
			}
		}while(t);
		return birth;
	}
	
}
