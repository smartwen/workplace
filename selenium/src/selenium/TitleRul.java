package selenium;
//�����֤��Ϣ
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TitleRul {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://126.com/");
		Thread.sleep(3000);
		
		System.out.println("Beforelogin================");
		//��ȡ��ǰ��title��url
		System.out.printf("titleof current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		
		
		//��¼126����
	/*	xpath·�� //*[@id="auto-id-1497186140549"]
		driver.findElement(By.xpath(".//*[@id='auto-id-1489561679556']")); 
		����126������Ƕ�׵�iframe���ڣ������û�����������Ƕ��frame��ߣ�
		������ʱͨ��������id/name/xpath���Ƕ�λ������Ԫ�أ���������д��������*/
		
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testingwtb");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("a123456");
		driver.findElement(By.id("dologin")).click();
		
		System.out.println("Afterlogin================");
		//��ȡ��ǰ��title��url
		System.out.printf("title of current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		
		//��frame���л������棬�е�frame�����ǲ��ܼ������������棬���ʱ���������������棬����Ҫ�л�������
				driver.switchTo().defaultContent();
		//��õ�¼�û���
		String text=driver.findElement(By.id("spnUid")).getText();
		System.out.println("---------------"+text);
		verifyTextPresent("hbali@126.com",text);
		
		
	}
	public static void verifyTextPresent(String expected,String actual){
		try
		{

		Assert.assertEquals(expected, actual);
		System.out.println("��ȷ�����䣬ҳ����ʾ�û���Ϊ"+actual);
		}
		catch (Exception e)
		{
		System.out.println("û�д�126����");
		}
	}
}
