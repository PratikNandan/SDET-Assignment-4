package SDET201_Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {
	WebDriver driver;
	
@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	driver.manage().window().maximize();

	
}

@Test
public void frames() {
	driver.switchTo().frame("courses-iframe");
	
	WebElement clk =driver.findElement(By.linkText("Mentorship"));
	clk.click();
	
	driver.switchTo().defaultContent();
	driver.navigate().back();
}


}
