package grid;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class seleniumRC {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "https://www.baidu.com/");
		selenium.start();
	}

	@Test
	public void testSeleniumRC() throws Exception {
		selenium.open("/");
		selenium.click("id=lg");
		selenium.click("id=kw");
		selenium.type("id=kw", "selenium");
		selenium.click("id=su");
		selenium.click("id=su");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
