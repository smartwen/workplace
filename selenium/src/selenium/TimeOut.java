package selenium;
/***********************
 * 说明timeout方法  几种使用
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOut {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		//界面加载超时时间为5S
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get("http://www.baidu.com/");
		//定位对象时给10s的时间,如果10s内还定位不到则抛出异常
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("kw33")).sendKeys("selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//异步脚本的超时时间设置成3s
		driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);
	}

}
