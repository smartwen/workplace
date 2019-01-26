package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mailLogin {
	private static WebDriver driver = null;
	public static void login(WebDriver driver,String username,String password){
		LoginPage.login_username(driver).sendKeys(username);
		LoginPage.login_password(driver).sendKeys(password);
		LoginPage.login_Button(driver).click();
	}
	
	//main快捷方式：直接输入main 然后 alt+/
	//System.out.println()：直接输入syso 然后 alt+/ 
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.126.com");
			
			login(driver,"username","123456");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		driver.quit();
		System.out.println("test case run end!");
	}
	
}
