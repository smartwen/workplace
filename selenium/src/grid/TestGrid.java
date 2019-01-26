package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//RemoteWebDriver ����ģʽ����ָ������Զ�̷���������������в���  ������grid��ʵ��
public class TestGrid {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),DesiredCapabilities.firefox());
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		
		driver.close();
	}
}
