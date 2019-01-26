package ByteStreamDemo;

import java.io.*;

//ʹ���ļ�������ʫд���ı��ļ�����
public class FileStreamDemo {
	
	public static void main(String[] args) {
		OutputStream out = null ;
		InputStream in = null;
		String s="��ǰ���¹�\r\n���ǵ���˪\r\n��ͷ������\r\n��ͷ˼����";
		
		File file=new File("c:"+File.separator+"test.txt");
		try {
			out=new FileOutputStream(file);
			byte[] b=s.getBytes();
			out.write(b);
			
			in=new FileInputStream(file);
			//д�����ж�ȡ
			byte[] buff=new byte[(int) file.length()];
			in.read(buff);//���ļ����뻺����
			String temp=new String(buff);
			System.out.println(temp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally
		{
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
