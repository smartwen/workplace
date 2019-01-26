package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoard {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://www.baidu.com");
		// 	findElement(By by)   �ӿ�ֻ�з�������������û�з�����ʵ��
		//Find the first WebElement using the given method.
		WebElement input=driver.findElement(By.id("kw"));
		//�������������
		input.sendKeys("seleniumm");
		
		//ɾ���������һ��m
		input.sendKeys(Keys.BACK_SPACE);
		//����ո��+���̡̳�
		input.sendKeys(Keys.SPACE);
		input.sendKeys("�̳�");
		//ctrl+aȫѡ���������
		input.sendKeys(Keys.CONTROL,"a");
		//ctrl+x�������������
		input.sendKeys(Keys.CONTROL,"x");
		//ctrl+vճ�����ݵ������
		input.sendKeys(Keys.CONTROL,"v");
		//ͨ���س�����������������
		input.sendKeys(Keys.ENTER);
		//driver.quit();
	}
}
