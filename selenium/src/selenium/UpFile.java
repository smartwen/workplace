/**
4.12 �ϴ��ļ�
��ͨ�ϴ�����ͨ�ĸ����ϴ��ǽ������ļ���·����Ϊһ��ֵ����input��ǩ�У�ͨ��form�������ֵ��
������������
����ϴ���һ����ָ����Flash��JavaScript��Ajax�ȼ�����ʵ�ֵ��ϴ����ܡ�
 * 
 */
package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator
 * upfile.html
 * <html>
<head>
<meta http-equiv="content-type"content="text/html;charset=utf-8"/>
<title>upload_file</title>
<link href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css"rel="stylesheet"/>
</head>
<body>
<div class="row-fluid">
<div class="span6well">
<h3>upload_file</h3>
<input type="file"name="file"/>
</div>
</div>
</body>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.js"></script>
</html>
 *
 */
public class UpFile {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		WebDriver driver=new FirefoxDriver();
		String baseUrl = "file:///F:/studyBook/html/";
		//File file=new File("E:/jase/upfile.html");
		String filePath = baseUrl+"upfile.html";
		//String filePath=file.getAbsolutePath();
		driver.get(filePath);
		//��λ�ϴ���ť����ӱ����ļ�
		driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
		Thread.sleep(5000);
		driver.quit();
	}

}
