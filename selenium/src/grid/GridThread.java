/*package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

//���̶߳�ڵ�ִ������ ����testNG���
public class GridThread {
	private WebDriver dr;
	DesiredCapabilities test;
	String baseUrl;
	@Parameters({"browser","nodeUrl","webSite"})
	@BeforeMethod
	public void setUp(String browser,String nodeUrl,String webSite){
		baseUrl= webSite;
		
		if(browser.equals("ie")) 
			test = DesiredCapabilities.internetExplorer();
		else if(browser.equals("ff"))
			test = DesiredCapabilities.firefox();
		else if(browser.equals("chrome"));
		test = DesiredCapabilities.chrome();
		
		 System.out.println("�����д���");
		 
		 String url= nodeUrl + "/wd/hub";
		 URL urlInstance = null;
		 
		 try {
			urlInstance=new URL(url);
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		 System.out.println("ʵ����url�������һ��url��ʽ�Ƿ���ȷ����ʽΪ http://127.0.0.1:4444");
		 dr= new RemoteWebDriver(urlInstance,test);
		 dr.get(webSite);
		 
		 @Test
		 public void  testCase(WebDriver dr){
			 dr.get(baseUrl);
			 dr.findElement(By.id("kw")).sendKeys("selenium");
				dr.findElement(By.id("su")).click();
				Thread.sleep(10000);
				System.out.println("title:"+dr.getTitle());
				
		@AfterMethod
		public void tearDown(){
			dr.close();
				}
				
		 }
		 
		 //GitHub��ַ��https://github.com/operasoftware/operachromiumdriver  ŷ������������ĵ�ַ
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
*/