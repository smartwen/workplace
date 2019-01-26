package FileDemo;
import java.io.File;
import java.io.IOException;

/*
 * 2级目录的文件创建
 * c://haha/test.txt
 *  mkdirs()创建此抽象路径名指定的目录，包括所有必需但不存在的父目录 
 *  mkdir()表示一次只能创建一个目录
 */
public class FileDemo2 {
	
	public static void main(String[] args) {
		File parent=new File("c:"+File.separator+"haha"+File.separator+"hehe");
		File child=new File(parent,"test.txt");
		
		try {
			if(!parent.exists())
			{	
				//parent.mkdir();
				parent.mkdirs();
				child.createNewFile();
				System.out.println("文件创建成功");
			}else
			{
				child.createNewFile();
			}
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	/*	child.delete();
		System.out.println("文件已删除");*/
		System.out.println("获得文件的绝对路径："+child.getAbsolutePath());
		System.out.println("获取文件的父目录:"+child.getParent());
		System.out.println("判断是否为一个文件"+child.isFile());
	}
}
