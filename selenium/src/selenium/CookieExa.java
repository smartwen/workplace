/**
ͨ��������������cookie�����ƹ���¼����֤�룬���ǱȽ�����˼��һ�ֽ������
��¼Cookie
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
		// TODO �Զ����ɵķ������
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
		
	/*	���ַ�ʽ������������δ��������cookie���ҵ��û����������Ӧ��keyֵ�����������Ӧ�ĵ�¼��
		Ϣ��������getCookies()��������ȡ��¼�����е�cookie��Ϣ�������ҵ��û����������key����Ȼ����ֱ�ӵ�
		��ʽ��ѯ�ʿ�����Ա��
*/
		
/*		
		1����������xpath\CSS��λ��ʹ�ã������������������Զ�λ������ʱ�Ų����������޲ߡ�
		2��׼��һ��WebDriverAPI�ĵ����Ա���ʱ����WebDriver���ṩ�ķ�����
		3��ѧϰ����JavaScript��jQuery������������������ʹ�øü���ȥ����Webҳ�档*/
	}

}
