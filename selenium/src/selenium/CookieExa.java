/**
通过向浏览器中添加cookie可以绕过登录的验证码，这是比较有意思的一种解决方案
记录Cookie
 * 
 */
package selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 *
 */
public class CookieExa {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		WebDriver dr=new FirefoxDriver();
		String url="http://www.baidu.com";
		System.out.printf("nowaccesss%s\n",url);
		dr.get(url);
		Thread.sleep(2000);
		System.out.println(dr.manage().getCookies());
		dr.manage().deleteAllCookies();
		Cookie c1=new Cookie("BAIDUID","xxxxxxxxxx");
		Cookie c2=new Cookie("BDUSS","xxxxxxxxxx");
		dr.manage().addCookie(c1);
		dr.manage().addCookie(c2);
		System.out.println("browserwillbeclose");
		dr.quit();
		
	/*	这种方式最大的问题是如何从浏览器的cookie中找到用户名和密码对应的key值，并传输入对应的登录信
		息。可以用getCookies()方法来获取登录的所有的cookie信息，从中找到用户名和密码的key。当然，更直接的
		方式是询问开发人员。
*/
		
/*		
		1、熟练掌握xpath\CSS定位的使用，这样在遇到各种难以定位的问题时才不会变得束手无策。
		2、准备一份WebDriverAPI文档，以便随时查阅WebDriver所提供的方法。
		3、学习掌握JavaScript、jQuery技术，它可以让我们使用该技术去操作Web页面。*/
	}

}
