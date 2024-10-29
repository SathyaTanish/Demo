package org.tcs.test.login;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xppath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("greenstech@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("78654");
		
		@Nullable
		String attribute = txtUsername.getAttribute("value");
		System.out.println(attribute);
		
		@Nullable
		String attribute2 = txtPassword.getAttribute("value");
		System.out.println(attribute2 );
		
		
	}
	
	

}
