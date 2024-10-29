package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pathh {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement txtUserName = driver.findElement(By.xpath("//input[@type='text']"));
		//txtUserName.sendKeys("greenstech@gmail.com");
		
		//WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		//txtPassword.sendKeys("12345");
		
		//WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		//btnLogin.click();
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
	}

}
