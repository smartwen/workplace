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
//����junit�����Զ������Խű�
public class Webdriver {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verficationErrors = new StringBuffer();
	
@Before//ע�͵ķ�������ÿ������ִ��ǰ����
//����ǰ�����Ĵ�Լ�׼��setUp() ��ʼ�������Ŀ�չ
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

@After  //tearDown()�ǶԲ��Ի��������� ��setUp()�����ж�����verificationErrorsΪ���ַ���
public void tearDown() throws Exception{
	String verficationErrorString =verficationErrors.toString();
	if(!"".equals(verficationErrorString)){
		fail(verficationErrorString);
	}	
	
}

//����ҳ��Ԫ���Ƿ����
private boolean isElementPresent(By by){
	try {
		driver.findElement(by);
		return true;
	} catch (NoSuchElementException e) { 
		// TODO �Զ����ɵ� catch ��
		return false;
	}
}
//�жϵ�ǰҳ���Ƿ���ھ����
private boolean isAlertPresent(){
	try{
		driver.switchTo().alert();
		return true;
	}catch(NoAlertPresentException e){
		return false;
	}
}
//�رվ��沢��þ�����Ϣ
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
