/**
将步骤封装好，放入单独的文件中，供其他用例进行调用
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
	//登陆方法
	public static void login(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("testingwtb");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("a123456");
		driver.findElement(By.id("dologin")).click();
	}
	//退出方法
	public static void logout(WebDriver driver){
		driver.switchTo().defaultContent();   //从frame切换回主页面
		driver.findElement(By.linkText("退出")).click();
	}

}
