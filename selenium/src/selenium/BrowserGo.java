package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class BrowserGo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		//WebDriver �ⲿ��    Navigation�ڲ���
		driver.quit();
	}

}
