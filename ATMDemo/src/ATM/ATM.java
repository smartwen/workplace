package ATM;

import java.util.Scanner;

public class ATM {
	public static Scanner in=new Scanner(System.in);
	public static int choice;
	private static Account account;
	
	//��ʾ���˵�
	public static void showMenu()
	{
		System.out.println("*****��ӭ������������ATMϵͳ******");
		System.out.println("\t1.����");
		System.out.println("\t2.��ѯ���");
		System.out.println("\t3.���");
		System.out.println("\t4.ȡ��");
		System.out.println("\t5.�޸�����");
		System.out.println("\t6.�˳�");
		System.out.println("��ѡ��");
		choice=in.nextInt();
	}
	//��������
	public static void initAccount()
	{
		account=new Account();
		System.out.println("�����ɹ� �������㿪������Ϣ");
		System.out.println(account);//����toString
	}
	//��ѯ����
	public static void showBalance()
	{
		System.out.println(account.getBalance());
	}
	//���ķ���
	public static boolean addBalance(int number)
	{
		try {
			if(number<0)
			{
				throw new ATMException("����Ϊ����");
				
			}else
			{
				account.setBalance(account.getBalance()+number);
				System.out.println("���ɹ�");
				return true;
			}
		} catch (ATMException e) {
			e.printStackTrace();
			return false;
		}
	}
	//ȡ��ķ���
	public static boolean reduceBalance(int number)
	{
		try {
			if(number<=0)
			{
				throw new ATMException("ȡ�����Ϊ����");
				
			}else if(number>account.getBalance())
			{
				throw new ATMException("�˻�����");
			}else 
			{
				account.setBalance(account.getBalance()-number);
				System.out.println("ȡ��ɹ�");
				return true;
			}
		} catch (ATMException e) {
			e.printStackTrace();
			return false;
		}
	}
	//������֤����
	public static boolean passVerifty(String pass)
	{
		try {
			if(pass.equals("")||pass==null)
			{
				throw new ATMException("���벻��Ϊ��");
			}else if(!pass.equals(account.getPassword()))
			{
				throw new ATMException("������֤ʧ��");
			}else
			{
				System.out.println("������֤�ɹ�");
				return true;
			}
		} catch (ATMException ex) {
			//e.printStackTrace();
			System.out.println(ex);
			return false;
		}
			
	}
	//�޸����뷽��
	public static boolean changePass(String pass)
	{
		try {
			if(pass.equals("")||pass.trim()==null)
			{
				throw new ATMException("���벻��Ϊ��");
			}else if(pass.length()!=6)
			{
				throw new ATMException("���볤�Ȳ�������6λ");
			}else
			{
				account.setPassword(pass);
				System.out.println("�����޸ĳɹ�");
				return true;
			}
		} catch (ATMException e) {
			//e.printStackTrace();
			System.out.println(e);
			return false;
		}
	}
	public static void main(String[] args) {
		ATM.showMenu();
		do {
			if(choice==6)
			{
				break;
			}
			switch(choice)
			{
			case 1:
				ATM.initAccount();
				break;
			case 2:
				ATM.showBalance();
				break;
			case 3:
				System.out.println("���������");
				int number=in.nextInt();
				ATM.addBalance(number);
				break;
			case 4:
				System.out.println("������ȡ���");
				int reduceNumber=in.nextInt();
				ATM.reduceBalance(reduceNumber);
				break;
			case 5:
				System.out.println("������ԭ������");
				String pass=in.next();
				if(ATM.passVerifty(pass))
				{
					System.out.println("�����������룺");
					 pass=in.next();
					ATM.changePass(pass);
				}
				break;
			}			
		ATM.showMenu();//�û�ѡ������ٴ�ѡ��
		}while(choice!=6);
		System.out.println("��л���ʹ�� ����ӯATMϵͳ");
	}
}
