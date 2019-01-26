package selenium;

/**
 * 4.11 警告框处理
 * 有时候有些元素不便点击或者做其他的操作，这个时候可以借助selenium提供的Actions类，它可以模拟鼠标和键盘的一些操作，
 * 比如点击鼠标右键，左键，移动鼠标等操作。对于这些操作，使用perform()方法进行执行。
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//鼠标悬停相“设置”链接
		Actions action=new Actions(driver);
		//元素定位不到  异常
		action.clickAndHold(driver.findElement(By.id("s_usersetting_top"))).perform();
		//action.moveToElement(driver.findElement(By.linkText("设置"))).click();
		//打开搜索设置

		driver.findElement(By.linkText("搜索设置")).click();
		Thread.sleep(2000);
		//保存设置
		driver.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		//接收弹窗
		driver.switchTo().alert().accept();
		driver.quit();
			
	}

}
