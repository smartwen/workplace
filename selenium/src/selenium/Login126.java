package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login126 {
	public static void main(String[] args){
		System.out.println("126 mail login");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://126.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("auto-id-1497153851660")).clear();
		driver.findElement(By.id("auto-id-1497153851660")).sendKeys("email");
		
		driver.findElement(By.id("auto-id-1497153851663")).clear();
		driver.findElement(By.id("auto-id-1497153851663")).sendKeys("password");
		driver.findElement(By.id("dologin")).click();
		
	//不知如何快速定位 id定位方式定位失败
		driver.quit();
	}
}
