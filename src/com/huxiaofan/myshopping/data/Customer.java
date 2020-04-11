package com.huxiaofan.myshopping.data;

import java.util.Scanner;

public final class Customer {
	
	private Scanner sc=new Scanner(System.in);
	//��ά�����Ż�Ա��Ϣ�����зֱ��Ż�Ա�ţ����պͻ��֡�
	private String[][] users=new String[200][3];
	private int index = -1;	//���������������ڵ��û���
	
	public Customer(){
		//��ʼ�������Դ��û�
		this.add("1111","06/05","8888");
		this.add("2222","06/06","9999");
		this.add("3333","06/01","5555");
	}
	
	public void doShow() {
		System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ���� > ��ʾ�ͻ���Ϣ\n");
		System.out.println("\n��Ա��\t\t����\t\t����");
		System.out.println("-----------|-------------|------------");
		for(int i=0;i<=index;i++) {
			for(int j=0;j<3;j++)
				System.out.print(users[i][j]+"\t\t");
			System.out.println("\t");
		}
		System.out.print("\n�밴'n'������һ���˵���");
	}
	
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
		String id = fourInt();
		String birth = inPutBirth();
		String num = jifenInt();
		if(add(id,birth,num)) {	//���if���жϷ�����û�б���
			System.out.println("�»�Ա��ӳɹ���\n������ӻ�Ա�𣿣�y/n��");
			if(sc.next().charAt(0)=='y')
				doAdd();
			else {
				System.out.print("\n�밴'n'������һ���˵���");
				return;
			}
		}
		else {
			System.out.println("����������ʧ�ܣ�\n������ӻ�Ա�𣿣�y/n��");
			if(sc.next().charAt(0)=='y')
				doAdd();
			else {
				System.out.print("\n�밴'n'������һ���˵���");
				return;
			}
		}
	}
	
	private String inPutBirth() {	//���벢�ж�����
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		String birth = sc.nextLine();
		try {
			//try catch ��ֹ������ַ�������ת����������ɳ������
			String[] c = birth.split("/"); 	// �ָ��ַ���b������c
			if (Integer.parseInt(c[0])<=0 || Integer.parseInt(c[0])>12 || Integer.parseInt(c[1])<=0 || Integer.parseInt(c[1])>31) {
				System.out.println("���ղ��Ϸ�����Ҫ�������룡");
				inPutBirth();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ղ��Ϸ�����Ҫ�������룡");
			inPutBirth();
		}
		return birth;
	}
	
	private String fourInt() {	//�ж�4λ����
		System.out.print("�������Ա��(<4λ����>)��");
		String num = sc.nextLine();
		try {
			//try catch ��ֹ������ַ�������ת����������ɳ������
			int n = Integer.parseInt(num);
			if(1000>n||n>9999) {
				System.out.println("������Ĳ���4λ���������������룡�����ڵ���1000��С�ڵ���9999��");
				fourInt();
			}
		} catch (Exception e) {
			System.out.println("������Ĳ���4λ���������������룡�����ڵ���1000��С�ڵ���9999��");
			fourInt();
			// TODO: handle exception
		}
		return num;
	}
	
	private String jifenInt() {	//�ж�4λ����
		System.out.print("��������֣�");
		String num = sc.nextLine();
		try {
			int n = Integer.parseInt(num);
			if(n<0||n>999999) {
				System.out.println("���ֳ�����Χ�����������룡");
				jifenInt();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����쳣�����������룡");
			jifenInt();
		}
		return num;
	}
	

	
}
