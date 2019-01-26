package pom;
//PagetObject实例
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* 减少代码的重复。
 提高测试用例的可读性。
 提高测试用例的可维护性，特别是针对UI频繁变化的项目。
我们可以将一个page对象封装成
一个HTML页面，可以通过提供的应用程序特定的API来操作页面元素，而不在HTML中四处搜寻。
*/
public class LoginPage {
	public static WebElement element = null;
	
	public static WebElement login_username(WebDriver driver){
		element = driver.findElement(By.id("idInput"));
		return element;
	}
	
	public static WebElement login_password(WebDriver driver){
		element = driver.findElement(By.id("pwdInput"));
		return element;
	}
	
	public static WebElement login_Button(WebDriver driver){
		element = driver.findElement(By.id("loginBtm"));
		return element;
	}
}

