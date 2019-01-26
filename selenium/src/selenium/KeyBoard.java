package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoard {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.baidu.com");
		// 	findElement(By by)   接口只有方法的特征，而没有方法的实现
		//Find the first WebElement using the given method.
		WebElement input=driver.findElement(By.id("kw"));
		//输入框输入内容
		input.sendKeys("seleniumm");
		
		//删除多输入的一个m
		input.sendKeys(Keys.BACK_SPACE);
		//输入空格键+“教程”
		input.sendKeys(Keys.SPACE);
		input.sendKeys("教程");
		//ctrl+a全选输入框内容
		input.sendKeys(Keys.CONTROL,"a");
		//ctrl+x剪切输入框内容
		input.sendKeys(Keys.CONTROL,"x");
		//ctrl+v粘贴内容到输入框
		input.sendKeys(Keys.CONTROL,"v");
		//通过回车键盘来代替点击操作
		input.sendKeys(Keys.ENTER);
		//driver.quit();
	}
}
