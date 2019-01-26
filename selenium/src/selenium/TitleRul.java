package selenium;
//获得验证信息
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TitleRul {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://126.com/");
		Thread.sleep(3000);
		
		System.out.println("Beforelogin================");
		//获取当前的title和url
		System.out.printf("titleof current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		
		
		//登录126邮箱
	/*	xpath路径 //*[@id="auto-id-1497186140549"]
		driver.findElement(By.xpath(".//*[@id='auto-id-1489561679556']")); 
		由于126邮箱是嵌套的iframe窗口，由于用户名和密码内嵌在frame里边，
		所以有时通过单独的id/name/xpath还是定位不到此元素，以下两种写法不可用*/
		
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testingwtb");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("a123456");
		driver.findElement(By.id("dologin")).click();
		
		System.out.println("Afterlogin================");
		//获取当前的title和url
		System.out.printf("title of current page is %s\n",driver.getTitle());
		System.out.printf("url of current page is %s\n",driver.getCurrentUrl());
		
		//从frame中切回主界面，切到frame后，我们不能继续操作主界面，这个时候如果想操作主界面，则需要切回主界面
				driver.switchTo().defaultContent();
		//获得登录用户名
		String text=driver.findElement(By.id("spnUid")).getText();
		System.out.println("---------------"+text);
		verifyTextPresent("hbali@126.com",text);
		
		
	}
	public static void verifyTextPresent(String expected,String actual){
		try
		{

		Assert.assertEquals(expected, actual);
		System.out.println("正确打开邮箱，页面显示用户名为"+actual);
		}
		catch (Exception e)
		{
		System.out.println("没有打开126邮箱");
		}
	}
}
