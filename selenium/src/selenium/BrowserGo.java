package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class BrowserGo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("broserbackandforward.");
		WebDriver driver=new FirefoxDriver();
		String firstUrl="http://www.baidu.com";
	
		System.out.printf("now accesss%s\n",firstUrl);
		driver.get(firstUrl);
		String secondUrl="http://news.baidu.com";
		System.out.printf("now accesss%s\n",secondUrl);
		driver.get(secondUrl);
		System.out.printf("now backto %s\n",firstUrl);
		driver.navigate().back();
		System.out.printf("forward to %s\n",secondUrl);
		driver.navigate().forward();
		driver.navigate().refresh();
		//WebDriver 外部类    Navigation内部类
		driver.quit();
	}

}
