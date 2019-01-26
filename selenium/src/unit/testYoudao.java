package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testYoudao {
	private WebDriver driver;
	private String baseUrl=("http://www.youdao.com");
	private StringBuffer verficationErrors=new StringBuffer();
	
	@Before
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		driver.get(baseUrl + "/"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testWebdriver() throws Exception{
		driver.get(baseUrl + "/");
		driver.findElement(By.id("query")).clear();
		driver.findElement(By.id("query")).sendKeys("webDriver");
		driver.findElement(By.id("qb")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		assertEquals(title,"webdriver-ÓÐµÀËÑË÷");
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();
		String verficationErrorStirng = verficationErrors.toString();
		if(!"" .equals(verficationErrorStirng)){
			fail(verficationErrorStirng); //import static org.junit.Assert.*;
		}
	}
}
