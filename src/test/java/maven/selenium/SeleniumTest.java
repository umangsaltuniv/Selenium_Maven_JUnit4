package maven.selenium;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	@Test
	public void test01() {
		String driverPath = System.getProperty("user.dir")
							+ File.separator
							+ "drivers"
							+ File.separator
							+ "chromedriver";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		
		driver.quit();
		
		
		
		
	}

}
