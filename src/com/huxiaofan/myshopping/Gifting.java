package com.huxiaofan.myshopping;

import com.huxiaofan.myshopping.data.*;
import java.util.*;

public class Gifting {
	
	
	public static void daFangSong(Customer c) {	//�����ֵ�������Ĳ�֪��զ����
		System.out.println("\nMyShopPing����ϵͳ > ������� > ���˴����\n\n");
		System.out.print("������߻��ֵĻ�Ա�ǣ�");
		c.findBestUsers();
		System.out.println("\n��ϲ��������Ʒ�� һ����ֵ��12000.0��ƻ���ʼǱ�����");
		System.out.print("\n�밴'n'������һ���˵���");
	}
	
}
