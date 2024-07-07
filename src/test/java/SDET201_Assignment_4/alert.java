package SDET201_Assignment_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {
	WebDriver driver;
	
	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}
	
@Test
public void alertt() throws InterruptedException {
	driver.findElement(By.id("alertBox")).click();
	
	Alert A = driver.switchTo().alert();
	
	A.accept();
	//confirmBox
	//promptBox
	Thread.sleep(3000);
	driver.findElement(By.id("confirmBox")).click();
	
	Alert B = driver.switchTo().alert();
	
	B.dismiss();
	Thread.sleep(3000);

	
	driver.findElement(By.id("promptBox")).click();
	
	Alert C = driver.switchTo().alert();
	C.sendKeys("Pratik");
	C.accept();
	
	
	
	
	
	
}


}
