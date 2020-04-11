package com.huxiaofan.myshopping.data;

import java.util.Scanner;

public final class Customer {
	
	private Scanner sc=new Scanner(System.in);
	//��ά�����Ż�Ա��Ϣ�����зֱ��Ż�Ա�ţ����պͻ��֡�
	private String[][] users=new String[200][3];
	private int index = -1;	//���������������ڵ��û���
	
	
	private boolean add(String id,String birth,String num) {
		try {	//�����û���������뵼�³������
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
		System.out.print("�������Ա��(<4λ����>)��");
		String id = sc.nextLine();
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		String birth = sc.nextLine();
		System.out.print("��������֣�");
		String num = sc.nextLine();
		if(add(id,birth,num))
			System.out.println("�»�Ա��ӳɹ���\n������ӻ�Ա�𣿣�y/n��");
		else
			System.out.println("����������ʧ�ܣ�\n������ӻ�Ա�𣿣�y/n��");
	}
	
	public void doShow() {
		System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ���� > ��ʾ�ͻ���Ϣ\n");
		System.out.println("\n��Ա��\t\t����\t\t����");
		System.out.println("-----------|-------------|------------");
		for(int i=0;i<=index;i++) {
			for(int j=0;j<3;j++)
				System.out.print(users[i][j]+"\t\t");
			System.out.println("\t\n");
		}
		System.out.print("\n�밴'n'������һ���˵���");
	}
	
	
	public Customer(){
		//��ʼ�������Դ��û�
		this.add("0001","06/05","8888");
		this.add("0002","06/06","9999");
		this.add("0003","06/01","5555");
	}
	
}
