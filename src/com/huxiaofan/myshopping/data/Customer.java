package com.huxiaofan.myshopping.data;

import java.util.Scanner;
import com.huxiaofan.myshopping.*;

public final class Customer {
	
	private static Scanner sc=new Scanner(System.in);
	//��ά�����Ż�Ա��Ϣ�����зֱ��Ż�Ա�ţ����պͻ��֡�
	private String[][] users=new String[200][3];
	private int index = -1;	//���������������ڵ��û���
	
	public Customer(){
		//��ʼ�������Դ��û�
		this.add("1111","06/05","8888");
		this.add("2222","06/06","9999");
		this.add("3333","06/01","5555");
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
	
	public void doAdd() {
		System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\n\n");
		String id = fourInt();
		System.out.print("������");
		String birth = inPutBirth();
		System.out.print("������");
		String num = jifenInt();
		boolean r = this.add(id,birth,num);
		if(r) {	//���if���жϷ�����û�б���
			System.out.println("�»�Ա��ӳɹ���\n������ӻ�Ա�𣿣�y/n��");
			if(Verify.yesOrNo())
				doAdd();
			else {
				System.out.print("\n�밴'n'������һ���˵���");
				return;
			}
		}
		else {
			System.out.println("����������ʧ�ܣ�\n������ӻ�Ա�𣿣�y/n��");
			if(Verify.yesOrNo())
				doAdd();
			else {
				System.out.print("\n�밴'n'������һ���˵���");
				return;
			}
		}
	}
	
	public void doModify(int show) {
		//�޸Ļ�Ա����
		if(show==1) {
			System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ���� > �޸Ŀͻ���Ϣ\n\n");
		}
		String u = fourInt();
		int i;
		for(i=0;i<=index;i++) {
			if(u.equals(users[i][0]))
				break;	//�˳�ѭ����ʱ��i��ֵ��������ֵ
		}
		if(i>index) {
			System.out.println("û�������Ա�ţ���Ҫ�������룡");
			doModify(0);
			return;
		}
			
		//������ҵ��Ļ�Ա����Ϣ
		System.out.println("\n��Ա��\t\t����\t\t����");
		System.out.println("-----------|-------------|------------");
		
		for(int j=0;j<3;j++)
			System.out.print(users[i][j]+"\t\t");
		System.out.println("\t");
	
		modify(i);
	}
	
	private void modify(int i) {
	
		Menu.showModifySwitch();	//��ʾ�л��˵�
		
		int s = Verify.inputVerify(2);
		
		switch(s) {
			case 1:
				System.out.print("�޸ĺ��");
				users[i][1]=inPutBirth();
				System.out.println("������Ϣ�Ѹ��ģ�");
				break;
			case 2:
				System.out.print("�޸ĺ�Ļ�Ա");
				users[i][2]=jifenInt();
				System.out.println("��Ա�����Ѹ��ģ�");
			break;
		}
		
		System.out.println("�Ƿ��޸���������(y/n)��");
		if(Verify.yesOrNo())
			modify(i);
		else {
			System.out.print("\n�밴'n'������һ���˵���");
			return;
		}
	}
	
	public void find(int show) {
		//���һ�Ա����
		if(show==1) {
			System.out.println("\nMyShopPing����ϵͳ > �ͻ���Ϣ���� > ��ѯ�ͻ���Ϣ\n\n");
		}

		String u = fourInt();
		int i;
		for(i=0;i<=index;i++) {
			if(u.equals(users[i][0]))
				break;	//�˳�ѭ����ʱ��i��ֵ��������ֵ
		}
		if(i>index) {
			System.out.println("��Ǹ��û�����ѯ�Ļ�Ա��Ϣ��\n");
			System.out.print("Ҫ������ѯ��y/n����");
			if(Verify.yesOrNo()) {
				find(0);
				return;
			}
			else {
				System.out.print("\n�밴'n'������һ���˵���");
				return;
			}
		}
			
		//������ҵ��Ļ�Ա����Ϣ
		System.out.println("\n��Ա��\t\t����\t\t����");
		System.out.println("-----------|-------------|------------");
		
		for(int j=0;j<3;j++)
			System.out.print(users[i][j]+"\t\t");
		System.out.println("\t");
		
		System.out.print("\nҪ������ѯ��y/n����");
		if(Verify.yesOrNo()) {
			find(0);
			return;
		}
		else {
			System.out.print("\n�밴'n'������һ���˵���");
			return;
		}
		
	}
	
	public void addJIfen(int id,int n) {
		//�������ֹ���
		int temp = Integer.parseInt(users[id][2]);
		users[id][2] = String.valueOf(temp+n);
		//��Ϊ���ַ����洢���ֵģ�Ҫת������ܼ�
		
	}
	
	public int findId(String u) {
		//�����û�id����������
		int i;
		do {
			for(i=0;i<=index;i++) {
				if(u.equals(users[i][0]))
				break;	//�˳�ѭ����ʱ��i��ֵ��������ֵ
			}
			if(i>index) {
				System.out.println("��Ǹ���������û�����ѯ�Ļ�Ա��Ϣ��\n");
				System.out.print("��������4λ��Ա�ţ�");
				u = sc.nextLine();
			}
		}while(i>index);
		
		return i;
	}
	
	public int findBestUsers() {
		//���һ��������û�
		int i,max=0;
		
		for(i=1;i<=index;i++) {
			if(Integer.parseInt(users[i][2])>Integer.parseInt(users[max][2])) {
				max=i;
			}
		}
		for(int j=0;j<3;j++)
			System.out.print(users[max][j]+"    ");
		return max;
	}
	
	public String randomUser() {
		return users[(int) ((index+1)*Math.random())][0];
	}
	
	public String inPutBirth() {	//���벢�ж�����
		System.out.print("��Ա���գ���/��<����λ����ʾ>����");
		String birth = sc.nextLine();
		boolean t = true;
		do {
			try {
				String[] c = birth.split("/"); 	// �ָ��ַ���b������c
				if (Integer.parseInt(c[0])<=0 || Integer.parseInt(c[0])>12 || Integer.parseInt(c[1])<=0 || Integer.parseInt(c[1])>31 
						|| c.length!=2 || c[0].length()!=2|| c[1].length()!=2) {
					System.out.println("���ղ��Ϸ�����Ҫ�������룡");
					System.out.print("��Ա���գ���/��<����λ����ʾ>����");
					birth = sc.nextLine();
				}else
					t=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("���ղ��Ϸ�����Ҫ�������룡");
				System.out.print("��Ա���գ���/��<����λ����ʾ>����");
				birth = sc.nextLine();
			}
		}while(t);
		return birth;
	}
	
	 public static String fourInt() {	//�ж�4λ����
		System.out.print("�������Ա��(<4λ����>)��");
		String num = sc.nextLine();
		boolean t = true;
		while(t) {
			try {
				//try catch ��ֹ������ַ�������ת����������ɳ������
				int n = Integer.parseInt(num);
				if(1000>n||n>9999) {
					System.out.println("������Ĳ���4λ���������������룡�����ڵ���1000��С�ڵ���9999��");
					System.out.print("�������Ա��(<4λ����>)��");
					num = sc.nextLine();
				}
				else {
					t = false;
				}
			} catch (Exception e) {
				System.out.println("������Ĳ���4λ���������������룡�����ڵ���1000��С�ڵ���9999��");
				System.out.print("�������Ա��(<4λ����>)��");
				num = sc.nextLine();
				// TODO: handle exception
			}
		}
		return num;
	}
	
	 public String jifenInt() {	//�ж�4λ����
		System.out.print("���֣�");
		String num = sc.nextLine();
		boolean t = true;
		do {
			try {
				int n = Integer.parseInt(num);
				if(n<0||n>999999) {
					System.out.println("���ֳ�����Χ�����������룡");
					System.out.print("������֣�");
					num = sc.nextLine();
				}
				else {
					t=false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("�����쳣�����������룡");
				System.out.print("������֣�");
				num = sc.nextLine();
			}
		}while(t);

		return num;
	}
	
}
