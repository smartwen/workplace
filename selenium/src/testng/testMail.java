package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
/*�����Բ���
TestNG����dependsOnMethods������Ӧ�Բ��������Եı�����*/
public class testMail {

	//��½����
	public void login(WebDriver driver,String username,String password){
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testingwtb");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("a123456");
		driver.findElement(By.id("dologin")).click();
	}
	//�˳�����
	public void logout(WebDriver driver){
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("�˳�")).click();
		
	}
	
	@Test
	public void verfyLogin(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String baseUrl = "http://126.com";
		driver.get(baseUrl + "/");
		String username="testingwtb";
		String password = "a123456";
		login(driver,username,password);
		String text=driver.findElement(By.id("dologin")).getText();
		assertEquals(text,"testingwtb@126.com");
		logout(driver);
		driver.close();
		
	}
	@Test (dependsOnMethods = {"verfyLogin"})
	public void verfySearch(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String baseUrl = "http://126.com";
		driver.get(baseUrl + "/");
		String username="testingwtb";
		String password = "a123456";
		login(driver,username,password);
		
		WebElement search = driver.findElement(By.xpath("//input[@class='nui-ipt-input'and @type='text']"));
		search.sendKeys("С��");
		search.sendKeys(Keys.ENTER);
		String text=driver.findElement(By.className("nui-title-text")).getText();
		System.out.println(text);
		assertEquals(text,"�������");
		logout(driver);
		driver.quit();
		
		//���Բ��� ����������ִ��
		//@Test(enabled=false)
/*		public void verfyLogin(){
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			String baseUrl = "http://126.com";
			driver.get(baseUrl + "/");
			String username="testingwtb";
			String password = "a123456";
			login(driver,username,password);
			String text=driver.findElement(By.id("dologin")).getText();
			assertEquals(text,"testingwtb@126.com");
			logout(driver);
			driver.close();
			
		}*/
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
