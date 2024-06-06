package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameterTest {
	@Test
	public void recieveData() {
		String URL = System.getProperty("url");
		String EMAIL = System.getProperty("email");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
	}
}
