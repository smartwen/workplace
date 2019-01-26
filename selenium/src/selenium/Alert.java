package selenium;

/**
 * 4.11 �������
 * ��ʱ����ЩԪ�ز����������������Ĳ��������ʱ����Խ���selenium�ṩ��Actions�࣬������ģ�����ͼ��̵�һЩ������
 * ����������Ҽ���������ƶ����Ȳ�����������Щ������ʹ��perform()��������ִ�С�
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//�����ͣ�ࡰ���á�����
		Actions action=new Actions(driver);
		//Ԫ�ض�λ����  �쳣
		action.clickAndHold(driver.findElement(By.id("s_usersetting_top"))).perform();
		//action.moveToElement(driver.findElement(By.linkText("����"))).click();
		//����������

		driver.findElement(By.linkText("��������")).click();
		Thread.sleep(2000);
		//��������
		driver.findElement(By.className("prefpanelgo")).click();
		Thread.sleep(2000);
		//���յ���
		driver.switchTo().alert().accept();
		driver.quit();
			
	}

}
