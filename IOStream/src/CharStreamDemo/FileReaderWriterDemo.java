package CharStreamDemo;
//�ļ��ַ���Ĭ����ʹ�û�����  w.flush()  ֻ�ܶ�д�ַ�
import java.io.*;
import java.nio.CharBuffer;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		Writer w = null ;
		Reader r = null;
		String s="��ǰ���¹�\r\n���ǵ���˪\r\n��ͷ������\r\n��ͷ˼����";
		
		File file=new File("c:"+File.separator+"test.txt");
		try {
			w=new FileWriter(file);
			w.write(s.toCharArray());
			//w.close();
			w.flush();
			
			r=new FileReader(file);
			//д�����ж�ȡ
			char[] buff=new char[(int) file.length()];
			r.read(buff);//���ļ����뻺����
			String temp=new String(buff);
			System.out.println(temp);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
