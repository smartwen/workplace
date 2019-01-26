package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//for循环遍历常用的浏览器，同一脚本在不同的浏览器上运行
public class Grid02 {
	private static WebDriver driver;
	private static DesiredCapabilities browser;
	
	public static void runBaiduTest(WebDriver driver){
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		
		driver.close();
	}
	
	public static void main(String[] args) throws MalformedURLException {
		String [] browsers;
		browsers = new String[3];
		browsers[0]="ff";
		browsers[1]="ie";
		browsers[2]="chrome";
		for(int i=0;i<3;i++){
			System.out.println(browsers[i]);
			if(browsers[i].equals("ie")) 
				browser = DesiredCapabilities.internetExplorer();
			else if(browsers[i].equals("ff"))
				browser = DesiredCapabilities.firefox();
			else if(browsers[i].equals("chrome"));
			browser = DesiredCapabilities.chrome();
			
			 System.out.println("参数有错误");
			WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),browser);
			runBaiduTest(driver);
		}
	}
}
