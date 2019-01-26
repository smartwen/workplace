package mail.test.publics;

import org.openqa.selenium.WebDriver;

import mail.test.page.LoginPage;

public class LoginUser {
	//��½����
	public static void login(WebDriver driver,String username,String password){
		LoginPage.login_userName(driver).clear();
		LoginPage.login_userName(driver).sendKeys(username);
		LoginPage.login_passWord(driver).clear();
		LoginPage.login_passWord(driver).sendKeys(password);
		LoginPage.login_button(driver).click();
	}
	
	//��½�û���ȡ��Ϣ
	public static String login_user_info(WebDriver driver){
		String  text= LoginPage.login_user(driver).getText();
		return text;
	}
	//��ȡ��½������ʾ
	public static String login_error_info(WebDriver driver){
		String text = LoginPage.login_Error_Hint(driver).getText();
		return text;
	}
	//�˳�����
	public static void logout(WebDriver driver){
		LoginPage.logout_button(driver);
	}
}
