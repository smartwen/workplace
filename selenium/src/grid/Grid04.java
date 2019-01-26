package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//�޸Ľű�ʹ���ڲ�ͬ�Ľڵ����������ִ��
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
		//����Iterator����hashmap
		Iterator<String> it=config.keySet().iterator();
		while(it.hasNext()){
			//��ȡ�ֵ��key(�������
			String browser=(String)it.next();
			System.out.println(browser);
			//��ȡ�ֵ�Ľڵ�
			String nodeip=config.get(browser);
			System.out.println(nodeip);
			
			if(browser.equals("ie")) 
				br = DesiredCapabilities.internetExplorer();
			else if(browser.equals("ff"))
				br = DesiredCapabilities.firefox();
			else if(browser.equals("chrome"));
			br = DesiredCapabilities.chrome();
			
			 System.out.println("�����д���");
			WebDriver driver = new RemoteWebDriver(new URL(nodeip),br);
			runBaiduTest(driver);
		}
	}
}
