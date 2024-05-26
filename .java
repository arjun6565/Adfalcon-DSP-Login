package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Adfalcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "C:\\Arjun\\chromedriver-win64\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adfalcon.com/en/User/Login");	
		
		try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		WebElement UserName = driver.findElement(By.id("txtUsername"));
		UserName.sendKeys("vaibhav@arabyads.com");
		
		WebElement Password= driver.findElement(By.id("txtPassword"));
		Password.sendKeys("Araby@ds@2023");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
