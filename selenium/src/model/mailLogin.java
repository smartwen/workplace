package model;

//ģ�黯����ʵ��  �ظ��Ĳ��������ɹ���ģ��
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import model.publicModel; //�����

public class mailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.126.com");
		
		publicModel.login(driver);
		
		Thread.sleep(5000);
		System.out.println("login success");
		
		publicModel.logout(driver);
		driver.quit();
	}
}
