package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class Baidu {
	public static void main(String[] args){
		System.out.println("start selenium");
		
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Muzzle Firefox\\geckodriver.exe");
		
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//驱动放置的位置
		//System.setProperty("webdriver.firefox.marionette","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().setSize(new Dimension(400,800));
		driver.get("http://www.baidu.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("kw")).sendKeys("seleniumjava");
		driver.findElement(By.id("su")).click();
		
		//driver.close();
	}
}
