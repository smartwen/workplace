package FileDemo;
import java.io.File;
/*
 * listFiles()����һ������·��������  ��ʾ��·���������ļ�
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
			System.out.println(file2.length()+"�ֽ�");
		}
	}
}
