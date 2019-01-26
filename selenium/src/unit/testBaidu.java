package unit;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.junit.*;
import static org.junit.Assert.*;
public class testBaidu {
	private WebDriver driver;
	private String baseUrl=("http://www.baidu.com");
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
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys("juint");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		assertEquals(title,"juint-°Ù¶ÈËÑË÷");
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
