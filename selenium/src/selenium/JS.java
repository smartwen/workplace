/**
4.16 调用JavaScript
JavaScript的作用不仅仅体现在浏览器滚动条的操作上
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 *
 */
public class JS {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700,600));
		driver.get("http://www.baidu.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("kw")).sendKeys("selenium api");
		driver.findElement(By.id("su")).click();
		
		//将页面滚动条拖到底部  用于调整滚动条的js代码  window,scrollTo(0,450)
		((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
		System.out.println("end");
		
		driver.close();
		
/*		……
		Stringtext="inputtext";
		Stringjs="varsum=document.getElementById('id');sum.value='"+text+"';";
		((JavascriptExecutor)driver).executeScript(js);
		……*/
	}

}
