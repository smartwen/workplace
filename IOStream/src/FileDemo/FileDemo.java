package FileDemo;
import java.io.File;
import java.io.IOException;

/*
 * File �����ϸ�÷�
 */
public class FileDemo {
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"test.txt");//֧�ֿ�ƽ̨�Ա�׼д��
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ϵͳĿ¼Ĭ�ϵķָ���:"+File.separatorChar);
	}
}
