/**
HTML5定义了一个新的元素<video>
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
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		driver.get("http://videojs.com/");
		WebElement video=driver.findElement(By.xpath("//body/section/div/video"));
		
	/*	JavaScript 函数有个内置的对象叫作arguments。argument对象包含了函数调用的参数数组，[0]表示取对象
		的第1个值。
		currentSrc熟悉返回当前音频/视频的URL。如果未设置音频/视频，则返回空字符串。
		load()、play()、pause()等控制着视频的加载、播放和暂停。*/
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//获得视频的URL
		jse.executeScript("return argument[0].currentSrc:", video);
		//播放视频 播放15秒钟
		jse.executeScript("return arguments[0].play()", video);
		Thread.sleep(15000);
		
		//暂停视频 
		jse.executeScript("arguments[0].pause()",video);
		driver.quit();
	}

}
