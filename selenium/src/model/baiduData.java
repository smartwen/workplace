package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*百度搜素的关键字以数组的形式进行参数化
创建一个data.txt文件
selenium
webdriver
Java*/
public class baiduData {

	//写一个方法
	public static void baiduTest(String testdata) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys(testdata);
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		driver.close();
	}
	//写方法readTxtFile()实现文件的循环读取
	public static void readTxtFile(String filePath) {
		try{
			String encoding="GBK";
			File file=new File(filePath);
			if(file.isFile() && file.exists()){
				InputStreamReader read=new InputStreamReader(new FileInputStream(file),encoding);
				BufferedReader bufferedReader= new BufferedReader(read);
				String lineTxt = null;
				//每行都读取数据
				while((lineTxt = bufferedReader.readLine())!=null){
					System.out.println(lineTxt);
					baiduTest(lineTxt);
				}
				read.close();
			}else{
				System.out.println("找不到指定的文件");
			}
		}catch(Exception e){
			System.out.println("读取文件内容错误");
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String filePath="file:///F:/studyBook/html/data.txt";
		readTxtFile(filePath);
	}

}
