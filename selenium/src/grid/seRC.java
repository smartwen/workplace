package grid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.*;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class seRC {
	private Selenium selenium;
	
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws Exception{
		selenium = new DefaultSelenium("localhost",4444,"*firefox","http://www.baidu.com/");
		selenium.start();
	}
	@Test
	public void testSeRc() throws Exception{
		selenium.open("/");
		selenium.type("id=kw","selenium");
		selenium.click("id=su");
	}
	@After
	public void tearDown() throws Exception{
		selenium.stop();
	}
}
