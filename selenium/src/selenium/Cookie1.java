/**
4.15 操作Cookie
 * 
 */
package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 *WebDriver操作cookie的方法：：
 getCookies() 获得所有cookie信息。
 getCookieNamed(Stringname) 返回字典的key为“name”的cookie信息。
 addCookie(cookiedict) 添加cookie。“cookie_dict”指字典对象，必须有name和value值。
 deleteCookieNamed(Stringname) 删除cookie信息。“name”是要删除的cookie的名称；
“optionsString”是该cookie的选项，目前支持的选项包括“路径”，“域”。
 deleteAllCookies() 删除所有cookie信息。
 */
public class Cookie1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根r
		/*//获取当前浏览器的cookies信息
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.youdao.com/");
		Thread.sleep(3000);
		//获得cookies
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie);
		
		driver.close();
//运行结果
	//	[YOUDAO_MOBILE_ACCESS_TYPE=1; path=/; domain=.youdao.com, ___rl__test__cookies=1497776424693; 
		//path=/; domain=www.youdao.com, JSESSIONID=abcElaE7Jomw06ROxB6Yv; path=/; domain=.youdao.com,
		// OUTFOX_SEARCH_USER_ID=-1712522783@202.109.166.215; path=/; domain=.youdao.com, 
		//OUTFOX_SEARCH_USER_ID_NCOO=1504788046.8191097; path=/; 
		//domain=.youdao.com, DICT_UGC=be3af0da19b5c5e6aa4e17bd8d90b28a|; path=/; domain=.youdao.com]
		//cookie数据以字典形式存放的
		 
*/	
	//往浏览器写入cookies信息
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.youdao.com/");
		Thread.sleep(3000);
		
		Cookie c1=new Cookie("name","key-aaaaaaa");
		Cookie c2=new Cookie("value","value-bbbbbb");
		driver.manage().addCookie(c1);	
		driver.manage().addCookie(c2);
		
		//获得cookies
			Set<Cookie> cookie=driver.manage().getCookies();
		//打印
			System.out.println(cookie);
		//删除cookies
			driver.manage().deleteAllCookies();
			driver.close();
	}

}
