/**
�������װ�ã����뵥�����ļ��У��������������е���
 * 
 */
package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Administrator
 *
 */
public class publicModel {

	/**
	 * @param args
	 */
	//��½����
	public static void login(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testingwtb");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("a123456");
		driver.findElement(By.id("dologin")).click();
	}
	//�˳�����
	public static void logout(WebDriver driver){
		driver.switchTo().defaultContent();   //��frame�л�����ҳ��
		driver.findElement(By.linkText("�˳�")).click();
	}

}
