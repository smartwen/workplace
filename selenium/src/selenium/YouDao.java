package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouDao {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.youdao.com");
		driver.findElement(By.id("translateContent")).sendKeys("submit");
		//�ύ���������
		driver.findElement(By.id("translateContent")).submit();
		//������������ؼ���֮��ġ��س����������Ϳ���ͨ��submit()����ģ��
		
		driver.close();
		
	}

}
