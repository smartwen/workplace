package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouDao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.youdao.com");
		driver.findElement(By.id("translateContent")).sendKeys("submit");
		//提交输入的内容
		driver.findElement(By.id("translateContent")).submit();
		//在搜索框输入关键字之后的“回车”操作，就可以通过submit()方法模拟
		
		driver.close();
		
	}

}
