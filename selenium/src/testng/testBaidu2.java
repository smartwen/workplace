package testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//����������  ͨ��testng.xml���ݲ��������Դ���
//�Բ�ͬ����������һ�ݲ������� 
public class testBaidu2 {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass
	public void setUp() throws Exception{
		driver =new FirefoxDriver();
		baseUrl= "http://www.baidu.com/";
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
	@Parameters("test1")//���ò��Է��������
	public void testCase(String test1) throws Exception{
		driver.get(baseUrl + "/");
		
		driver.findElement(By.id("kw")).sendKeys("test1");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		assertEquals(title,test1+"_�ٶ�����");
	}
	
	@AfterClass
	public void tearDown() throws Exception{
		driver.quit();
	}
}
