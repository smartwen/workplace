package mail.test.page;
//page �㽫�� ������ ������װ��һ�������� ����publicȥ����
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	private static WebElement element= null;
	//WebDriver driver=new FirefoxDriver();
	public static WebElement login_userName(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		element = driver.findElement(By.name("emal"));
		return element;
	}
	public static WebElement login_passWord(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement login_button(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		element = driver.findElement(By.id("dologin"));
		return element;
	}
	public static WebElement login_user(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		element = driver.findElement(By.id("spnUid"));
		return element;
	}
	public static WebElement logout_button(WebDriver driver){
		driver.switchTo().frame("x-URS-iframe");
		element =driver.findElement(By.linkText("�˳�"));
				return element;
	}
	//��Ӵ�����ʾ��Ϣ��Ԫ�ض�λ
	public static WebElement login_Error_Hint(WebDriver driver){
		element = driver.findElement(By.xpath("//div[@class='error-tt']/p"));
		return element;
	}
	/*driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys("testingwtb");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("a123456");
	driver.findElement(By.id("dologin")).click();
	
	
	//��frame���л������棬�е�frame�����ǲ��ܼ������������棬���ʱ���������������棬����Ҫ�л�������
			driver.switchTo().defaultContent();*/
}
