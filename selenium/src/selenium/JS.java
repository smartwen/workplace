/**
4.16 ����JavaScript
JavaScript�����ò�����������������������Ĳ�����
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 *
 */
public class JS {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(700,600));
		driver.get("http://www.baidu.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("kw")).sendKeys("selenium api");
		driver.findElement(By.id("su")).click();
		
		//��ҳ��������ϵ��ײ�  ���ڵ�����������js����  window,scrollTo(0,450)
		((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450);");
		System.out.println("end");
		
		driver.close();
		
/*		����
		Stringtext="inputtext";
		Stringjs="varsum=document.getElementById('id');sum.value='"+text+"';";
		((JavascriptExecutor)driver).executeScript(js);
		����*/
	}

}
