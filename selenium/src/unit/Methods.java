package unit;
/*@Test：测试方法
(A)(expected=XXEception.class)
(B)(timeout=xxx)
@Ignore:被忽略的测试方法
@Before:每一个测试方法之前运行。
@After:每一个测试方法之后运行。
@BefreClass所有测试开始之前运行。
@AfterClass所有测试结果之后运行。*/
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
	@BeforeClass //在所有方法运行之前运行。
	public static void beforeClass(){
	System.out.println("-------------------beforeClass");
	}
	@AfterClass //在所有方法运行之后运行
	public static void afterClass(){
	System.out.println("-------------------afterClass");
	}
	@Before //每个测试方法运行之前运行
	public void before(){
	System.out.println("=====before");
	}
	@After //每个测试方法运行之后运行
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
	@Ignore //表示这个方法是不被运行的
	@Test
	(expected=java.lang.ArithmeticException.class,timeout=100)
	//timeout表示要求 方法在100毫秒内运行完成，否则报错
	
	public void testDivide(){
	int z=new Count().add(5, 3);
}
}
