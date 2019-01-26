/**
4.14 下载文件
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
		// TODO 自动生成的方法存根
		FirefoxProfile firefoxProfile=new FirefoxProfile();
		//设置成0代表下载到浏览器默认下载路径，设置成2则可以保存到指定目录。
		firefoxProfile.setPreference("browser.download.folderList",2);
		//是否显示开始；Ture为显示，Flase为不显示。
		firefoxProfile.setPreference("browser.download.manager.showWhenStarting",
		false);
//用于指定所下载文件的目录
		firefoxProfile.setPreference("browser.download.dir","d:\\java");
		//指定要下载页面的Content-type值，“application/octet-stream”为文件的类型。
		firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		WebDriver driver=new FirefoxDriver(firefoxProfile);
		
		driver.get("https://pypi.Python.org/pypi/selenium");
		//这个方法就是模糊查询  //NoSuchElementException: Unable to locate element: selenium 3.4.3
		driver.findElement(By.partialLinkText("selenium 3.4.3")).click();
	}

}
