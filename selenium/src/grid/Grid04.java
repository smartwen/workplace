package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//修改脚本使其在不同的节点与浏览器上执行
public class Grid04 {
	private static WebDriver driver;
	private static DesiredCapabilities br;
	
	public static void runBaiduTest(WebDriver driver){
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		
		driver.quit();
	}
	
	public static void main(String[] args) throws MalformedURLException {
		HashMap<String,String> config= new HashMap<String,String>();
		config.put("ff", "http://127.0.0.1:4444/wd/hub");
		config.put("firefox", "http://127.0.0.1:4444/wd/hub");
		config.put("chrome", "http://127.0.0.1:4444/wd/hub");
		//采用Iterator遍历hashmap
		Iterator<String> it=config.keySet().iterator();
		while(it.hasNext()){
			//获取字典的key(浏览器）
			String browser=(String)it.next();
			System.out.println(browser);
			//获取字典的节点
			String nodeip=config.get(browser);
			System.out.println(nodeip);
			
			if(browser.equals("ie")) 
				br = DesiredCapabilities.internetExplorer();
			else if(browser.equals("ff"))
				br = DesiredCapabilities.firefox();
			else if(browser.equals("chrome"));
			br = DesiredCapabilities.chrome();
			
			 System.out.println("参数有错误");
			WebDriver driver = new RemoteWebDriver(new URL(nodeip),br);
			runBaiduTest(driver);
		}
	}
}
