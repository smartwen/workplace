/**
 * WebDriver只能在一个页面上对元素识别与
定位，对于frame/iframe表单内嵌页面上的元素无法直接定位。这时就需要通过switchTo().frame()方法将当前定
位的主体切换为frame/iframe表单的内嵌页面中 找到<iframe>标签，然后在定位百度输入框
	有道登陆页面就是这个frame结构
 */
package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author liuwen
 * Time 2017-06-17
 * weather 下雨
 *
 */
public class Frame {

	/**
	 * @param args
	 */
	private static String baseUrl;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		baseUrl="file:///F:/studyBook/html/";
		WebDriver driver=new FirefoxDriver();

		driver.get(baseUrl+"frame.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//切换到表单frame  id=if
		driver.switchTo().frame("if");
		
		//使用xpath定位到iframe
		//WebElement xf = driver.findElement(By.xpath("//iframe[@id='if']"));
		//driver.switchTo().frame(xf);
		
		driver.findElement(By.id("kw")).sendKeys("webdriver");
		driver.findElement(By.id("su")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
