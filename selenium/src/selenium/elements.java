package selenium;
/****
 * ��λһ��Ԫ�� findElements
 */
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elements {

	public static void main(String[] args) {
		/*// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
			File file=new File("file:///F:/ѧϰ����/html/checkbox.html");
			String filePath=file.getAbsolutePath();
			driver.get(filePath);
	//	�ҵ�һ���ǩ��Ϊinput��Ԫ��	
List<WebElement> inputs=driver.findElements(By.tagName("input"));
//forѭ�����б���
		for(WebElement checkbox:inputs){
			//��ȡԪ�ص�type�����Ƿ�Ϊ"checkbox"
			String type=new String(checkbox.getAttribute("type"));
			if(type.equals("checkbox")){
				checkbox.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}	
			
		driver.quit();
	*/
/*****
 * ʹ��XPath��CSS��ֱ���ж�����ֵ���Ӷ����е���������
*/
		String baseUrl;
		WebDriver driver=new FirefoxDriver();
	baseUrl="file:///F:/studyBook/html/";
		//File file=new File("baseUrl/checkbox.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String filePath=file.getAbsolutePath();
		//�˴��о���һ��Сʱ ��ȡ�ļ���·�� �Ӱ� 
		driver.get(baseUrl+"checkbox.html");
		//ͨ��css�ҵ�һ��Ԫ��
		List<WebElement> checkboxs=driver.findElements(By.cssSelector("input[type=checkbox]"));
		
		//ͨ��xpath�ҵ�һ��Ԫ��
		List<WebElement>checkboxes=
		driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:checkboxs){
			checkbox.click();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//ˢ��
		driver.navigate().refresh();
		
		//��ҳ�������1��checkbox�Ĺ���ȥ��
		List<WebElement>allCheckboxes=
		driver.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println(allCheckboxes.size());
		allCheckboxes.get(allCheckboxes.size()-1).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		driver.close();
		
	}

}
//  
