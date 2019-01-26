
/**
 * WebDriver�ṩ��switchTo().window()��������ʵ���ڲ�ͬ�Ĵ���֮���л���
 * ElementNotInteractableException: 
 */
package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author liuwen
 * 16.14
 *
 */
public class windows {

	/**
	 * @param args 
	 * ��ô��ھ�� getWindowHandle
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		Thread.sleep(3000);
		//��õ�ǰ���ڵľ��
		String search_handle=driver.getWindowHandle();
		
		//�򿪰ٶ�ע�ᴰ��
		System.out.println(search_handle);
		driver.findElement(By.linkText("��¼")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("����ע��")).click();
		
		//��ȡ���д��ھ��
		Set<String> handles =driver.getWindowHandles();
		
		//�ж��Ƿ�Ϊע�ᴰ��   ����ע�ᴰ���ϵ�Ԫ��
		for(String handle : handles){
			if(handle.equals(search_handle)==false){
				driver.switchTo().window(handle);
				System.out.println("now register window");
				driver.findElement(By.name("account")).clear();
				driver.findElement(By.name("account")).sendKeys("username");
				driver.findElement(By.name("password")).sendKeys("password");
				Thread.sleep(2000);
				//......
				//�رյ�ǰ����
				driver.close();
			}else{
				driver.switchTo().window(handle);
				System.out.println("now baidu index window");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
			}
		}
		
		//�ж��Ƿ�Ϊ�ٶ���ҳ ��������ҳ�����ϵ�Ԫ��
/*		for(String handle : handles){
			if(handle.equals(search_handle)){
				driver.switchTo().window(handle);
				System.out.println("now baidu index window");
				driver.findElement(By.id("kw")).sendKeys("webdriver");
				driver.findElement(By.id("su")).click();
				Thread.sleep(2000);
			}
		}*/
		
		
	}

}
