package ATM;
//ʵ���˻��� 
public class Account {
	private String name;//����
	private String id;//�˺�
	private String password;//����
	private double balance;//���
	@Override  
	public String toString()
	{
		return "����: "+this.name+"\n�˺�: "+this.getId()+"\n����: "+this.getPassword()+"\n��"+this.getBalance();
	}
	
	public Account()
	{
		init();
	}
	//�˻����ʼ��
	public void init()
	{
		this.name="������";
		this.id="";
		this.password="888888";
		this.balance=0.0;
		for(int i=0;i<6;i++)
		{
			int temp=(int) (Math.random()*100)%10;//����0-9�������
			id+=temp;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
