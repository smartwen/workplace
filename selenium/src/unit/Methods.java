package unit;
/*@Test�����Է���
(A)(expected=XXEception.class)
(B)(timeout=xxx)
@Ignore:�����ԵĲ��Է���
@Before:ÿһ�����Է���֮ǰ���С�
@After:ÿһ�����Է���֮�����С�
@BefreClass���в��Կ�ʼ֮ǰ���С�
@AfterClass���в��Խ��֮�����С�*/
import static org.junit.Assert.*;
import static org.hamcrest.Matcher.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.After;
import org.junit.Ignore;
import unit.Count;
public class Methods {
	@BeforeClass //�����з�������֮ǰ���С�
	public static void beforeClass(){
	System.out.println("-------------------beforeClass");
	}
	@AfterClass //�����з�������֮������
	public static void afterClass(){
	System.out.println("-------------------afterClass");
	}
	@Before //ÿ�����Է�������֮ǰ����
	public void before(){
	System.out.println("=====before");
	}
	@After //ÿ�����Է�������֮������
	public void after(){
	System.out.println("=====after");
	}
	

	@Test
	public void testAdd(){
	int z=new Count().add(5,3);
	assertEquals(8,z);
	System.out.println("testRunthrough");
	}
	@Test()
	public void testdivision(){
	System.out.println("inTestDivision");
	}
	@Ignore //��ʾ��������ǲ������е�
	@Test
	(expected=java.lang.ArithmeticException.class,timeout=100)
	//timeout��ʾҪ�� ������100������������ɣ����򱨴�
	
	public void testDivide(){
	int z=new Count().add(5, 3);
}
}
