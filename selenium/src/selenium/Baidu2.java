package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baidu2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		//获得百度输入框的尺寸
		WebElement size=driver.findElement(By.id("kw"));
		System.out.println(size.getSize());
		//返回百度页面底部备案信息
		WebElement text=driver.findElement(By.id("cp"));
		System.out.println(text.getText());
		//返回元素的属性值，可以是id、name、type或元素拥有的其它任意属性
		WebElement ty=driver.findElement(By.id("kw"));
		System.out.println(ty.getAttribute("type"));
		//返回元素的结果是否可见，返回结果为True或False
		WebElement display=driver.findElement(By.id("kw"));
		System.out.println(display.isDisplayed());
		//介绍一些方法
		driver.quit();
	}

}
