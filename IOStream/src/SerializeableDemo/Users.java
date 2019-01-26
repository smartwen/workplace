package SerializeableDemo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//验证对象版本一致性
	private String username;
	transient private String password;//transient  拒绝序列化
	private int experience;
	private double money;
	private Date regtime;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "用户名: "+this.getUsername()+"\n密码"+this.getPassword()+"\n经验值"+this.getExperience()+"\n金额"+this.getMoney()+"\n注册时间"+this.getRegtime();
	}
	public Users(String username, String password, int experience, double money, Date regtime) {
		super();
		this.username = username;
		this.password = password;
		this.experience = experience;
		this.money = money;
		this.regtime = regtime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	
	
}
