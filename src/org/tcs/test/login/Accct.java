package org.tcs.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Accct {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://traininginchennai.in/selenium-training-in-chennai.html");
		
		//WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		//Actions a = new Actions(driver);
		
		//a.moveToElement(course).perform();
		
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		//WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]")); 
		
		//Actions a = new Actions(driver);
		//a.dragAndDrop(drag, drop).perform();
		
		driver.get("https://www.google.com/");
		
		WebElement google = driver.findElement(By.id("APjFqb"));
		google.sendKeys("Tanish");
		
		
		Actions a = new Actions (driver);
		//a.contextClick(google).perform();
		a.doubleClick(google).perform();
		
		
		
		
		
		
		
		
		

	}

}
