package unit;
/*junit����ṩ��һЩ�������ڲ��Խ�����ж�
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
	//�ж�һ�����Ƿ�Ϊ����
	public static boolean prime(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			//ƽ��������sqrt  rounded positive square root of a double value. Special cases: 
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
