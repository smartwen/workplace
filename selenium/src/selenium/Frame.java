/**
 * WebDriverֻ����һ��ҳ���϶�Ԫ��ʶ����
��λ������frame/iframe����Ƕҳ���ϵ�Ԫ���޷�ֱ�Ӷ�λ����ʱ����Ҫͨ��switchTo().frame()��������ǰ��
λ�������л�Ϊframe/iframe������Ƕҳ���� �ҵ�<iframe>��ǩ��Ȼ���ڶ�λ�ٶ������
	�е���½ҳ��������frame�ṹ
 */
package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author liuwen
 * Time 2017-06-17
 * weather ����
 *
 */
public class Frame {

	/**
	 * @param args
	 */
	private static String baseUrl;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		baseUrl="file:///F:/studyBook/html/";
		WebDriver driver=new FirefoxDriver();

		driver.get(baseUrl+"frame.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//�л�����frame  id=if
		driver.switchTo().frame("if");
		
		//ʹ��xpath��λ��iframe
		//WebElement xf = driver.findElement(By.xpath("//iframe[@id='if']"));
		//driver.switchTo().frame(xf);
		
		driver.findElement(By.id("kw")).sendKeys("webdriver");
		driver.findElement(By.id("su")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
