package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		/*// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yunpan.360.cn/");
	
		//����Ҽ����ָ����Ԫ��
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.id("su"))).perform();*/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		//�����ͣ
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.linkText("����"))).perform();
		
	}

}
