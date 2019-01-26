package model;

//模块化数据实例  重复的操作独立成公共模块
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import model.publicModel; //导入包

public class mailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.126.com");
		
		publicModel.login(driver);
		
		Thread.sleep(5000);
		System.out.println("login success");
		
		publicModel.logout(driver);
		driver.quit();
	}
}
