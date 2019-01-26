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

//多线程多节点执行用例 利用testNG框架
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
		
		 System.out.println("参数有错误");
		 
		 String url= nodeUrl + "/wd/hub";
		 URL urlInstance = null;
		 
		 try {
			urlInstance=new URL(url);
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		 System.out.println("实例化url出错，检查一下url格式是否正确，格式为 http://127.0.0.1:4444");
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
		 
		 //GitHub地址：https://github.com/operasoftware/operachromiumdriver  欧朋浏览器驱动的地址
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
*/