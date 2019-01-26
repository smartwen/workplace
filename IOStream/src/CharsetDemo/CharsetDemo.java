package CharsetDemo;

import java.io.*;

//×Ö·û±àÂë
public class CharsetDemo {
	
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"readme.txt");
		InputStream in=null;
		
		try {
			in=new FileInputStream(file);
			byte[] buff =new byte[(int) file.length()];
			in.read(buff);
			
			 String s=new String(buff,"UTF-8");
			System.out.print(s);
			
			int len=0;
		
			while((len=in.read(buff))!=-1)
			{
				
				String  s1=new String(buff,"UTF-8");		
				System.out.println(s1);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
