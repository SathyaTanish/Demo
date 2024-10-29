package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deeb {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement btnCreate = driver.findElement(By.partialLinkText("Create"));
		btnCreate.click();
		Thread.sleep(1500);
		WebElement btnMale = driver.findElement(By.xpath("//input[@value='2']"));
		btnMale.click();
		
		
		
		
		
		
	}
	
	
	

}
