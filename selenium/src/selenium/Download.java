/**
4.14 �����ļ�
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * @author Administrator
 *
 */
public class Download {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		//���ó�0�������ص������Ĭ������·�������ó�2����Ա��浽ָ��Ŀ¼��
		firefoxProfile.setPreference("browser.download.folderList",2);
		//�Ƿ���ʾ��ʼ��TureΪ��ʾ��FlaseΪ����ʾ��
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",
		false);
//����ָ���������ļ���Ŀ¼
		firefoxProfile.setPreference("browser.download.dir","d:\\java");
		//ָ��Ҫ����ҳ���Content-typeֵ����application/octet-stream��Ϊ�ļ������͡�
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		WebDriver driver=new FirefoxDriver(firefoxProfile);
		
		driver.get("https://pypi.Python.org/pypi/selenium");
		//�����������ģ����ѯ  //NoSuchElementException: Unable to locate element: selenium 3.4.3
		driver.findElement(By.partialLinkText("selenium 3.4.3")).click();
	}

}
