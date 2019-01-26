package unit;
/*junit框架提供了一些方法用于测试结果的判断
assertArrayEquals(expecteds,actuals)
assertEquals(expected,actual)*/
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class testMethod {
/*	@Test 
	public void test_case(){
		int number = 10;
		assertEquals(number,10);*/
	//判断一个数是否为素数
	public static boolean prime(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			//平方根函数sqrt  rounded positive square root of a double value. Special cases: 
			if(n % i ==0)
				return false;
		}return true;
	}
	
@Test
public void test_case(){
	int n=7;
	assertTrue(testMethod.prime(n));
}
	
}
