package unit;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.*;
//导出junit测试自动化测试脚本
public class Webdriver {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verficationErrors = new StringBuffer();
	
@Before//注释的方法会在每个用例执行前进行
//测试前环境的搭建以及准备setUp() 初始化工作的开展
public void setUp() throws Exception{
	driver =new FirefoxDriver();
	baseUrl="http://www.baidu.com";
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
@Test
public void testWebdriver() throws Exception{
	driver.get(baseUrl + "/");
	driver.findElement(By.id("kw")).clear();
	driver.findElement(By.id("kw")).sendKeys("selenium");
	driver.findElement(By.id("su")).click();

}

@After  //tearDown()是对测试环境清理工作 在setUp()方法中定义了verificationErrors为空字符串
public void tearDown() throws Exception{
	String verficationErrorString =verficationErrors.toString();
	if(!"".equals(verficationErrorString)){
		fail(verficationErrorString);
	}	
	
}

//查找页面元素是否存在
private boolean isElementPresent(By by){
	try {
		driver.findElement(by);
		return true;
	} catch (NoSuchElementException e) { 
		// TODO 自动生成的 catch 块
		return false;
	}
}
//判断当前页面是否存在警告框
private boolean isAlertPresent(){
	try{
		driver.switchTo().alert();
		return true;
	}catch(NoAlertPresentException e){
		return false;
	}
}
//关闭警告并获得警告信息
private String closeAlertAndGetItsText(){
	try{
		Alert alert= driver.switchTo().alert();
		String alertText = alert.getText();
		if(acceptNextAlert){
			alert.accept();
		}else{}
			alert.dismiss();
		
		return alertText;
	}finally{
		acceptNextAlert = true;
	}

}

}
