package vtigerContacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_modules {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
		
		WebElement user=driver.findElement(By.xpath("//input[@name='user_name']"));
		user.sendKeys("admin");
		
		WebElement pswd=driver.findElement(By.xpath("//input[@name='user_password']"));
		pswd.sendKeys("manager");
		
		WebElement login=driver.findElement(By.id("submitButton"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement ctab=driver.findElement(By.linkText("Contacts"));
		ctab.click();

	}
}
