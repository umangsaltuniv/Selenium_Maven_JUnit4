package maven.selenium;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumTest {

	@Test
	public void test01() {
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("https://www.google.com");
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
		driver.quit();
		
		
		
		
	}

}
