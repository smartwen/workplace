package FileDemo;
import java.io.File;
/*
 * listFiles()返回一个抽象路径数组名  表示此路径下所有文件
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"haha"+File.separator+"hehe");
		if(file.exists())
		{
			if(file.isDirectory())
			{
				File[] list=file.listFiles();
				for(int i=0;i<list.length;i++)
				{
					System.out.println(list[i].getName());
				}
			}
		}
		File file2=new File(file,"test.txt");
		if(file2.exists())
		{
			System.out.println(file2.length()+"字节");
		}
	}
}
