package selenium;
/***********************
 * ˵��timeout����  ����ʹ��
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOut {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		//������س�ʱʱ��Ϊ5S
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.get("http://www.baidu.com/");
		//��λ����ʱ��10s��ʱ��,���10s�ڻ���λ�������׳��쳣
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("kw33")).sendKeys("selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//�첽�ű��ĳ�ʱʱ�����ó�3s
		driver.manage().timeouts().setScriptTimeout(3,TimeUnit.SECONDS);
	}

}
