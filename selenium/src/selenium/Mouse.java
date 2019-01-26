package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		/*// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yunpan.360.cn/");
	
		//鼠标右键点击指定的元素
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.id("su"))).perform();*/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//鼠标悬停
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("设置"))).perform();
		
	}

}
