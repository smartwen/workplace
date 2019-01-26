package testng;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//通过DataProvider传递参数。
public class mailLogin {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass
	public void setUp() throws Exception{
		driver =new FirefoxDriver();
		baseUrl= "http://www.baidu.com/";
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	//定义对象数组
	@DataProvider(name="user")
	public Object[][] Users(){
	return new Object[][]{
	{"testingwtb","a123456"},
	};
	}
	//调用user数组的值
	@Test(dataProvider="user")
	public void testCase(String username,String password) throws Exception{
	driver.get(baseUrl);
	driver.switchTo().frame("x-URS-iframe");
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("dologin")).click();
	Thread.sleep(2000);
	String text=driver.findElement(By.id("spnUid")).getText();
	assertEquals(text,username+"@126.com");
	}
	
	@AfterClass
	public void tearDown() throws Exception{
		driver.quit();
	}
}
