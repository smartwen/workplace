package CharStreamDemo;

import java.io.*;

//ʹ�ô�������ַ���ʵ�ֵ������ļ��Ŀ���
public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		BufferedWriter bw = null ;
		BufferedReader br = null;
		//String s="��ǰ���¹�\r\n���ǵ���˪\r\n��ͷ������\r\n��ͷ˼����";
		
		File src=new File("c:"+File.separator+"test.txt");
		File des=new File("c:"+File.separator+"des.txt");		
		try {
	
			br=new BufferedReader(new FileReader(src));
			bw=new BufferedWriter(new FileWriter(des));
			char[] temp=new char[10];
			while((br.read(temp))!=-1)
			{
				bw.write(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
