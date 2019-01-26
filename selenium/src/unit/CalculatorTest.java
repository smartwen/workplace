package unit;
//����JUnit���Կ�ܣ���Eclipse��Package Explorer�����Ҽ�������൯���˵���ѡ��New �� JUnit Test Case��
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.substract(10);
		calculator.substract(2);
		assertEquals(8,calculator.getResult());
	}
	@Ignore("Multipy() Not yet implemented")
	@Test
	public void testMultiply() {
		
	}

	@Test
	public void testDivide() {
		calculator.divide(8);
		calculator.divide(2);
		assertEquals(4,calculator.getResult());
	}
//���д��� run as a junit test
}
