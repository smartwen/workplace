
/**
 * WebDriver提供了switchTo().window()方法可以实现在不同的窗口之间切换。
 * ElementNotInteractableException: 
 */
package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author liuwen
 * 16.14
 *
 */
public class windows {

	/**
	 * @param args 
	 * 获得窗口句柄 getWindowHandle
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(3000);
		//获得当前窗口的句柄
		String search_handle=driver.getWindowHandle();
		
		//打开百度注册窗口
		System.out.println(search_handle);
		driver.findElement(By.linkText("登录")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("立即注册")).click();
		
		//获取所有窗口句柄
		Set<String> handles =driver.getWindowHandles();
		
		//判断是否为注册窗口   操作注册窗口上的元素
		for(String handle : handles){
			if(handle.equals(search_handle)==false){
				driver.switchTo().window(handle);
				System.out.println("now register window");
				driver.findElement(By.name("account")).clear();
				driver.findElement(By.name("account")).sendKeys("username");
				driver.findElement(By.name("password")).sendKeys("password");
				Thread.sleep(2000);
				//......
				//关闭当前窗口
				driver.close();
			}else{
				driver.switchTo().window(handle);
				System.out.println("now baidu index window");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
			}
		}
		
		//判断是否为百度首页 并操作首页窗口上的元素
/*		for(String handle : handles){
			if(handle.equals(search_handle)){
				driver.switchTo().window(handle);
				System.out.println("now baidu index window");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
			}
		}*/
		
		
	}

}
