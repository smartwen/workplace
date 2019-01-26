/**
HTML5������һ���µ�Ԫ��<video>
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 *
 */
public class Video {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://videojs.com/");
		WebElement video=driver.findElement(By.xpath("//body/section/div/video"));
		
	/*	JavaScript �����и����õĶ������arguments��argument��������˺������õĲ������飬[0]��ʾȡ����
		�ĵ�1��ֵ��
		currentSrc��Ϥ���ص�ǰ��Ƶ/��Ƶ��URL�����δ������Ƶ/��Ƶ���򷵻ؿ��ַ�����
		load()��play()��pause()�ȿ�������Ƶ�ļ��ء����ź���ͣ��*/
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//�����Ƶ��URL
		jse.executeScript("return argument[0].currentSrc:", video);
		//������Ƶ ����15����
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(15000);
		
		//��ͣ��Ƶ 
		jse.executeScript("arguments[0].pause()",video);
		driver.quit();
	}

}
