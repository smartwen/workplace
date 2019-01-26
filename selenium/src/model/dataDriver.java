package model;
//数据驱动实际例子
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataDriver {
	//写一个登陆方法
	public static void login(WebDriver driver,String username,String password){
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("dologin")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
	System.out.println("126 mail login:");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.126.com");
	String username="15012800343@126.com";
	String password="admin123LW";
	//调用方法
	login(driver,username,password);
	
	Thread.sleep(5000);
	System.out.println("login success!");
	driver.close();
	
	}

}
