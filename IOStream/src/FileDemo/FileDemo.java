package FileDemo;
import java.io.File;
import java.io.IOException;

/*
 * File 类的详细用法
 */
public class FileDemo {
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"test.txt");//支持跨平台性标准写法
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("系统目录默认的分隔符:"+File.separatorChar);
	}
}
