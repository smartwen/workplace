package selenium;
/****
 * 定位一组元素 findElements
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
		/*// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
			File file=new File("file:///F:/学习资料/html/checkbox.html");
			String filePath=file.getAbsolutePath();
			driver.get(filePath);
	//	找到一组标签名为input的元素	
List<WebElement> inputs=driver.findElements(By.tagName("input"));
//for循环进行遍历
		for(WebElement checkbox:inputs){
			//获取元素的type属性是否为"checkbox"
			String type=new String(checkbox.getAttribute("type"));
			if(type.equals("checkbox")){
				checkbox.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}	
			
		driver.quit();
	*/
/*****
 * 使用XPath或CSS来直接判断属性值，从而进行单击操作。
*/
		String baseUrl;
		WebDriver driver=new FirefoxDriver();
	baseUrl="file:///F:/studyBook/html/";
		//File file=new File("baseUrl/checkbox.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String filePath=file.getAbsolutePath();
		//此次研究了一个小时 获取文件的路径 坑啊 
		driver.get(baseUrl+"checkbox.html");
		//通过css找到一组元素
		List<WebElement> checkboxs=driver.findElements(By.cssSelector("input[type=checkbox]"));
		
		//通过xpath找到一组元素
		List<WebElement>checkboxes=
		driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:checkboxs){
			checkbox.click();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//刷新
		driver.navigate().refresh();
		
		//把页面上最后1个checkbox的勾给去掉
		List<WebElement>allCheckboxes=
		driver.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println(allCheckboxes.size());
		allCheckboxes.get(allCheckboxes.size()-1).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		driver.close();
		
	}

}
//  
