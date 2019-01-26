/**
4.12 上传文件
普通上传：普通的附件上传是将本地文件的路径作为一个值放在input标签中，通过form表单将这个值提
交给服务器。
插件上传：一般是指基于Flash、JavaScript或Ajax等技术所实现的上传功能。
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
		// TODO 自动生成的方法存根
		WebDriver driver=new FirefoxDriver();
		String baseUrl = "file:///F:/studyBook/html/";
		//File file=new File("E:/jase/upfile.html");
		String filePath = baseUrl+"upfile.html";
		//String filePath=file.getAbsolutePath();
		driver.get(filePath);
		//定位上传按钮，添加本地文件
		driver.findElement(By.name("file")).sendKeys("D:\\upload_file.txt");
		Thread.sleep(5000);
		driver.quit();
	}

}
