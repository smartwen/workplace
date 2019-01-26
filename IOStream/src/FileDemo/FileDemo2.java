package FileDemo;
import java.io.File;
import java.io.IOException;

/*
 * 2��Ŀ¼���ļ�����
 * c://haha/test.txt
 *  mkdirs()�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼ 
 *  mkdir()��ʾһ��ֻ�ܴ���һ��Ŀ¼
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
				System.out.println("�ļ������ɹ�");
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
		System.out.println("�ļ���ɾ��");*/
		System.out.println("����ļ��ľ���·����"+child.getAbsolutePath());
		System.out.println("��ȡ�ļ��ĸ�Ŀ¼:"+child.getParent());
		System.out.println("�ж��Ƿ�Ϊһ���ļ�"+child.isFile());
	}
}
